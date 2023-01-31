package robot_RENO;

public class Batalla {

	
	//Operacion luchar Corregida
	//STATIC Aunque no exista un objeto batalla la operación existe
		public static Robot luchar(Robot robot0, Robot robot1) {
			
			//0-- ataca robot0
			//1-- ataca robot1
			int turno = (int)(Math.random()*2);
			
			while((robot0.vida > 0) && (robot1.vida > 0)) {
				
				int golpe = (int)(Math.random()*101);
				
				if(turno == 0) {
					
					//El golpe lo da this
					if(robot1.defensa < golpe) {
						
						//En protected
						robot1.vida -= robot0.ataque;
						//En private
						//robot1.setVida(robot1.getVida() - robot0.getAtaque() );
					}
					
					turno = 1;
				}
				
				else if(turno == 1) {
					
					//El golpe lo da otro
					if(robot0.defensa < golpe) {
						
						robot0.vida -= robot1.ataque;
					}
					
					turno = 0;
				}
				
				//IF Abreviado. Turno coge el valor dependiendo de si la pregunta es verdadera o no.
				turno = (turno == 0)? 1 : 0;
			}
			
			if(robot0.vida <= 0) {
				return robot1;
			}
			
			else return robot0;
		}
		
}
