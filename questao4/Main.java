import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {

    // Função para preencher a fila com 100 números aleatórios
    public static Queue<Integer> preencherFila(int tamanho) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            fila.add(random.nextInt(100));
        }

        return fila;
    }

    // Função para inverter a fila
    public static Queue<Integer> inverterFila(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        // Criar a nova fila F2
        Queue<Integer> filaInvertida = new LinkedList<>();

        while (!pilha.isEmpty()) {
            filaInvertida.add(pilha.pop());
        }

        return filaInvertida;
    }

    public static void main(String[] args) {
        Queue<Integer> filaOriginal = preencherFila(100);

        System.out.println("Fila Original:");
        System.out.println(filaOriginal);

        Queue<Integer> filaInvertida = inverterFila(filaOriginal);

        System.out.println("\nFila Invertida:");
        System.out.println(filaInvertida);
    }
}
