 /* tipos de comentaros */
         /**
         * texto
         * /
         // ctl + alt + L
         / * texto * /
         / * tipo bit
         (valores quebrados / racionais)
         Problema 64 (Double d = 10.0241864541485489421057484120468;)
         Flutuante 32 (Flutuante f = 100,4185465184841231f;)
         (inteiros)
         Long 64 (Long l = 10165412021adsfasdfasdfasdfasdfasdfal;)
         Int 32 (inteiro i = 100;)
         Curto 16 (Curto S = 10;)
         Byte 8 (Byte b = 10;)
         Caractere 2 (caractere c = 'a')
         Fragmento ? (terterminado por mim)
         Boleano ? (determinado pelo JVK se for verdadeiro ou falso)
         */
public  class  OlaMundo {                       // ctl + alt + L = catenacao automatica da ide
    public  static  void  main(String [] args){   // = psvm
        Sistema.out.println("olá, mundo!");    // = sout


        // VARIAVES
        String nome =  "Lucas";
        Soma inteiro = 10 + 2;

        Sistema.out.println(nome);
        Sistema.out.println(soma);


        // USO DE MEMÓRIA DAS VARIAVES
        Sistema.out.println ("Duplo: Máx:" + Duplo.MAX_VALUE  +  " - Duplo: "  +
                Dobrar . MIN_VALUE );
        Sistema . para fora . println ( " Float: Max: "  +  Float.MAX_VALUE  +  " - Min: "  +
                Float . MIN_VALUE );
        Sistema.out.println ( " Long: Max: "  +  Long.MAX_VALUE  +  " - Long: "  +
                Longo . MIN_VALUE );
        Sistema.out.println ( " Inteiro: Máx: "  +  Inteiro . MAX_VALUE  +  " - Mín: "  +
                Inteiro . MIN_VALUE );
        Sistema.out.println ("short:Máx:" + short.MAX_VALUE + "-Min:" +
               short.MIN_VALUE );
        Sistema.out.println ( "Byte:Max:" + Byte.MAX_VALUE + "-Min:" +
               Byte.MIN_VALUE);


        // OPERADORES JAVA
        numero int = 10;
        Sistema.out.println(2+numero);
        Sistema.out.println(numero-8);
        Sistema.out.println(numero/5);
        Sistema.out.println(numero%3); // resto de uma divisão

        Sistema.out.println("uso de operadores");
        int num =  10 ;
        num * = 2 ; // = num = num * 2
        num = num + 1 ; // num = 20 + 1 / num = 21
        Sistema.out.println(num);
        Sistema.out.println("incremento e decremento");
        // num = 21
        Sistema.out.println(num++); // = / num = num + 1 / num + = 1
        Sistema.out.println(num);
        Sistema.out.println(-num); // = num-1 = num / 1 = -num
        // num = 21
    }
}
