package hibernate.main;




import hibernate.controladores.ReclamoController;


public class App {

	public static void main(String[] args) {
		//String personaResult = new PersonaController().createPersona("Mariela", "Autri", "m@gmail.com", "12345678", "Dueña");
		//System.out.println(personaResult);
		//String edificioResult = new EdificioController().createEdificio("E_dos", "Av.Lisar");
		//System.out.println(edificioResult);
		//String unidadResult = new UnidadController().createUnidad(12, "Alquilado");
		//System.out.println(unidadResult);
		
			String reclamoResult = new ReclamoController().createReclamo("09/02/2023","Mejora","En proceso");
			System.out.println(reclamoResult);
			
		
	}	

}
