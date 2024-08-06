import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Função para reverter uma string usando uma pilha
    public static String reverterString(String entrada) {
        Stack<Character> pilha = new Stack<>();
        for (char c : entrada.toCharArray()) {
            pilha.push(c);
        }

        StringBuilder revertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            revertida.append(pilha.pop());
        }

        return revertida.toString();
    }

    // Função para verificar se uma string é um palíndromo
    public static boolean ehPalindromo(String entrada) {
        String normalizada = entrada.replaceAll("[\\W_]", "").toLowerCase();
        int esquerda = 0;
        int direita = normalizada.length() - 1;

        while (esquerda < direita) {
            if (normalizada.charAt(esquerda) != normalizada.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine();

        // Imprimir o texto em ordem inversa
        String revertida = reverterString(entrada);
        System.out.println("String revertida: " + revertida);

        // Verificar se a string é um palíndromo
        boolean palindromo = ehPalindromo(entrada);
        if (palindromo) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        scanner.close();
    }
}
