public class Nodo {
    private int elemento;
    private Nodo siguiente;

    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    public int getElem(){
        return elemento;
    }
    public void setElem(int elemento){
        this.elemento  = elemento;
    }
    public Nodo getSig(){
        return siguiente;
    }
    public void setSig(Nodo siguiente){
        this.siguiente = siguiente;
    }
}