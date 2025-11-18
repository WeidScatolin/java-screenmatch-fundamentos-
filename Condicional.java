public class Condicional {
   public static void main() {
       int anoDeLancamento = 2022;
       boolean incluidoNoPlano = true;
       double notaDoFilme = 8.1;
       String tipoPlano = "Plus";



       if(anoDeLancamento >= 2022){
           System.out.println("Lançamento ");
       } else {
           System.out.println("Filme retro");
       }

       if(incluidoNoPlano == true || tipoPlano.equals("Plus")){ ///  && também pode ser usado
           System.out.println("Ele pode assistir");
       } else {
           System.out.println("Deve pagar a locação");
       }


   }



   /*
   * int dia = 3;
String nomeDia;

switch (dia) {
   case 1:
      nomeDia = "domingo";
      break;
   case 2:
      nomeDia = "segunda-feira";
      break;
   case 3:
      nomeDia = "terça-feira";
      break;
   case 4:
      nomeDia = "quarta-feira";
      break;
   case 5:
      nomeDia = "quinta-feira";
      break;
   case 6:
      nomeDia = "sexta-feira";
      break;
   case 7:
      nomeDia = "sábado";
      break;
   default:
      nomeDia = "Dia inválido";
      break;
}

System.out.println("O dia " + dia + " é " + nomeDia);
   * */


}
