public class Pila<B> 
{
    private Nodo<B> cima;

    public void apilar(B dato) 
    {
        Nodo<B> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public B desapilar() 
    {
        if (cima == null) return null;
        B dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }

    public B verCima() 
    {
        return cima != null ? cima.getDato() : null;
    }

    public boolean estaVacia() 
    {
        return cima == null;
    }
}
