package ListaEnlazada;

public class Principal {
	public static void main(String[] args) {
		Lista lista=new Lista();

		Libro libro=new Libro("Libro 1, nombre principio","autor libro","codigo");
		lista.insertarPrincipio(libro);
		libro=new Libro("Libro 2, nuevo libro","nuevo autor libro","11codigo");
		lista.insertarFinal(libro);
		lista.mostrarLista(libro);
                lista.contar();
		libro=new Libro("Libro 3, libro insertado","nuevo autor libro","11codigo");
		lista.insertarDespues(1, libro);
		System.out.println( lista.contar());
//		System.out.println( lista.obtener(1));
		lista.mostrarLista(libro);
	//	lista.eliminarLibro(2);
		
	}    
}
