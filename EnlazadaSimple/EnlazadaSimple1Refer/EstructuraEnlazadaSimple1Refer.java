package EnlazadaSimple.EnlazadaSimple1Refer;
import EnlazadaSimple.Nodo;

public class EstructuraEnlazadaSimple1Refer {
    private Nodo primero;
    private int numElem;

    public EstructuraEnlazadaSimple1Refer() {
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
    }

    public int numVeces(int elemento) {
        int contador = 0;
        for (Nodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getElem() == elemento) {
                contador++;
            }
        }
        return contador;
    }

    public void insertarPrincipio(int elemento) {
        Nodo nuevo = new Nodo(elemento, primero);
        primero = nuevo;
        numElem++;
    }

    public void borrar(int elemento) {
        if(numElem == 0){
            System.out.println("No hay elementos que borrar");
        }else if(numElem == 1){
            if (primero.getElem() != elemento) {
                System.out.println("El elemento no está en la estructura");
            }else{
                primero = primero.getSig();
                numElem--;
            }
        }else{
            Nodo actual = primero;
            if(actual.getElem() == elemento){
                primero = primero.getSig();
                numElem--;
            }else{
                while (actual.getSig() != null && actual.getSig().getElem() != elemento) {
                    actual = actual.getSig();
                }
                if(actual.getSig() == null){
                    System.out.println("El elemento no está en la estructura");
                }else{
                    actual.setSig(actual.getSig().getSig());
                    numElem--;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista: ");
        for(Nodo actual = primero; actual != null; actual = actual.getSig()){
            sb.append(actual.getElem()).append(" ");
        }
        return sb.toString();
    }
    
}
