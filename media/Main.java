public class Main {
    public static void main (String [] args){
        int anoDeLancamento = 1989;
        double prova1 = 9.8;
        double prova2 = 8.9;
        double prova3 = 6.0;
        double trabalhos = 8.9;
        double media = ((prova1 + prova2 + prova3 + trabalhos) / 4);

        System.out.println(media);

        if (media >= 7.0){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        String snopse;
        snopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento foi 
                """ + anoDeLancamento;
        System.out.println(snopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);
    }

}