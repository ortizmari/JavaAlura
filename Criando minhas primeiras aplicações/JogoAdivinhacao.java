import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int cont = 0;

        System.out.println("Você tem 10 tentativas para acertar o número aleatório");
        System.out.println("-----------------------------------------------------");

        while (cont < 10) {
            System.out.print("Digite um número entre 0 e 100: ");
            int tentativa = input.nextInt();
            cont += 1;

            if (tentativa == aleatorio) {
                System.out.println("Parabéns, você acertou!");
                break;

            } else if ((tentativa < aleatorio) && (cont < 10)) {
                System.out.println("é maior, tente outra vez!");

            } else if ((tentativa > aleatorio) && (cont < 10)) {
                System.out.println("é menor, tente outra vez");
            }

        }
        if (cont == 10) {
            System.out.println("Infelizmente você não acertou, o número aleatório era: " + aleatorio);
        }
    }
}
/*
import java.util.Random;
        import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }
    }
}
 */
