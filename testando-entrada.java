 /*tipos de comentaros */
    /**
     * texto
     */
    //ctl+alt+L
    /*texto*/
/*type bit
    (valores quebrados/ racionais)
    Bouble  64 (Double d = 10.0241864541485489421057484120468;)
    Float   32 (Float f = 100.4185465184841231f;)
    (inteiros)
    Long    64 (Long l = 10165412021adsfasdfasdfasdfasdfasdfal;)
    Int     32 (Integer i =100;)
    Short   16 (Short S = 10;)
    Byte    8 (Byte b = 10;)
    Char    2 (character c = 'a')
    String  ? (terterminado por mim)
    Boolean ? (determinado pelo JVK se for true ou false)
 */
 public class OlaMundo {                      //ctl+alt+L = catenacao automatica da ide
     public static void main(String[] args) {  //= psvm
         System.out.println("olá, mundo!");    //= sout


         //VARIAVES
         String nome = "Lucas";
         Integer soma = 10 + 2;

         System.out.println(nome);
         System.out.println(soma);


         //USO DE MEMORIA DAS VARIAVES
         System.out.println("Double: Max: " + Double.MAX_VALUE + " - Double: " +
                 Double.MIN_VALUE);
         System.out.println("Float: Max: " + Float.MAX_VALUE + " - Min: " +
                 Float.MIN_VALUE);
         System.out.println("Long: Max: " + Long.MAX_VALUE + " - Long: " +
                 Long.MIN_VALUE);
         System.out.println("Integer: Max: " + Integer.MAX_VALUE + " - Min: " +
                 Integer.MIN_VALUE);
         System.out.println("Short: Max: " + Short.MAX_VALUE + " - Min: " +
                 Short.MIN_VALUE);
         System.out.println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " +
                 Byte.MIN_VALUE);


         //OPERADORES JAVA
         int numero = 10;
         System.out.println(2 + numero);
         System.out.println(numero - 8);
         System.out.println(numero / 5);
         System.out.println(numero % 3);//resto de uma divisao

         System.out.println("uso de operadores");
         int num = 10;
         num *=2;//= num = num * 2
         num=num+1; //num = 20 + 1/num= 21
         System.out.println(num);
         System.out.println("encremento e decremento");
         //num=21
         System.out.println(num++);//= /num=num+1/num+=1
         System.out.println(num);
         System.out.println(--num);//= num-1=num/1=-num
         //num=21


     }
 }
