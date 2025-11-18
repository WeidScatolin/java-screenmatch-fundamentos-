public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao screen Match");

        System.out.println("Filme:  Top Gun: Maverick ");


        int anoDeLancamento = 2022;

        System.out.println("Ano de Lançamento : " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 8.14;

        double media = (9.8 + 6.3 + 8)/3;

        System.out.println(media);
        ///

        String sinopse; /// essa variavel guarda um valor
        sinopse ="Filme de Aventura com galâ dos anos 80 ";
        System.out.println(sinopse);


        /*

        Uma das maneiras mais comuns de se formatar textos em Java é utilizando o metodo format(), da classe String. Esse méteodo permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor de ponto flutuante. Vamos ver um exemplo:
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

         */

    // como converter valores   transformando de double para inteiro

        int classificacao;
        classificacao = (int) (media/2) ;
        System.out.println(classificacao);




    }
}
