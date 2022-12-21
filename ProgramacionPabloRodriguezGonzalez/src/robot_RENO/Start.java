package robot_RENO;

public class Start {

	public static void main(String[] args) {
		// Batallas de robots. R.E.N.O.

		Robot r2d2 = new Robot("",0,0);
		r2d2.setNombre("r2d2");
		r2d2.setVida(85);
		r2d2.setAtaque(15);
		r2d2.generarDefensa();
		
		System.out.println(r2d2);
		
	}

}
