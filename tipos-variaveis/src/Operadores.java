public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + " JAVA";
        //concatenação usamos o sinal de + quando é uma string
        //a partir do momento que um string é detectada todo o resto será concatenado, caso a string esteja no final será somado
        //até chegar na string , chegando nela a soma concatena com a string. 
        
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //OPeradores unarios

        int numero = 5;

        //resultado negativo
        numero = - numero;
        System.out.println(numero);

        //Tornando um resultado negativo em positivo
        numero = numero * -1;
        System.out.println(numero);

    }
}
   
