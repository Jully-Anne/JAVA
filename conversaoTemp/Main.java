public class Main{
    public static void main (String [] args){
        double celsius;
        celsius = 50.2;
        double conversao = (celsius * 1.8) + 32;

        System.out.println("A Temperatura em graus Celsius é " + celsius);
        System.out.println("A temperatura em Fahrenheit é " + conversao);
        int castTemp = (int) conversao;
        System.out.println("A temperatura em Fahrenheit com casting int é igual a " + castTemp + " graus.");
    }
}