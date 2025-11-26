public class ListaEnlazada<B> 
{
    private Nodo<B> cabeza;
    private int tamaño;

    public ListaEnlazada() 
    {
        this.cabeza = null;
        this.tamaño = 0;
    }

    // Agregar al final
    public void agregar(B dato) 
    {
        Nodo<B> nuevo = new Nodo<>(dato);

        if (cabeza == null) 
        {
            cabeza = nuevo;
        } 
        else 
        {
            Nodo<B> actual = cabeza;
            while (actual.getSiguiente() != null) 
            {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public B obtener(int indice) 
    {
        if (indice < 0 || indice >= tamaño)
            throw new IndexOutOfBoundsException();

        Nodo<B> actual = cabeza;

        for (int i = 0; i < indice; i++) 
        {
            actual = actual.getSiguiente();
        }

        return actual.getDato();
    }

    public boolean eliminar(B dato) 
    {
        if (cabeza == null) return false;

        if (cabeza.getDato().equals(dato)) 
        {
            cabeza = cabeza.getSiguiente();
            tamaño--;
            return true;
        }

        Nodo<B> actual = cabeza;

        while (actual.getSiguiente() != null) 
        {
            if (actual.getSiguiente().getDato().equals(dato)) 
            {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamaño--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void limpiar() 
    {
        cabeza = null;
        tamaño = 0;
    }

    public boolean contiene(B dato) 
    {
        Nodo<B> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

    public boolean estaVacia() 
    { 
        return tamaño == 0; 
    }
    public int tamaño() 
    { 
        return tamaño; 
    }
    public Nodo<B> getCabeza() 
    { 
        return cabeza; 
    }
}
