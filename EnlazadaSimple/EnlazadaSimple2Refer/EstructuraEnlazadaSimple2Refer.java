package EnlazadaSimple.EnlazadaSimple2Refer;
import EnlazadaSimple.Nodo;

public class EstructuraEnlazadaSimple2Refer {
    private Nodo primero;
    private Nodo ultimo;
    private int numElem;

    public EstructuraEnlazadaSimple2Refer() {
        primero = ultimo = null;
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
    }
    public int numVeces(int elemento){
        int contador = 0;
        for (Nodo actual = primero; actual != null; actual = actual.getSig()) {
            if(actual.getElem() == elemento){
                contador++;
            }
        }
        return contador;
    }
    public void insertarFinal(int elemento) {
        Nodo nuevo = new Nodo(elemento, null);
        if (numElem == 0) {
            primero = nuevo;
        } else {
            ultimo.setSig(nuevo);
        }
        ultimo = nuevo;
        numElem++;
    }
    public void borrar(int elemento) {
        if (numElem == 0) {
            System.out.println("No hay elementos que borrar, lista vacía");
        } else if (numElem == 1) {
            if (primero.getElem() != elemento)
                System.out.println("El elemento no está");
            else {
                primero = ultimo = null;
                numElem--;
            }
        }else{
            Nodo actual = primero;
            if (primero.getElem() == elemento){
                primero = primero.getSig();
                numElem--;
            }else{
                while(actual.getSig() != null && actual.getSig().getElem() != elemento){
                    actual  = actual.getSig();
                }
                if(actual.getSig() == null){
                    System.out.println("Elemento no está");
                }else{
                    if(actual.getSig() == ultimo){
                        ultimo = actual;
                        ultimo.setSig(null);  
                    }else{
                        actual.setSig(actual.getSig().getSig());
                    }
                }
                numElem--;
            }
        }
        
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista: ");
        for (Nodo actual = primero; actual != null; actual = actual.getSig())
            sb.append(actual.getElem()).append(" ");
        return sb.toString();
    }

}
