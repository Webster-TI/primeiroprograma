public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        /*boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Incluído no Plano? " + incluidoNoPlano);
        System.out.println("Nota fo Filme: " + notaDoFilme);*/
        double media = (9.8 + 6. + 8.0) / 3;
        // Arredondar para 1 casa decimal
        media = Math.round(media * 10.0) / 10.0;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}