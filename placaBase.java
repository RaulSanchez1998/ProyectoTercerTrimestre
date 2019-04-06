package ProyectoTercerTrimestre;
public class placaBase extends hardware {
String chipset,formato;
	public placaBase() {
		// TODO Auto-generated constructor stub
	}
	
	
	public placaBase (String nombre, String marca, String precioVenta, String precioCompra, String gama, String chipset, String formato) {
		super(nombre, marca, precioVenta, precioCompra, gama);
		this.chipset=chipset;
		this.formato=formato;
		
	}
	
	public  String toString() {
		return " El producto seleccionado es una placa base de gama " +gama+"  y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n ChipSet: "+chipset+"\n Formato: "+formato;
	}
	 protected String toStringAdmin() {
		 return "[ADMIN] El producto seleccionado es una placa base de gama " +gama+"  y sus caracteristicas son: \n Marca: " +marca+ " \n Modelo: " +nombre +" \n Precio: "+precioVenta+ "\n ChipSet: "+chipset+"\n Formato: "+formato+ "\n Precio-proveedor: "+precioCompra;
	 }


	protected String getChipset() {
		return chipset;
	}


	protected void setChipset(String chipset) {
		this.chipset = chipset;
	}


	protected String getFormato() {
		return formato;
	}


	protected void setFormato(String formato) {
		this.formato = formato;
	}
	 
	 

}
