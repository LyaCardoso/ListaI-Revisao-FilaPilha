import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Avião{" +
                "nome='" + nome + '\'' +
                ", identificador=" + identificador +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Aviao> filaDeEspera = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\nControle de Pista de Decolagem:");
            System.out.println("1. Listar número de aviões aguardando na fila");
            System.out.println("2. Autorizar decolagem do primeiro avião");
            System.out.println("3. Adicionar um avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar características do primeiro avião da fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila: " + filaDeEspera.size());
                    break;

                case 2:
                    if (!filaDeEspera.isEmpty()) {
                        Aviao aviaoDecolando = filaDeEspera.poll();
                        System.out.println("Autorizada decolagem do avião: " + aviaoDecolando);
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o identificador do avião: ");
                    int identificador = scanner.nextInt();
                    Aviao novoAviao = new Aviao(nome, identificador);
                    filaDeEspera.add(novoAviao);
                    System.out.println("Avião adicionado à fila de espera.");
                    break;

                case 4:
                    if (filaDeEspera.isEmpty()) {
                        System.out.println("Não há aviões na fila de espera.");
                    } else {
                        System.out.println("Aviões na fila de espera:");
                        for (Aviao aviao : filaDeEspera) {
                            System.out.println(aviao);
                        }
                    }
                    break;

                case 5:
                    if (!filaDeEspera.isEmpty()) {
                        Aviao primeiroAviao = filaDeEspera.peek();
                        System.out.println("Primeiro avião na fila: " + primeiroAviao);
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
