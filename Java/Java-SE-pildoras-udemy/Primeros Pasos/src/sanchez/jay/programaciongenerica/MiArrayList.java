package sanchez.jay.programaciongenerica;

public class MiArrayList {

	private Object [] datosElemento;
	
	private int i = 0;
	
	public MiArrayList(int z) {
		datosElemento = new Object[z];
	}
	
	public Object getObjeto(int i) {
		return datosElemento[i];
	}
	
	public void agregaElemento(Object o) {
		datosElemento[i]=o;
		i++;
	}
}
