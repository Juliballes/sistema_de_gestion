package hibernate.controladores;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate.main.model.Persona;

public class PersonaController {
	public String createPersona(String nombre, String apellido, String correo, String telefono, String tipo) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Persona.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			Persona persona = new Persona(nombre,apellido,correo,telefono,tipo);
			session.beginTransaction();
			session.persist(persona);
			session.getTransaction().commit();
			session.close();
			
			return "Persona creada";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Error al crear la Persona";
	}
	public Persona getPersona(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Persona.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Persona persona = new Persona();
		try {
			session.beginTransaction();
			persona = session.get(Persona.class, id);
			session.getTransaction().commit();
			sessionFactory.close();
			return persona;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

}
