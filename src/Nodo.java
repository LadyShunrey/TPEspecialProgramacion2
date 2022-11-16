

public class Nodo<T>  {
	private T valor;
	private Nodo siguiente;  
	
	
	public Nodo (T valor) {
		this.valor=valor;
	}
	
	public void enlazarSiguiente(Nodo n) {
		siguiente=n;
	}
	
	public Nodo obtenerSiguiente() {
		return siguiente;
	}
	
	public T obtenerValor() {
		return valor;
	}

}
