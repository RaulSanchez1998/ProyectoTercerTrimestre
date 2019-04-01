package Proyecto.ProyectoTercerTrimestre;

public class Administrador extends Personas {

	public Administrador(){
		
	}
	
	public Administrador(String nombre, String contrasena, String correo) {
		super(nombre, contrasena, correo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", es un usuario Administrador";
	}	
	
	
}
