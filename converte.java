/*Uma classe com um método principal que pergunta se o usuário quer ler um ângulo em radianos e converter para graus (opção 1) ou se quer ler um ângulo em radianos e converter para graus (opção2). Use um if para chama o método grausParaRadianos() ou radianosParaGraus(), ambos da classe Converte. Uma classe chamada Converte, com dois métodos. Um chamado grausParaRadianos()
que lê um ângulo em graus e converte para radianos e mostra o resultado. E outro método chamado radianosParaGraus(), que lê um ângulo em radianos e converte para graus e mostra o resultado.
Lembre-se, 180 graus equivale a 3,141593 radianos. */
import java.util.Scanner;
public class converte{
    // Método para converter graus para radianos
    public void grausParaRadianos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ângulo em graus: ");
        double graus = sc.nextDouble();
        double radianos = graus * Math.PI / 180;
        System.out.println("O ângulo em radianos é: " + radianos);
    }
    // Método para converter radianos para graus
    public void radianosParaGraus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ângulo em radianos: ");
        double radianos = sc.nextDouble();
        double graus = radianos * 180 / Math.PI;
        System.out.println("O ângulo em graus é: " + graus);
    }
    // Método para decidir qual conversão fazer
    public void angulos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n1 - Converter graus para radianos\n2 - Converter radianos para graus");
        int opcao = sc.nextInt();
        
        if (opcao == 1) {
            grausParaRadianos();
        } else if (opcao == 2) {
            radianosParaGraus();
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
