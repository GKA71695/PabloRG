package robot_RENO;

public class Robot {
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	
	
	
	public Robot(String nombre, int vida, int ataque) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = generarDefensa();
	}
	
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
	
	
	public int generarDefensa() {
		
		int devolver;
		devolver = (int)(Math.random()*100);
		
		return devolver;
	}
	
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	
	

}
