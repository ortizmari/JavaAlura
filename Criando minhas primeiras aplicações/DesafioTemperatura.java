import java.util.Scanner;

public class DesafioTemperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = input.nextDouble();

        double conversao = (temperatura * 1.8) + 32;
        int conversao2 = (int) conversao;

        String mensagem = """
                O valor da temperatura em Fahrenheit é %.2f
                arredondado ficará %d
                """.formatted(conversao, conversao2);

        System.out.println(mensagem);
    }

}

/* public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }

}
 */
