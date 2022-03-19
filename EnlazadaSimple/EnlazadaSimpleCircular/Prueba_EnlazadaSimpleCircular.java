package EnlazadaSimple.EnlazadaSimpleCircular;

public class Prueba_EnlazadaSimpleCircular {
    public static void main(String[] args) {
        EnlazadaSimpleCircular l = new EnlazadaSimpleCircular();
        System.out.println(l);
        for (int i = 0; i < 10; i++) {
            l.insertarFinal(i);
            System.out.println(l);
        }
        for (int i = 0; i < 10; i++) {
            l.borrarPrincipio();
            System.out.println(l);
        }
    }
}
