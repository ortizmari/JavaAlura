public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        float notaDoFilme = 8.1f;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2023) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else if (anoDeLancamento <= 1999){
            System.out.println("Filme retrõ que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }



    }

}
