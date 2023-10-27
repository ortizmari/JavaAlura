import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("qual sua avaliação para o filme? ");
            nota = input.nextDouble();
            media += nota;
        }

        System.out.println("Média de avaliações: " + media/3);
    }
}
