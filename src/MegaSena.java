import java.util.*;

public class MegaSena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Olá! Seja bem-vindo ao gerador da Mega-Sena!");

        do {
            System.out.println("\n=== GERADOR MEGA-SENA ===");
            System.out.println("1 - Gerar jogo");
            System.out.println("2 - Gerar vários jogos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Os números de hoje são:");
                    gerarJogo(6, 60);
                    System.out.println("Boa sorte!");
                    break;

                case 2:
                    System.out.print("Quantos jogos deseja gerar? ");
                    int quantidade = scanner.nextInt();

                    for (int i = 1; i <= quantidade; i++) {
                        System.out.println("\nJogo " + i + ":");
                        System.out.println("Os números são:");
                        gerarJogo(6, 60);
                    }
                    System.out.println("Boa sorte!");
                    break;

                case 0:
                    System.out.println("Saindo... Boa sorte!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void gerarJogo(int qtd, int limite) {
        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < qtd) {
            numeros.add(random.nextInt(limite) + 1);
        }

        List<Integer> lista = new ArrayList<>(numeros);
        Collections.sort(lista);

        System.out.println(lista);
    }
}