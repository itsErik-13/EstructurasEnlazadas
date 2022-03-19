package EnlazadaSimple.EnlazadaSimple2Refer;

public class Prueba_EstructuraEnlazadaSimple2Refer {
    public static void main(String[] args) {
        EstructuraEnlazadaSimple2Refer l = new EstructuraEnlazadaSimple2Refer();
        System.out.println(l);
        for (int i = 0; i < 10; i++) {
            l.insertarFinal(i);
            System.out.println(l);
        }
        l.insertarFinal(5);
        System.out.println(l);
        System.out.format("Está el 5? %s\n",l.esta(5));
        System.out.format("Está el 37? %s\n",l.esta(37));
        System.out.format("Numero de elementos: %d\n",l.getNumElem());
        l.borrar(0);
        System.out.println(l);
        System.out.format("Numero de elementos: %d\n",l.getNumElem());
        l.borrar(9);
        System.out.println(l);
        System.out.format("Numero de elementos: %d\n",l.getNumElem());
    }
}
