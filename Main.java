public class Main 
{
    public static void main(String[] args) 
    {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Libro l1 = new Libro("Harry Potter", "001", "JK Rowling", 1997);
        Libro l2 = new Libro("El Hobbit", "002", "Tolkien", 1937);
        Libro l3 = new Libro("Código Limpio", "003", "Robert Martin", 2008);

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);

        System.out.println("=== Préstamos ===");
        l1.prestar("Santiago");
        l1.prestar("Agostina");
        l1.devolver();

        System.out.println("\n=== Búsquedas ===");
        System.out.println("Libros con 'Harry': " + biblioteca.buscarPorTitulo("Harry").tamaño());
        System.out.println("Libros de 'Tolkien': " + biblioteca.buscarPorAutor("Tolkien").tamaño());

        System.out.println("\n=== Estadísticas ===");
        System.out.println(biblioteca.obtenerEstadisticas());
    }
}
