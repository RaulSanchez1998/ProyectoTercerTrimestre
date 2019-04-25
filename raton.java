package ProyectoTercerTrimestre;
public class raton extends HExterno{
String dpi, tipoSensor;
	public raton() {
		// TODO Auto-generated constructor stub
	}

	public raton(String nombre, String marca, String precioVenta, String precioCompra, String tipo, String dpi, String tipoSensor) {
		super(nombre, marca, precioVenta, precioCompra, tipo);
		this.dpi=dpi;
		this.tipoSensor=tipoSensor;
		
	}
	
	
	public String toString() {
		
		
		
		return "El producto seleccionado es un raton "+tipo+" y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+" \n DPI: "+dpi+"\n Tipo del Sensor: "+tipoSensor;
	}
	
public String toStringAdmin() {
		
		//falta meter que le pase una persona a este metodo y si la persona es admin muestre el mensaje de abajo y si no lo es que te muestre un mensaje de error
		
		return "[ADMIN] El producto seleccionado es un raton "+tipo+" y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n DPI: "+dpi+"\n Tipo del Sensor: "+tipoSensor+ "\n Precio-proveedor: "+precioCompra;
	}

protected String getDpi() {
	return dpi;
}

protected void setDpi(String dpi) {
	this.dpi = dpi;
}

protected String getTipoSensor() {
	return tipoSensor;
}

protected void setTipoSensor(String tipoSensor) {
	this.tipoSensor = tipoSensor;
}



}
