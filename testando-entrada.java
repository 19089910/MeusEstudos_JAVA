import  java.util.Scanner ; // biblioteca escan

public  class  saida {
     public  static  void  main ( String [] args ) {
         String seila;

         Varredura do scanner =  novo  scanner ( sistema . In); // = nome_variável tipo = novo tipo (entrar no sistema) / Nome_variável recebe tipo (sua função)

         Sistema . para fora . print ( " informe um nome: " );
         seila = digitalizar . nextLine (); / * * String stringname = scanner.nextLine ();
                                   * Double doubleValor = scanner.nextDoubel ();
                                   * Fluat floatValor = scanner.nextFluat ();
                                   * Short shortValor = scanner.nextShort ();
                                   * Inteiro intValor = scanner.nextInt ();
                                   * Byte byteValor = scanner.nextByte ();
                                   * Boolean bool = scanner.nextBoolean ();
                                * /
         Sistema . para fora . println (seila);
        // teste
         Sistema . para fora . print ( " digite um valor: " );
         Integer digitaAi = scan . nextInt ();
         Sistema . para fora . println (digitaAi +  10 );

         // index / char de uma string
         Nome da string =  " lucas " ;
         Sistema . para fora . println (nome . charAt ( 0 ) +  " - "  + nome . charAt ( 1 ) +  " - "
                 + nome . charAt ( 2 ) +  " - "  + nome . charAt ( 3 ) +  " - "  + nome . charAt ( 4 ));

         // conversor valor em string
         String . valueOf ( 10f ); // 10f e valor float

         Float f =  10.0f ;
         String valorConvertido =  String . valueOf (f);
         Sistema . para fora . println (valorConvertido);

         // Poo vs type primitivos; a prova que java nao e so POO
         Inteiro n1 =  10 ;
         int n2 =  10 ;
         n1 . ; // possue metidos de funcoes derivadas da POO
         n2 . ; // int normal de outras linguagens
         /** POO primitivos
          * Dobro dobro
          * Desprezar desrespeito
          * Longo longo
          * Inteiro int
          * Curto curto
          * Byte byte
          * Boolean boolean
          * Cher cher
          * String nao Tem pois e diferente * /

     }
 }
