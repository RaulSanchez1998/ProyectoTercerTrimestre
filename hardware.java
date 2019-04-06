package ProyectoTercerTrimestre;
abstract class hardware extends productos{
String gama;
//Gama= Alta, media o baja
	public hardware() {
		// TODO Auto-generated constructor stub
	}
	public hardware(String nombre, String marca, String precioVenta, String precioCompra, String gama) {
		super(nombre, marca, precioVenta, precioCompra);
		this.gama=gama;
		
	}
public abstract String toString();
 abstract String toStringAdmin();
protected String getGama() {
	return gama;
}
protected void setGama(String gama) {
	this.gama = gama;
}
 
 
}
/*protected void modificarRaton();
protected void modificarTeclado();
protected void modificarPlacaBase();
protected void modificarRAM();
protected void modificarTGrafica();
protected void modificarProcesador();
protected void modificarDiscoDuro();
protected void modificarFuenteAlimentacion();
*/
