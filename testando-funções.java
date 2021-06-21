public class funcoes {//ctrl + b = esolicacao de funcao/posibilidades de funcao
    //FUNCAO 
    public int testsoma(int a, int b) {
        return a+b;
    }

    //1. Escreva uma função privada chamada helloWorld que não possui retorno algum e não
    //recebe nenhum parâmetro.
    //2. Modifique a função helloWorld para que receba uma String e retorne a quantidade de
    //caracteres como um número inteiro.
    //3. Modifique o retorno da função helloWorld para que retorne uma String com o seguinte
    //formato:
    //"A palavra possui X caracteres."
    //X - Deve ser a quantidade de caracteres da palavra passada por parâmetro.
    private String helloWord(String strin){
        return "A palavra possui " + strin.length() + " caracteres.";
    }
    //4.Crie uma nova função capaz de receber dois números e retornar a soma dos mesmos.
    public int soma(int num1,int num2) {
        return num1 + num2;
    }
    //5. Crie uma função que receba 3 números com casas decimais e execute o seguinte
    //cálculo:
    //((x + y) * x) / z
    //Faça o retorno com casas decimais.
    public Float decimal(Float x, Float y, Float z){
        return (((x + y) * x) / z);
    }
    
    //RUN
    public static void main(String[] args) {
        funcoes aquelaLA = new funcoes();
        System.out.println(aquelaLA.testsoma(10,5));

        funcoes func = new funcoes();
        System.out.println(func.helloWord("lucassghugkhjgl"));

        funcoes fun = new funcoes();
        System.out.println(fun.soma(10,20));

        funcoes fu = new funcoes();
        System.out.println(fu.decimal(2f, 4f, 2f ));


        //FUNCOES STRING
        String str= "  curso java    ";

        System.out.println(str.charAt(5));

        //se o charAt for muito grande ele buscara em null em String, nao funciconando o restante do codigo entao, colocamos um try
        try {
            System.out.println(str.charAt(200));
        }catch (StringIndexOutOfBoundsException e){//se nao conseguir ou detectar o Erro(string que antecede a memoria) faça:
            System.out.println("erro diferente");
        }catch (NullPointerException e){//se nao conseguir ou detectar o Erro(ponto nullo) faça:
            System.out.println("erro diferenciadao");
        }catch(Exception e) {//se nao conseguir ou detectar o Erro(todos que antecede a memoria) faça:
            System.out.println("erro diferenciado");
        }finally {
            System.out.println("vai mesmo a sim");//o catch nao achou o problema do try o codigo e iguinorado e passa a tiante para seu fechamento
        }
        //try permite o que o codigo continue mesmo com erro, isolanduo
        System.out.println(str.equals(" curso java   "));//boolean se(str) = ("")

        System.out.println(str.startsWith("curs"));//boolean se comeca com()
        System.out.println(str.endsWith("java"));//boolean se termina com()

        System.out.println(str.substring(2));//escreva somente os index()
        System.out.println(str.substring(2, 7));//escreva somente os index() ate o index()

        System.out.println(str.replace("java", "javaaa!"));//substitua terget"",para replacement""

        System.out.println(str.toUpperCase());//tudo maiusculo
        System.out.println(str.toLowerCase());//tudo minusculo

        System.out.println(str.trim());//remove espacos do começo e do final

        System.out.println(str.length());//numero de caracter

    }
}
