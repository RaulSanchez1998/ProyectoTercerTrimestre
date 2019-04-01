package Proyecto.ProyectoTercerTrimestre;

public class gestionCliente {

	Peticiones pedir = new Peticiones();

	public gestionCliente() {

	}

	private Cliente modificarAdmin(String aModificar, Cliente Cliente) {
		boolean salir = true;
		do {
		switch (aModificar) {

		case "Nombre":
			System.out.println("Introduce el nuevo nombre");
			String texto = pedir.pedirTXT();
			Cliente.setNombre(texto);

			break;

		case "Contrasena":
			System.out.println("Introduce la nueva contraseña");
			texto = pedir.pedirTXT();
			Cliente.setContrasena(texto);

			break;

		case "Correo":
			System.out.println("Introduce el nuevo correo");
			texto = pedir.pedirTXT();
			Cliente.setCorreo(texto);

			break;

		case "Salir":
			System.out.println("Saliendo");
			salir = false;

		default:
			System.out.println("Introduce una opcion correcta");
			break;
		}
		}while(!salir);
		return Cliente;

	}
}
