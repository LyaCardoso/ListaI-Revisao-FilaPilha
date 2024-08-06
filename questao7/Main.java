import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();

        // Preencher a fila com 20 números aleatórios
        for (int i = 0; i < 20; i++) {
            fila.add(random.nextInt(100)); // Números entre 0 e 99
        }

        System.out.println("Fila original: " + fila);

        // Inverter a fila usando uma pilha
        inverterFila(fila);

        System.out.println("Fila invertida: " + fila);
    }

    public static void inverterFila(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();

        // Transferir os elementos da fila para a pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        // Transferir os elementos da pilha de volta para a fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }
}
