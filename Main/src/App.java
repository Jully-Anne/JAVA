public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022; /*Declara e atribui*/
        System.out.println("Ano de Lançamento:" + ano);
        boolean incluidoNoPlano = true;
        System.out.println(incluidoNoPlano);
        double notaDoFilme = 9.5;
        System.out.println(notaDoFilme);

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);

        String resumo;
        /*Concatenação de strings*/
        resumo = """ 
            Filme Top Gun
            Filme de aventura
            Bom
            Ano de Lançamento 
            """ + ano;
            System.out.println(resumo);
                    
                    

    }
}
