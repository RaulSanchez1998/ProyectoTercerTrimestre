package ProyectoTercerTrimestre;
public class tGrafica extends hardware{
String mGrafica, tipoMemoria;

//mGrafica=8GB, 16GB etc
//tipoMemoria=GDDR5 etc

	public tGrafica() {
		// TODO Auto-generated constructor stub
	}
	
	public tGrafica (String nombre, String marca, String precioVenta, String precioCompra, String gama, String mGrafica, String tipoMemoria) {
		super(nombre, marca, precioVenta, precioCompra, gama);
	this.tipoMemoria=tipoMemoria;
	this.mGrafica=mGrafica;
	}
	
public String toString() {
	return"sin hacer aun";
}

protected String toStringAdmin() {
	return "sin hacer aun";
}

protected String getmGrafica() {
	return mGrafica;
}

protected void setmGrafica(String mGrafica) {
	this.mGrafica = mGrafica;
}

protected String getTipoMemoria() {
	return tipoMemoria;
}

protected void setTipoMemoria(String tipoMemoria) {
	this.tipoMemoria = tipoMemoria;
}


}
