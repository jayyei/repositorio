package calculadora;

public class Calculadora {

	private int ans;
	
	public Calculadora() {
		ans = 0;
	}
	
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v;
		return ans;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}
	
	public int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("No puedes dividir por zero");
		}
		ans = a/b;
		return ans;
	}
	
	public void operacionOptima() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Ejemplo de un bucle for infinito, si tarda demasiado sabemos que algo no esta bien
	public void operacionForOptima() {
		for(;;);
	}
	
}
