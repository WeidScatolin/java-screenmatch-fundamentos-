import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
   public static void main() {
    int numeroAleatorio = new Random().nextInt(100);
    Scanner entrada = new Scanner(System.in);
    int entrada2 = 0;

    int contador = 0;
        while(contador < 5){

            System.out.println("Olá, você tem 5 tentativas para advinhar um numero aleatorio, digite um numero entre 0 a 100");
            entrada2 = entrada.nextInt();
            contador++;

                if (entrada2 == numeroAleatorio){
                    System.out.println("Parabéns, você conseguiu o numero correto é "+ numeroAleatorio + "Você digitou : " + entrada2);
                    break; //  se estiver correto, interrompe o loop while
                }else if (entrada2 < numeroAleatorio){
                    System.out.println("O numero digitado é menor que o numero aleatorio");
                } else if (entrada2 > numeroAleatorio) {
                    System.out.println("O numero digitado é maior que o  numero aleatorio");
                }

        }
        if(contador == 5 && entrada2 != numeroAleatorio){
            System.out.println("Voce não conseguiu acertar o palpite , o numero era :" + numeroAleatorio);
        }
    }
}
