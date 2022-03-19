package EnlazadaSimple.EnlazadaSimple1Refer;
import EnlazadaSimple.Nodo;

public class EstructuraEnlazadaSimple1Refer {
    private Nodo primero;
    private int numElem;

    public EstructuraEnlazadaSimple1Refer(){
        primero = null;
        numElem = 0;
    }
    public int getNumElem() {
        return numElem;
    }
    public boolean esta(int elemento) {
        Nodo actual = primero;
        while (actual != null && actual.getElem() != elemento) {
            actual = actual.getSig();
        }
        return actual != null;
    }/*
    public void insertarPrincipio(int elemento) {
        Nodo nuevo = new Nodo(elemento, primero);
        nuevo = primero;
        numElem++;
    }*/
}
