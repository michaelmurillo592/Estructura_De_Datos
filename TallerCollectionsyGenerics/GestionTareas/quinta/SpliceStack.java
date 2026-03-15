package TallerCollectionsyGenerics.GestionTareas.quinta;

import java.util.Stack;

public class SpliceStack {
    
    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j){

        Stack<Integer> temp = new Stack<>();
        Stack<Integer> resultado = new Stack<>();

        while (!s.isEmpty()) {
            temp.push(s.pop());

        int index = 0;

        while (!temp.isEmpty());
            int valor = temp.pop();

            if (index >= i && index < j) {
                resultado.push(valor);
            } else {
                s.push(valor);
            }

            index++;
        }

        return resultado;
    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        Stack<Integer> extraidos = spliceStack(s, 1, 3);

        System.out.println("Stack original: "+s);
        System.out.println("Stack extraido: "+extraidos);
    }
}
