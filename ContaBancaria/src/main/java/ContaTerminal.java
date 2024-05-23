import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entrada do usuário do terminal, usando o Locale.US para garantir a interpretação correta dos números
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Imprime uma mensagem de boas-vindas e uma linha em branco
        System.out.println("Bom dia. Essa é uma atividade da DIO para \ntreinamento de recebimento de dados via teminal");
        System.out.println("");

        // Solicita ao usuário que digite o número da Agência e armazena o valor digitado na variável "numero"
        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt();
        //Consome o caractere de nova linha deixado pelo método nextInt() para evitar problemas de leitura de entrada mais tarde
        scanner.nextLine();

        // Solicita ao usuário que digite o nome da Agência e armazena o valor digitado na variável "agencia"
        System.out.println("Por favor, digite o nome da sua Agência:");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que digite seu nome para identificação e armazena o valor digitado na variável "nome"
        System.out.println("Por favor, digite seu nome para identificação:");
        String nome = scanner.nextLine();

        // Solicita ao usuário que digite seu saldo bancário e armazena o valor digitado na variável "saldo"
        System.out.println("Por favor, digite seu saldo bancario:");
        double saldo = scanner.nextDouble();


        // Imprime uma mensagem de agradecimento ao usuário, juntamente com os detalhes da conta (nome, agência, número e saldo)
        System.out.println("");
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco,\nsua agência é " + agencia + " conta " + numero + " e seu saldo R$" + saldo + ", já está disponível para saque.");
    }
}
