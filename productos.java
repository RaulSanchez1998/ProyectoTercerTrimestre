package ProyectoTercerTrimestre;
abstract class productos {
String nombre, marca, precioCompra, precioVenta;
	public productos() {
		// TODO Auto-generated constructor stub
	}
	public productos(String nombre, String marca, String precioCompra, String precioVenta) {
		this.nombre=nombre;
		this.marca=marca;
		this.precioCompra=precioCompra;
		this.precioVenta=precioVenta;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getPrecioCompra() {
		return precioCompra;
	}
	protected void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}
	protected String getPrecioVenta() {
		return precioVenta;
	}
	protected void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}

}
