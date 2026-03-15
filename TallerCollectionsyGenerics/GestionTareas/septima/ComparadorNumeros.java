package TallerCollectionsyGenerics.GestionTareas.septima;

public class ComparadorNumeros implements Comparador<Integer> {

    @Override
    public int comparar(Integer a, Integer b) {
        return a - b;
    }

}