public class Main{
    public static void main(String [] args){
        int dia = 3;
        String nomeDia;
        switch (dia){
            case 1:
                nomeDia = "Segunda";
            break;
            case 2: 
                nomeDia = "Quarta";
            break;
            case 3: 
                nomeDia = "Sexta";
            break;
            default:
                nomeDia = "Dia inválido";
            break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}