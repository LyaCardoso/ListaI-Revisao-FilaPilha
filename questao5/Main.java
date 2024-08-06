import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Set<Integer> conjuntoFila = new HashSet<>();
        Random random = new Random();
        int totalNumeros = 1000;

        for (int i = 0; i < totalNumeros; i++) {
            int numero = random.nextInt(10000);

            if (conjuntoFila.contains(numero)) {
                pilha.push(numero);
            } else {
                fila.add(numero);
                conjuntoFila.add(numero);
            }
        }

        // Imprimir os conteúdos da fila e da pilha
        System.out.println("Conteúdo da Fila F:");
        System.out.println(fila);

        System.out.println("\nConteúdo da Pilha P:");
        System.out.println(pilha);
    }
}
