package robot_RENO;

public class Start {

	public static void main(String[] args) {
		// Batallas de robots. R.E.N.O.

		Robot r2d2 = new Robot(""); 
		r2d2.setNombre("R2D2");
		/*r2d2.vidaInicio();
		r2d2.generarAtaque();
		r2d2.generarDefensa();*/
		
		Robot c3po = new Robot("");
		c3po.setNombre("C3PO");
		/*c3po.vidaInicio();
		c3po.generarAtaque();
		c3po.generarDefensa();*/
		

		System.out.println(r2d2);
		System.out.println(c3po);
		
		Robot turno1 = r2d2.lucha(c3po);
		Robot turno2 = c3po.lucha(r2d2);
		Robot turno3 = turno1.lucha(turno2);
		Robot turno4 = turno2.lucha(turno3);
		

		System.out.println(turno1);
		System.out.println(turno2);
		System.out.println(turno3);
		System.out.println(turno4);
	}

}
