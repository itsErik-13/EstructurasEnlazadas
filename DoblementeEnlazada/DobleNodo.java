package DoblementeEnlazada;

public class DobleNodo {
    private int elemento;
    private DobleNodo anterior;
    private DobleNodo siguiente;

    public DobleNodo(int elemento, DobleNodo anterior, DobleNodo siguiente) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public int getElem() {
        return elemento;
    }

    public void setElem(int elemento) {
        this.elemento = elemento;
    }

    public DobleNodo getAnt() {
        return anterior;
    }

    public void setAnt(DobleNodo anterior) {
        this.anterior = anterior;
    }

    public DobleNodo getSig() {
        return siguiente;
    }

    public void setSig(DobleNodo siguiente) {
        this.siguiente = siguiente;
    }

}
