package ProyectoTercerTrimestre;
public class caja extends hardware{
String formFuente, formPlaca;

//formFuente y formPlaca= formato de fuente y placa compatibles con dicha caja respectivamente
	public caja() {
		// TODO Auto-generated constructor stub
	}

	
	public caja (String nombre, String marca, String precioVenta, String precioCompra, String gama, String formFuente, String formPlaca) {
		super(nombre, marca, precioVenta, precioCompra, gama);
	this.formFuente=formFuente;
	this.formPlaca=formPlaca;
	
	}
	
	public String toString() {
		return"no esta hecho aun";
	}
	
	protected String toStringAdmin() {
		return"no esta hecho aun";
	}


	protected String getFormFuente() {
		return formFuente;
	}


	protected void setFormFuente(String formFuente) {
		this.formFuente = formFuente;
	}


	protected String getFormPlaca() {
		return formPlaca;
	}


	protected void setFormPlaca(String formPlaca) {
		this.formPlaca = formPlaca;
	}
	
	
}
