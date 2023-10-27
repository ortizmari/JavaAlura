public class ScrennMatch {

    public static void main(String[] args) {

        System.out.println("Esse é o screen Match");
        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        float notaDoFilme = 8.1f;

        //Média calculada pelas três notas da Jack, Paulo e Suelen
        float media = (9.8f + 6.3f + 8.0f)/ 3;
        System.out.println(media);

        String sinopse = """
                         Filme Top Gun
                         Filme de aventura com galã dos anos 80
                         muito bom!
                         Ano de lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
