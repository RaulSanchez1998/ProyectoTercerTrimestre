package ProyectoTercerTrimestre;
public class gestionCajas {
peticiones pedir=new peticiones();
	public gestionCajas() {
		// TODO Auto-generated constructor stub
	}
	
	private caja modificarCaja(String aModificar, caja caja ) {
		 switch (aModificar) {
		 case "nombre": 
			 System.out.println("Introduce el nuevo nombre");
			 String texto=pedir.pedirTXT();
			 caja.setNombre(texto);
			
			 break;
		 case "marca":
			 System.out.println("Introduce la nueva marca");
			  texto=pedir.pedirTXT();
			 caja.setMarca(texto);
			 
			 break;
		 case"precioVenta":
			 System.out.println("Introduce el nuevo precio de venta al publico");
			  texto=pedir.pedirTXT();
			 caja.setPrecioVenta(texto);
			 
			 break;
			 
		 case "precioCompra":
			 System.out.println("Introduce el nuevo precio de compra (al almacén) [ESTE PRECIO NO SERA VISIBLE PARA LOS CLIENTES]");
			  texto=pedir.pedirTXT();
			 caja.setPrecioCompra(texto);
			 break;
			 
		 case "gama":
			 System.out.println("Introduce la nueva gama (ALTA/MEDIA/BAJA) ");
			  texto=pedir.pedirTXT();
			 caja.setGama(texto);
			 
			 break;
		 case "formFuente":
			 System.out.println("Introduce el nuevo formato de las fuentes compatibles");
			  texto=pedir.pedirTXT();
			 caja.setFormFuente(texto);
			 break;
		 		
			 
		 case "formPlaca":
			 
			 System.out.println("Introduce el nuevo formato de las Placas compatibles");
			  texto=pedir.pedirTXT();
			 caja.setFormPlaca(texto);
			 break;
		
		 
		 
		 default:
			 
			 
			 break;
		
			
		 
		 
		 
		 
		 }
		 return caja;
	 }

}
