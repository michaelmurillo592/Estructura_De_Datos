package TallerCollectionsyGenerics.GestionTareas.octava;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        Pair<Stack<Integer>, Stack<Integer>> resultado = SplitStack.splitStack(pila, 2);
        
        System.out.println("Primera subpila: " +resultado.first);
        System.out.println("Segunda subpila: "+resultado.second);
    }
}
