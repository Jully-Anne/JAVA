public class Main {
    public static void main (String [] arg){
       int anoLancamento = 2023;
       boolean incluidoNoPlano = true;
       double nota = 8.9;
       String plano = "plus";

       if(anoLancamento >= 2022){
        System.out.println("É um novo filme!");
       }else {
        System.out.println("Filme antigo!");
       }

       if (incluidoNoPlano == true || plano.equals("plus")){
        System.out.println("Filme liberado!");
       }else {
        System.out.println("Filme bloqueado!");
       }
    }
}
