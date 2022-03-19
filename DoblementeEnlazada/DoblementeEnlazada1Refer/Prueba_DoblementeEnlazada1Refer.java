package DoblementeEnlazada.DoblementeEnlazada1Refer;

public class Prueba_DoblementeEnlazada1Refer {
    public static void main(String[] args) {
        DoblementeEnlazada1Refer l = new DoblementeEnlazada1Refer();
        System.out.println(l);
        for (int i = 0; i < 10; i++) {
            l.insertarFinal(i);
            System.out.println(l);
        }
        System.out.println(l.numVeces(6)); 
        for (int i = 0; i < 10; i++) {
            l.borrar(i);
            System.out.println(l);
        }
    }
}
