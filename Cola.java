public class Cola 
{
    private Nodo frente;
    private Nodo fin;

    public void encolar(dato) 
    {
        Nodo nuevo = new Nodo<>(dato);

        if (fin == null) 
        {
            frente = fin = nuevo;
        } 
        else 
        {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public desencolar() 
    {
        if (frente == null) return null;

        dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null) fin = null;

        return dato;
    }

    public verFrente() 
    {
        return frente != null ? frente.getDato() : null;
    }

    public boolean estaVacia() 
    {
        return frente == null;
    }
}
