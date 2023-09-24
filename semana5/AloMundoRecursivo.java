public class AloMundoRecursivo {
    public static void main (int contador){
        System.out.println("Alô Mundo");
        contador++;

        if(contador < 5){
        main(contador);
        }
    }
}

//Implementar com fatorial e fibonacci
