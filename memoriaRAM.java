package ProyectoTercerTrimestre;
public class memoriaRAM extends hardware{
String capacidad, tipoMemoria;

//capacidad= 8GB, 16GB etc
//tipoMemoria= DDR4, DDR3 etc
	public memoriaRAM() {
		// TODO Auto-generated constructor stub
	}
	
	public memoriaRAM (String nombre, String marca, String precioVenta, String precioCompra, String gama, String capacidad, String tipoMemoria) {
		super(nombre, marca, precioVenta, precioCompra, gama);
	this.tipoMemoria=tipoMemoria;
	this.capacidad=capacidad;
		
	}
	public  String toString() {
		return " El producto seleccionado es una memoria RAM de gama " +gama+"  y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n Capacidad: "+capacidad+"\n Tipo de la memoria: "+tipoMemoria;
	}
	 protected String toStringAdmin() {
		 return "[ADMIN] El producto seleccionado es una memoria RAM  de gama " +gama+"  y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n Capacidad: "+capacidad+"\n Tipo de la memoria: "+tipoMemoria+ "\n Precio-proveedor: "+precioCompra;
	 }

	protected String getCapacidad() {
		return capacidad;
	}

	protected void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	protected String getTipoMemoria() {
		return tipoMemoria;
	}

	protected void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}
	
	
	  

}
