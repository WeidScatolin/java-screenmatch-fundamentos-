import java.util.Scanner;
public class MediaFilme {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;


            for (int i = 0; i < 3 ; i++) {
                System.out.println("Digite a sua Nota para o filme");
                nota = leitura.nextDouble();
                mediaAvaliacao += + nota; /// += media avaliação recebe oq ela ja tinha
        }
        System.out.println("Media de avaliações " + mediaAvaliacao/3);
    }
}
