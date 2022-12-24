package robot_RENO;

public class Robot {
	
	//Atributos
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	
	
	//Constructor parametrizado
	public Robot(String nombre) {
		this.nombre = nombre;
		this.vida = vidaInicio();
		this.ataque = generarAtaque();
		this.defensa = generarDefensa();
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
	//Vida por defecto a 100
	public int vidaInicio() {
		
		this.vida = 100;
		
		return vida;
	}
	
	
	//Operación para generar un ataque aleatorio entre 0 y 20.
	public int generarAtaque() {
			
		int ataqueValido, devolver = 0;
		ataqueValido = (int)(Math.random()*100)/5;
			
		if(ataqueValido <= 20 && ataqueValido >= 0) {
				
			devolver = ataqueValido;
		}
			
		return devolver;
	}
	
	
	//Operación para generar una defensa aleatoria entre 0 y 100. 
	public int generarDefensa() {
		
		int devolver;
		devolver = (int)(Math.random()*100);
		
		return devolver;
	}
	
	
	@Override
	public String toString() {
		return "Robot [nombre= " + nombre + ", vida= " + vida +
				", ataque= " + ataque + ", defensa= " + defensa + "]";
	}
	
	

}
