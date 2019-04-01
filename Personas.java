package Proyecto.ProyectoTercerTrimestre;

public abstract class Personas {

	protected String Nombre,Contrasena,Correo;

	public Personas() {
		
	}
	
	
	public Personas(String nombre, String contrasena, String correo) {
		super();
		Nombre = nombre;
		Contrasena = contrasena;
		Correo = correo;
	}


	protected String getNombre() {
		return Nombre;
	}

	protected void setNombre(String nombre) {
		Nombre = nombre;
	}

	protected String getContrasena() {
		return Contrasena;
	}

	protected void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	protected String getCorreo() {
		return Correo;
	}

	protected void setCorreo(String correo) {
		Correo = correo;
	}

	@Override
	public String toString() {
		
		String mensaje="El usuario con nombre " + Nombre+ ". contraseña " + Contrasena + " y correo de contacto "+ Correo;
		
		return mensaje;
	}
	
	
}
