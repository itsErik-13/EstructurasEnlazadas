package DoblementeEnlazada.DoblementeEnlazada1Refer;

import DoblementeEnlazada.DobleNodo;

public class DoblementeEnlazada1Refer {
    private DobleNodo primero;
    private int numElem;

    public DoblementeEnlazada1Refer() {
        primero = null;
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
        if (numElem != 0) {
            primero.setAnt(nuevo);
        }
        primero = nuevo;
        numElem++;
    }

    public void insertarFinal(int elemento) {
        DobleNodo ultimo = primero;
        if (numElem == 0) {
            DobleNodo nuevo = new DobleNodo(elemento, null, null);
            primero = nuevo;
        } else {
            while (ultimo.getSig() != null) {
                ultimo = ultimo.getSig();
            }
            DobleNodo nuevo = new DobleNodo(elemento, ultimo, null);
            ultimo.setSig(nuevo);
        }
        numElem++;
    }

    public void borrar(int elemento) {
        if (numElem == 0) {
            System.out.println("No hay elementos que borrar");
        } else if (numElem == 1) {
            if (primero.getElem() != elemento) {
                System.out.println("El elemento no está");
            } else {
                primero = null;
                numElem--;
            }
        } else {
            DobleNodo actual = primero;
            while (actual != null && actual.getElem() != elemento)
                actual = actual.getSig();
            if (actual == null) {
                System.out.println("El elemento no está");
            } else {
                if (actual == primero) {
                    primero = primero.getSig();
                } else {
                    actual.getAnt().setSig(actual.getSig());
                    if (actual.getSig() != null)
                        actual.getSig().setAnt(actual.getAnt());
                }
                numElem--;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Lista: ");
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
            sb.append(actual.getElem()).append(" ");
        }
        return sb.toString();
    }
}
