package TallerCollectionsyGenerics.GestionTareas.segundo;

public class Main {

    public static void main(String[] args) {

        PairList<String, Integer> lista = new PairList<>();

        lista.agregar("A", 10);
        lista.agregar("B", 20);
        lista.agregar("C", 30);

        lista.mostrar();

        System.out.println("Valor de B: " + lista.obtener("B"));

        lista.eliminar("A");

        System.out.println("Lista después de eliminar:");
        lista.mostrar();
    }
}