import java.util.Scanner;//biblioteca escan
public class estutura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//= type variavelName = novo type(entrar no sistema)/ variavelName recebe type(sua funcao)

        //TIPOS DE SCANNER E SEU USO
        System.out.print("informe um nome: ");
        String Onome;
        Onome = scan.nextLine();
        /** String stringname = scanner.nextLine();
         * Double doubleValor = scanner.nextDoubel();
         * Fluat floatValor = scanner.nextFluat();
         * Short shortValor = scanner.nextShort();
         * Integer intValor = scanner.nextInt();
         * Byte byteValor = scanner.nextByte();
         * Boolean bool = scanner.nextBoolean();
         */
        System.out.println(Onome);
        System.out.println("\n FIM DO PROGRMA\n");

        //TEST DO SCAN
        System.out.print("digite um valor que sera somado com 10: ");
        Integer digitaAi = scan.nextInt();
        System.out.println(digitaAi + 10);
        System.out.println("\nFIM DO PROGRMA\n");

        //index/charAt de uma string
        String nome = "lucas";
        System.out.println(nome.charAt(0) + "-" + nome.charAt(1) + "-" + nome.charAt(2) + "-" + nome.charAt(3) + "-" + nome.charAt(4));
        System.out.println("\nFIM DO PROGRMA\n");

        //converter valor em string
        Float f = 10.0f;
        String.valueOf(f);// 10f e valor float
        String valorConvertido = String.valueOf(f);
        System.out.println(valorConvertido);
        System.out.println("\nFIM DO PROGRMA\n");

        //Poo vs type primitivos; a prova que java nao e so POO
        /*
        Integer n1 = 10;
        int n2 = 10;
        OBS:APAGUE O (.) E VEJA AS SUGESTOES.
        n1.;//possue metidos de funcoes derivadas da POO
        n2.;//int normal de outras linguagems
        */

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
