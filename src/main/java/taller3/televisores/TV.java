package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	static private int numTV=0;

	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		canal=1;
		volumen=1;
		precio=500;
		numTV ++;
	}
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		numTV=num;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(1<canal && canal<120 && estado == true ) {
			this.canal=canal;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int prec) {
		precio=prec;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void turnOn() {
		if ( estado == false) {
			estado = true;
		}
	}
	public void turnOff() {
		if ( estado == true) {
			estado = false;
		}
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(1<canal && canal<120 && estado == true ) {
			canal++;
		}
	}
	public void canalDown() {
		if(1<canal && canal<120 && estado == true ) {
			canal--;
		}
	}
	public void volumenUp() {
		if(0<volumen && volumen<7 && estado == true ) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(0<volumen && volumen<7 && estado == true ) {
			volumen--;
		}
	}
}
