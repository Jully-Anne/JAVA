import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println ( "O nome do seu filme favorito é " + filme);
    }
}