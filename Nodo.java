public class Nodo<B> 
{
    private B dato;
    private Nodo<B> siguiente;

    public Nodo(B dato) 
    {
        this.dato = dato;
        this.siguiente = null;
    }

    public B getDato() 
    { 
        return dato; 
    }
    public void setDato(B dato) 
    { 
        this.dato = dato; 
    }

    public Nodo<B> getSiguiente() 
    { 
        return siguiente; 
    }
    public void setSiguiente(Nodo<B> siguiente) 
    { 
        this.siguiente = siguiente; 
    }
}
