public class Main {
    public static void main (String [] args){
        int idade = 50;
        double valor = 55.987;
        String senha = "799120";
            if(senha.equals("799120")){
            String mensagem = """
                    Olá! 
                    Sua senha está correta, acesso permitido!
                    Foi identificado que você tem %d anos de idade e %.2f reais guardado no banco.
                    """.formatted(idade, valor);
             System.out.println (mensagem);

            }else {
                System.out.println("Senha incorreta, acesso negado!");
            }

    }
}
