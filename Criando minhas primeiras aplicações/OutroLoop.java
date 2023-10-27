import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int cont = 0;

       while (nota != -1) {
            System.out.print("diga sua avaliação para o filme e -1 para encerrar: ");
            nota = input.nextDouble();

            if (nota != -1) {
                media += nota;
                cont++;
            }
        }

        System.out.println("Média de avaliações: " + media/cont);
    }
}
