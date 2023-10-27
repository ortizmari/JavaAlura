import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.print("Qual seu filme favorito? ");
        String filme = input.nextLine();
        System.out.print("Qual o ano de lançamento? ");
        int ano = input.nextInt();
        System.out.print("qual sua avaliação para o filme? ");
        double avaliacao = input.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
