package TallerCollectionsyGenerics.GestionTareas.cuarta;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Main {
    
    public static void main(String[] args){

        Repositorio<String> repo = new Repositorio<>();
        
        repo.agregar("Uno");
        repo.agregar("Dos");
        repo.agregar("Tres");
        repo.agregar("Cuatro");

        System.out.println("recorrido normal");

        for(String s : repo){
            System.out.println(s);
        }

        System.out.println("recorrido reversa");

        Iterator<String> it = repo.iteratorReversa();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

        

