package hibernate.controladores;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.main.model.Edificio;

public class EdificioController {
	public String createEdificio(String nombre, String direccion) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Edificio.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Edificio edificio = new Edificio(nombre, direccion);
			session.beginTransaction();
			session.persist(edificio);
			session.getTransaction().commit();
			session.close();

			return "Edificio creado";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al crear el Edificio";
	}

	public Edificio getPersona(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Edificio.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Edificio edificio = new Edificio();
		try {
			session.beginTransaction();
			edificio = session.get(Edificio.class, id);
			session.getTransaction().commit();
			sessionFactory.close();
			return edificio;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return edificio;
	}

}
