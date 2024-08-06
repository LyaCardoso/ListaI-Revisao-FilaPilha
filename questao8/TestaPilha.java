import java.util.Random;
import java.util.Stack;

public class TestaPilha{

    public static void main(String[] args) {
        Stack<Integer> pilhaN = new Stack<>();
        Stack<Integer> pilhaP = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100;

            if (numero > 0) {
                pilhaP.push(numero);
            } else if (numero < 0) {
                pilhaN.push(numero);
            } else {
                if (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
                    int numP = pilhaP.pop();
                    int numN = pilhaN.pop();
                    System.out.println("Zero encontrado: Retirando um elemento de cada pilha:");
                    System.out.println("Elemento retirado da pilha P (positivos): " + numP);
                    System.out.println("Elemento retirado da pilha N (negativos): " + numN);
                } else {
                    System.out.println("Zero encontrado, mas uma das pilhas está vazia.");
                }
            }
        }

        System.out.println("\nConteúdo final da pilha P (positivos): " + pilhaP);
        System.out.println("Conteúdo final da pilha N (negativos): " + pilhaN);
    }
}
