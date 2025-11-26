public class Biblioteca 
{
    private String nombre;
    private ListaEnlazada<Libro> libros;

    public Biblioteca(String nombre) 
    {
        this.nombre = nombre;
        this.libros = new ListaEnlazada<>();
    }

    public void agregarLibro(Libro libro) 
    {
        libros.agregar(libro);
    }

    public boolean eliminarLibro(String isbn) 
    {
        Nodo<Libro> actual = libros.getCabeza();

        while (actual != null) 
            {
            if (actual.getDato().getIsbn().equals(isbn)) 
            {
                libros.eliminar(actual.getDato());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public Libro buscarPorIsbn(String isbn) 
    {
        Nodo<Libro> actual = libros.getCabeza();

        while (actual != null) 
        {
            if (actual.getDato().getIsbn().equalsIgnoreCase(isbn)) return actual.getDato();

            actual = actual.getSiguiente();
        }
        return null;
    }

    public ListaEnlazada<Libro> buscarPorTitulo(String titulo) 
    {
        ListaEnlazada<Libro> resultado = new ListaEnlazada<>();

        Nodo<Libro> actual = libros.getCabeza();
        while (actual != null) 
        {
            if (actual.getDato().getTitulo().toLowerCase().contains(titulo.toLowerCase())) resultado.agregar(actual.getDato());

            actual = actual.getSiguiente();
        }
        return resultado;
    }

    public ListaEnlazada<Libro> buscarPorAutor(String autor) 
    {
        ListaEnlazada<Libro> resultado = new ListaEnlazada<>();

        Nodo<Libro> actual = libros.getCabeza();
        while (actual != null) 
        {
            if (actual.getDato().getAutor().toLowerCase().contains(autor.toLowerCase())) resultado.agregar(actual.getDato());

            actual = actual.getSiguiente();
        }
        return resultado;
    }

    public String obtenerEstadisticas() 
    {
        int total = libros.tamaño();

        int disponibles = 0;
        int prestados = 0;

        Nodo<Libro> actual = libros.getCabeza();

        while (actual != null)
        {
            if (actual.getDato().Disponible()) disponibles++;
            else prestados++;

            actual = actual.getSiguiente();
        }

        return "Total de libros: " + total + "\nDisponibles: " + disponibles + "\nPrestados: " + prestados;
    }
}
