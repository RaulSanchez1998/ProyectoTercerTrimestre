package Proyecto.ProyectoTercerTrimestre;



public class gestionAdministrador {
	
	Peticiones pedir = new Peticiones();
	
	
	public gestionAdministrador() {

	}

	private Administrador modificarAdmin(String aModificar, Administrador Admin) {
		switch (aModificar) {

		case "Nombre":
			System.out.println("Introduce el nuevo nombre");
			String texto=pedir.pedirTXT();
			Admin.setNombre(texto);
			
			break;
			
		case "Contrasena":
			System.out.println("Introduce la nueva contraseña");
			texto=pedir.pedirTXT();
			Admin.setContrasena(texto);
			
			break;
			
		case "Correo":
			System.out.println("Introduce el nuevo correo");
			texto=pedir.pedirTXT();
			Admin.setCorreo(texto);
			
			break;
			
			default:
				System.out.println("Introduce una opcion correcta");
				break;
		}
		
		return Admin;
	}

}
