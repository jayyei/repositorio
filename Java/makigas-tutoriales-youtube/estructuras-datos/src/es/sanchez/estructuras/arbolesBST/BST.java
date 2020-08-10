package es.sanchez.estructuras.arbolesBST;


//En un metodo generico, la firma primero incluye los modificadores de acceso, despues <T,R> indica los tipos
//Y al final el tipo de dato que devuelve(puede incluso devolver un generico definido en los <>
//Ejemplo public <T,Y> List<T> minameis(T parameter, Y parameter2)...

// En una clase despues del nombre van los <>
// public class GenericsType<T>

//Recuerda que tenemos las wildcards que son basicamente para indicar cualquiera
// Ejemplo: cualquier tipo que sea padre de Integer <? super Integer>
// Ejemplo: cualquiere tipo que sea hijo (o herede) de Number <? extends Number>

public class BST implements IBST<Empleado> {

	private Empleado valor;
	private BST left, right; //Se considera entonces que es un arbol con referencias a otros arboles
	private BST padre;
	
	@Override
	public void insertar(Empleado empl) {
		insertarImpl(empl, null);
	}
	
	private void insertarImpl(Empleado empl, BST padre) {
		if(valor == null) {
			this.valor = empl;
			this.padre = padre;
		}else {
			if(empl.compareTo(valor)<0) {
				if(left == null) left = new BST();
				this.left.insertarImpl(empl, this);
			}else if(empl.compareTo(valor)>0) {
				if(right == null) right = new BST();
				right.insertarImpl(empl, this);
			}else {
				throw new RuntimeException("Insertando elemento duplicado");
			}
		}
	}

	@Override
	public boolean existe(int id) {
		if(valor != null) {
			if(id == valor.getId()) {
				return true;
			}else if(id < valor.getId()) {
				if(left == null)
					return false;
				return left.existe(id);
			}else {
				if(right == null)
					return false;
				return right.existe(id);
			}
		}
		return false;
	}

	@Override
	public Empleado obtener(int id) {
		if(valor != null) {
			if(id == valor.getId()) {
				return valor;
			}else if(id < valor.getId()) {
				if(left == null)
					return null;
				return left.obtener(id);
			}else {
				if(right == null)
					return null;
				return right.obtener(id);
			}
		}
		return null;
	}

	@Override
	public boolean esHoja() {
		return valor != null && left == null && right == null;
	}

	@Override
	public boolean esVacio() {
		return this.valor == null;
	}

	@Override
	public void preorden() { //Forma de imprimir: raiz, izquierdo y derecho
		if(valor != null) {
			System.out.println(valor);
			if(left != null) {
				left.preorden();
			}
			if(right != null) {
				right.preorden();
			}
		}
	}

	@Override
	public void inorden() { //Forma de imprimir izquierdo raiz y dercho
		if(valor != null) {
			if(left != null) {
				left.inorden();
			}
			System.out.println(valor);
			if(right != null) {
				right.inorden();
			}
		}
	}

	@Override
	public void postorden() {//izquierdo, derecho y central
		if(valor != null) {
			if(left != null) {
				left.postorden();
			}
			if(right != null) {
				right.postorden();
			}
			System.out.println(valor);
		}
	}

	private BST minimo() {
		if(left != null && !left.esVacio() ) {
			return left.minimo();
		}else {
			return this;
		}
	}
	
	private void eliminarImpl(int id) {
		if(left != null && right != null) {
			//Se busca el minimo del lado derecho o el maximo del lado izquierdo
			BST minimo = right.minimo();
			this.valor = minimo.valor;
			right.eliminar(minimo.valor.getId());
		}else if(left != null || right != null) {
			BST sustituto = left != null ? left : right;
			this.valor = sustituto.valor;
			this.left = sustituto.left;
			this.right = sustituto.right;
		}else { //Eliminar con cero hijos
			if(padre != null) {
				if(this == padre.left) padre.left = null;
				if(this == padre.right) padre.right = null;
				padre = null;
			}
			valor = null;
		}
	}
	
	@Override
	public void eliminar(int id) {
		if(valor != null) {
			if(id == valor.getId()) {
				eliminarImpl(id);
			}else if( id < valor.getId() && left != null ) {
				left.eliminar(id);
			} else if( id> valor.getId() && right != null ){
				right.eliminar(id);
			}
		}
	}

	public Empleado getValor() {
		return valor;
	}

	public void setValor(Empleado valor) {
		this.valor = valor;
	}

	public BST getLeft() {
		return left;
	}

	public void setLeft(BST left) {
		this.left = left;
	}

	public BST getRight() {
		return right;
	}

	public void setRight(BST right) {
		this.right = right;
	}

	
}
