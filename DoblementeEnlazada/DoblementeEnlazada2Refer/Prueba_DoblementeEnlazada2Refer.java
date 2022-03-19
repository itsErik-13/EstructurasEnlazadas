package DoblementeEnlazada.DoblementeEnlazada2Refer;

public class Prueba_DoblementeEnlazada2Refer {
    public static void main(String[] args) {
        DoblementeEnlazada2Refer l = new DoblementeEnlazada2Refer();
        for (int i = 1; i < 10; i++) {
            l.insertarPrincipio(i);
            System.out.println(l);
        }
        for (int i = 0; i < 10; i++) {
            l.insertarFinal(i);
            System.out.println(l);
        }
        for(int i = 0; i < 10 ; i++){
            l.borrar(i);
            System.out.println(l);
        }
        for(int i = 1; i < 10 ; i++){
            l.borrar(i);
            System.out.println(l);
        }
    }
}
