import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Função para remover um item da pilha
    public static void removeItem(Stack<Integer> stack, int key) {
        Stack<Integer> tempStack = new Stack<>();

        // Transferir elementos para a pilha temporária
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (top != key) {
                tempStack.push(top);
            }
        }

        // Transferir de volta para a pilha original
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Pilha original: " + stack);

        System.out.println("Digite a chave do elemento a ser removido:");
        int key = scanner.nextInt();

        removeItem(stack, key);

        System.out.println("Pilha após remoção do elemento com chave " + key + ": " + stack);

        scanner.close();
    }
}

