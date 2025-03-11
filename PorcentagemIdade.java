import java.util.Scanner;

public class PorcentagemIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis principais
        int totalPessoas;
        int idadeLimite;
        int contador = 0;

        // Entrada: total de pessoas
        System.out.print("Digite o número total de pessoas: ");
        totalPessoas = scanner.nextInt();

        // Entrada: idade limite para cálculo do percentual
        System.out.print("Digite a idade limite para calcular o percentual: ");
        idadeLimite = scanner.nextInt();

        // Contador de pessoas acima da idade limite
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade > idadeLimite) {
                contador++;
            }
        }

        // Cálculo da porcentagem
        double porcentagem = (contador * 100.0) / totalPessoas;

        // Exibição dos resultados
        System.out.println("\nTotal de pessoas com mais de " + idadeLimite + " anos: " + contador);
        System.out.printf("Isso representa %.2f%% do total de pessoas.\n", porcentagem);

        scanner.close();
    }
}
