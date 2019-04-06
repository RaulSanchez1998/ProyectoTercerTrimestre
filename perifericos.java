package ProyectoTercerTrimestre;
abstract class perifericos extends productos {
String tipo;
//tipo= inalambrico o con cable
	public perifericos() {
		// TODO Auto-generated constructor stub
	}
	
	public perifericos(String nombre, String marca, String precioVenta, String precioCompra, String tipo) {
		super(nombre, marca, precioVenta, precioCompra);
		this.tipo=tipo;
		
	}
	protected String getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract String toString();
	 abstract String toStringAdmin();
}
