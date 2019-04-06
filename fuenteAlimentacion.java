package ProyectoTercerTrimestre;
public class fuenteAlimentacion extends hardware {
String potencia, tipo;
Boolean modular;

//potencia= en W
//tipo=ATX por ejemplo
//modular=true es si y false es no

	public fuenteAlimentacion() {
		// TODO Auto-generated constructor stub
	}
	
	public fuenteAlimentacion (String nombre, String marca, String precioVenta, String precioCompra, String gama, String potencia, String tipo, Boolean modular) {
		super(nombre, marca, precioVenta, precioCompra, gama);
	this.potencia=potencia;
	this.tipo=tipo;
	this.modular=modular;
	}
	
	public String toString() {
		return"no esta hecho aun";
	}
	
	protected String toStringAdmin() {
		return"no esta hecho aun";
	}

	protected String getPotencia() {
		return potencia;
	}

	protected void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected Boolean getModular() {
		return modular;
	}

	protected void setModular(Boolean modular) {
		this.modular = modular;
	}
	

}
