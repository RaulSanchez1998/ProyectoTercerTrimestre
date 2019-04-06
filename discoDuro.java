package ProyectoTercerTrimestre;
public class discoDuro extends hardware {
String capacidad, tipo, velocidad;

//capacidad= en gb;
//tipo= SSD o HDD
//velocidad= en MBPS si es un SDD o en RPM si es un HDD


	public discoDuro() {
		// TODO Auto-generated constructor stub
	}
	
	public discoDuro (String nombre, String marca, String precioVenta, String precioCompra, String gama, String capacidad, String tipo, String velocidad) {
		super(nombre, marca, precioVenta, precioCompra, gama);
	this.capacidad=capacidad;
	this.tipo=tipo;
	this.velocidad=velocidad;
	}

	public String toString() {
		return"no esta hecho aun";
	}
	
	protected String toStringAdmin() {
		return"no esta hecho aun";
	}

	protected String getCapacidad() {
		return capacidad;
	}

	protected void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected String getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	
}
