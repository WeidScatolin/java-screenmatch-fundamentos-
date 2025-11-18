
 import java.util.Scanner;

public class While {
    static void main(String[] args) {
        Scanner  leitura =  new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;



        while (nota != -1){
            System.out.println("Qual a nota que você dá para o filme ");
            nota = leitura.nextDouble();
            if ( nota != -1){

                mediaAvaliacao += + nota;
                totalNotas++;

            } else if (nota == -1 && totalNotas < 1 ){
                System.out.println("Você pediu para sair, então não tem nenhuma media");
            }


        }
        if (totalNotas > 1){
            System.out.println("A media da avaliação é : " +mediaAvaliacao/totalNotas);
        }



    }
}
