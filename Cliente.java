package Proyecto.ProyectoTercerTrimestre;

public class Cliente extends Personas {

	
	public Cliente(){
		
	}
	public Cliente(String nombre, String contrasena, String correo) {
		super(nombre, contrasena, correo);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()  + ", es un usuario cliente";
	}
	
	
	
	
}
