package DoblementeEnlazada.DoblementeEnlazada2Refer;

import DoblementeEnlazada.DobleNodo;

public class DoblementeEnlazada2Refer {
    private DobleNodo primero;
    private DobleNodo ultimo;
    private int numElem;

    public DoblementeEnlazada2Refer() {
        primero = ultimo = null;
        numElem = 0;
    }

    public int numVeces(int elemento) {
        int contador = 0;
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getElem() == elemento)
                contador++;
        }
        return contador;
    }

    public void insertarPrincipio(int elemento) {
        DobleNodo nuevo = new DobleNodo(elemento, null, primero);
        if (numElem == 0) {
            ultimo = nuevo;
        } else {
            primero.setAnt(nuevo);
        }
        primero = nuevo;
        numElem++;
    }

    public void insertarFinal(int elemento) {
        DobleNodo nuevo = new DobleNodo(elemento, ultimo, null);
        if (numElem == 0) {
            primero = nuevo;
        } else {
            ultimo.setSig(nuevo);
        }
        ultimo = nuevo;
        numElem++;
    }

    public void borrar(int elemento){
        if(numElem == 0){
            System.out.println("Lista vacía, no hay elementos que borrar");
        }else if(numElem == 1){
            if(primero.getElem() != elemento)
            System.out.println("El elemento no está en la lista.");
            else{
                primero = ultimo = null;
                numElem--;
            }
        }else{
            DobleNodo actual = primero;
            while(actual != null && actual.getElem() != elemento){
                actual = actual.getSig();
            }
            if(actual == null){
                System.out.println("Elemento no está");
            }else{
                if(actual == primero){
                    primero = primero.getSig();
                    primero.setAnt(null);
                }else if(actual == ultimo){
                    ultimo  = ultimo.getAnt();
                    ultimo.setSig(null);
                }else{
                    actual.getAnt().setSig(actual.getSig());
                    actual.getSig().setAnt(actual.getAnt());
                }
                numElem--;
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Lista: ");
        for(DobleNodo actual = primero ; actual != null; actual = actual.getSig()){
            sb.append(actual.getElem()).append(" ");
        }
        return sb.toString();
    }
}
