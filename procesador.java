package ProyectoTercerTrimestre;
public class procesador extends hardware {
String fProcesador, nNucleos, socket;

//fProcesador=Frecuencia del prodesador (Ghz)
//nNucleos= numero de nucleos (ej:8)
//socket= 1151 por ejemplo


	public procesador() {
		// TODO Auto-generated constructor stub
	}
	public procesador (String nombre, String marca, String precioVenta, String precioCompra, String gama, String fProcesador, String nNucleos, String socket) {
		super(nombre, marca, precioVenta, precioCompra, gama);
	this.socket=socket;
	this.nNucleos=nNucleos;
	this.fProcesador=fProcesador;
	}
	
	public String toString() {
		return"no esta hecho aun";
	}
	
	protected String toStringAdmin() {
		return"no esta hecho aun";
	}
	protected String getfProcesador() {
		return fProcesador;
	}
	protected void setfProcesador(String fProcesador) {
		this.fProcesador = fProcesador;
	}
	protected String getnNucleos() {
		return nNucleos;
	}
	protected void setnNucleos(String nNucleos) {
		this.nNucleos = nNucleos;
	}
	protected String getSocket() {
		return socket;
	}
	protected void setSocket(String socket) {
		this.socket = socket;
	}
	
	
	
}
