public class Cola<B> 
{
    private Nodo<B> frente;
    private Nodo<B> fin;

    public void encolar(B dato) 
    {
        Nodo<B> nuevo = new Nodo<>(dato);

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

    public B desencolar() 
    {
        if (frente == null) return null;

        B dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null) fin = null;

        return dato;
    }

    public B verFrente() 
    {
        return frente != null ? frente.getDato() : null;
    }

    public boolean estaVacia() 
    {
        return frente == null;
    }
}
