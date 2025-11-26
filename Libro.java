public class Libro 
{
    private String titulo;
    private String isbn;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;
    private int vecesPrestado;

    private Pila<String> historialPrestamos;
    private Cola<String> listaEspera;

    public Libro(String titulo, String isbn, String autor, int añoPublicacion) 
    {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;

        this.disponible = true;
        this.vecesPrestado = 0;

        this.historialPrestamos = new Pila<>();
        this.listaEspera = new Cola<>();
    }

    public void prestar(String usuario) 
    {
        if (!disponible) 
        {
            listaEspera.encolar(usuario);
            System.out.println("Libro no disponible. " + usuario + " agregado a la lista de espera.");
            return;
        }

        disponible = false;
        vecesPrestado++;
        historialPrestamos.apilar(usuario);
        System.out.println("Libro prestado a " + usuario);
    }

    public void devolver() 
    {
        disponible = true;

        if (!listaEspera.estaVacia()) 
        {
            String siguiente = listaEspera.desencolar();
            prestar(siguiente);
        }
    }

    public String deshacerUltimoPrestamo() 
    {
        return historialPrestamos.desapilar();
    }

    public String getTitulo() 
    { 
        return titulo; 
    }
    public void setTitulo(String nuevoTitulo)
    {
        this.titulo = nuevoTitulo;
    }

    public String getIsbn() 
    {
         return isbn; 
    }
    public void setIsbn(String nuevoIsbn)
    {
        this.isbn = nuevoIsbn;
    }

    public String getAutor() 
    { 
        return autor; 
    }
    public void setAutor(String nuevoAutor)
    {
        this.autor = nuevoAutor;
    }

    public int getAñoPublicacion() 
    { 
        return añoPublicacion; 
    }
    public void setAñoPublicacion(int nuevoAñoPublicacion)
    {
        this.añoPublicacion = nuevoAñoPublicacion;
    }


    public boolean Disponible() 
    { 
        return disponible; 
    }
    public void setDisponible(boolean nuevoDisponible)
    {
        this.disponible = nuevoDisponible;
    }

    public int getVecesPrestado() 
    { 
        return vecesPrestado; 
    }
    public void setVecesPrestado(int nuevoVecesPrestado)
    {
        this.vecesPrestado = nuevoVecesPrestado;
    }
}