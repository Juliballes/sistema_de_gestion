package hibernate.controladores;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.main.model.Reclamo;

public class ReclamoController {
	public String createReclamo(String string, String tipo, String estado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Reclamo.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Reclamo reclamo = new Reclamo(tipo, estado);
			session.beginTransaction();
			session.persist(reclamo);
			session.getTransaction().commit();
			session.close();

			return "Reclamo creado";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al crear el reclamo";
	}

	public Reclamo getReclamo(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Reclamo.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Reclamo reclamo = new Reclamo();
		try {
			session.beginTransaction();
			reclamo = session.get(Reclamo.class, id);
			session.getTransaction().commit();
			sessionFactory.close();
			return reclamo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reclamo;
	}
}
