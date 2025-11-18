import java.util.Scanner;
public class LeituraDeDados {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);///ele vai rastrear se houve alguma entrada pelo teclado)

        System.out.println("Digite seu filme Favorito");
        String filme = leitura.nextLine(); /// < nextline usado para ler um texto
        System.out.println(filme);
        System.out.println("Qual o ano de Lançamento ");
        int ano = leitura.nextInt(); /// < nextint usado para ler um valor inteiro
        System.out.println(ano);
        System.out.println("Qual a sua avaliação ");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao); /// se estiver no brasil, precisa ser , e não ponto a entrada de dados do double

    }
}
