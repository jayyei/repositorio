package sanchez.jay.programaciongenerica;

public class EjemploMetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombresPersonas[] = {"Sara", "Antonio", "Maria"};
		System.out.println(ExaminaArrays.getMenor(nombresPersonas));
		
	}

}

class ExaminaArrays{
	
	// Porque T extends Comparable? T sera una clase que implementa Comparable, pero de alguna u otra manera T heredo de comparable
	public static <T extends Comparable> T getMenor(T[] elArray) { //un metodo generico se puede crear en cualquier lugar, no precisamente en una clase genercia, que una clase sea generica no significa que lo sea por tener metodos genericos, de hecho esto no se relaciona en nada
		//el parametro entre los corchetes de tipo diamante se utiliza para especificar el tipo de dato el cual se empleara, se crea una referencia de ese tipo y el metodo en sus paramteros o en el return ya entiende que es el T y lo considera como un tipo de dato
		T objetoMenor = elArray[0];
		
		for (int i =1; i<elArray.length; i++) {
			if(objetoMenor.compareTo(elArray[i])>0) {
				objetoMenor = elArray[i];
			}
		}
		
		return objetoMenor;
	}
}