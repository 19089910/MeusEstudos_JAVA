import java.util.Scanner;//biblioteca escan

public class saida {
     public static void main(String[] args) {
         String seila;

         Scanner scan = new Scanner(System.in);//= type variavelName = novo type(entrar no sistema)/ variavelName recebe type(sua funcao)

         System.out.print("informe um nome: ");
         seila = scan.nextLine();/** String stringname = scanner.nextLine();
                                   * Double doubleValor = scanner.nextDoubel();
                                   * Fluat floatValor = scanner.nextFluat();
                                   * Short shortValor = scanner.nextShort();
                                   * Integer intValor = scanner.nextInt();
                                   * Byte byteValor = scanner.nextByte();
                                   * Boolean bool = scanner.nextBoolean();
                                */
         System.out.println(seila);
        //teste
         System.out.print("digite um valor: ");
         Integer digitaAi = scan.nextInt();
         System.out.println(digitaAi + 10);

         //index/char de uma string
         String nome = "lucas";
         System.out.println(nome.charAt(0) + "-" + nome.charAt(1) + "-"
                 + nome.charAt(2) + "-" + nome.charAt(3) + "-" + nome.charAt(4));

         //converter valor em string
         String.valueOf(10f);// 10f e valor float

         Float f = 10.0f;
         String valorConvertido = String.valueOf(f);
         System.out.println(valorConvertido);

         //Poo vs type primitivos; a prova que java nao e so POO
         Integer n1 = 10;
         int n2 = 10;
         n1.;//possue metidos de funcoes derivadas da POO
         n2.;//int normal de outras linguagems
         /**POO     primitivos
          * Double  double
          * Flout   flout
          * Long    long
          * Integer int
          * Short   short
          * Byte    byte
          * Boolean boolean
          * Cher    cher
          * String  nao Tem pois e diferente*/

     }
 }
