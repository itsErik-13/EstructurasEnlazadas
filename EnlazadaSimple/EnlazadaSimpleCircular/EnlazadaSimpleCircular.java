package EnlazadaSimple.EnlazadaSimpleCircular;

import EnlazadaSimple.Nodo;

public class EnlazadaSimpleCircular {
    private Nodo fin;
    private int numElem;

    public EnlazadaSimpleCircular() {
        fin = null;
        numElem = 0;
    }

    public int numVeces(int elemento) {
        int contador = 0;
        if (numElem != 0) {
            Nodo actual = fin;
            do {
                if (actual.getElem() == elemento)
                    contador++;
                actual = actual.getSig();
            } while (actual != fin);
        }
        return contador;
    }

    public void insertarFinal(int elemento) {
        Nodo nuevo = new Nodo(elemento, null);
        if (numElem == 0) {
            fin = nuevo;
            fin.setSig(nuevo);
        } else {
            nuevo.setSig(fin.getSig());
            fin.setSig(nuevo);
            fin = nuevo;
        }
        numElem++;
    }

    public void borrarPrincipio() {
        if (numElem == 0) {
            System.out.println("No hay elementos que borrar.");
        } else if (numElem == 1) {
            fin = null;
            numElem--;
        } else {
            fin.setSig(fin.getSig().getSig());
            numElem--;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Lista: ");
        if (numElem != 0) {
            Nodo actual = fin.getSig();
            do {
                sb.append(actual.getElem()).append(" ");
                actual = actual.getSig();
            } while (actual != fin.getSig());
        }
        return sb.toString();
    }
}