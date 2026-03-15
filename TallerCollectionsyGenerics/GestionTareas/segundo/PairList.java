package TallerCollectionsyGenerics.GestionTareas.segundo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PairList<K, V> {

    private List<Pair<K, V>> lista = new ArrayList<>();

    public void agregar(K clave, V valor){
        lista.add(new Pair<>(clave, valor));
    }

    public V obtener(K clave) {
        Iterator<Pair<K,V>> it = lista.iterator();

        while (it.hasNext()) {
            Pair<K,V> par = it.next();

            if (par.getClave().equals(clave)) {
                return par.getValor();
            }
        }

        return null;
    }

    public void eliminar(K clave){
        Iterator<Pair<K,V>> it = lista.iterator();

        while (it.hasNext()) {
            Pair<K,V> par = it.next();

            if (par.getClave().equals(clave)) {
                it.remove();
                return;
            }
        }
    }

    public void mostrar(){
        for(Pair<K,V> par : lista){
            System.out.println(par);
        }
    }
}