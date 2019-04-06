package ProyectoTercerTrimestre;
public class teclado extends perifericos {
String cherry, categoria;

//cherry=rojo marron o azul?

//categoria= mecanico gaming o membrana
	public teclado() {
		// TODO Auto-generated constructor stub
	}
	public teclado (String nombre, String marca, String precioVenta, String precioCompra, String tipo, String cherry, String categoria) {
		super(nombre, marca, precioVenta, precioCompra, tipo);
		this.cherry=cherry;
		this.categoria=categoria;
		
	}
	
	public String toString() {
		
		return "El producto seleccionado es un teclado "+tipo+" y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n switch: "+cherry+"\n Categoria: "+categoria;
		
		
	}
	protected String toStringAdmin() {
		//no se si podria ir en protected o tiene que ir en publico (en private no se puede)
		
		return "[ADMIN] El producto seleccionado es un teclado "+tipo+" y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n switch: "+cherry+"\n Categoria: "+categoria+ "\n Precio-proveedor: "+precioCompra;
		
		
	}
	protected String getCherry() {
		return cherry;
	}
	protected void setCherry(String cherry) {
		this.cherry = cherry;
	}
	protected String getCategoria() {
		return categoria;
	}
	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
