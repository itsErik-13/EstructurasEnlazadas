package EnlazadaSimple.EnlazadaSimple1Refer;

public class Prueba_EstructuraEnlazadaSimple1Refer {
    public static void main(String[] args) {
        EstructuraEnlazadaSimple1Refer l = new EstructuraEnlazadaSimple1Refer();
        System.out.println(l);
        for (int i = 0; i < 10; i++) {
            l.insertarPrincipio(i);
            System.out.println(l);
        }
        l.insertarPrincipio(5);
        System.out.println(l);
        System.out.format("Está el 5? %s\n",l.esta(5));
        System.out.format("Cuantas veces está el 5? %s\n",l.numVeces(5));
        System.out.format("Está el 37? %s\n",l.esta(37));
        System.out.format("Numero de elementos: %d\n",l.getNumElem());
        l.borrar(0);
        System.out.println(l);
        System.out.format("Numero de elementos: %d\n",l.getNumElem());
        l.borrar(9);
        System.out.println(l);
        System.out.format("Numero de elementos: %d\n",l.getNumElem());
        for (int i = 0; i < 10; i++) {
            l.borrar(i);
            System.out.println(l);
        }
        l.borrar(5);
        System.out.println(l);
    }
}
