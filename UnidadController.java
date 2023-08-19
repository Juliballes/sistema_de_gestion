package hibernate.controladores;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.main.model.Unidad;

public class UnidadController {
	public String createUnidad(int numero, String estado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Unidad.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Unidad unidad = new Unidad(numero, estado);
			session.beginTransaction();
			session.persist(unidad);
			session.getTransaction().commit();
			session.close();

			return "Unidad creada";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al crear la unidad";
	}

	public Unidad getPersona(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Unidad.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Unidad persona = new Unidad();
		try {
			session.beginTransaction();
			persona = session.get(Unidad.class, id);
			session.getTransaction().commit();
			sessionFactory.close();
			return persona;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}
}
