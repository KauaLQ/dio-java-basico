public class Operadores {
    public static void main(String[] args) {
        double soma = 14.3 + 12.2;
        int subtracao = 2 - 4;
        int multiplicacao = 23 * 3;
        int divisao = 12 / 3;
        double modulo = 13 % 2; //mostra o resto da divisão. no caso ao lado mostrará 1.0
        double resultado = soma + subtracao + multiplicacao + divisao + modulo;
        //System.out.print(resultado);

        //O operador + quando usado em String's serve para concatená-las:
        String nomeLinguagem = "linguagem" + "Java";
        //System.out.print(nomeLinguagem);

        //Operadores unários:
        int numero = 4;
        numero = - numero;//Torna o número negativo.
        numero = numero * -1;//Torna o número positivo novamente.
        numero++;//Operação de incremento. adiciona 1 à variável numero.
        numero--;//Operação de decremento. subtrai 1 à variável numero.
        //System.out.print(numero);

        boolean entrada = true;
        entrada = !entrada;//inverte uma variável boleana.
        //System.out.print(entrada);

        //Operador de condição ternário. Similar ao IF mas em umma única linha.
        int a, b;
        a = 2;
        b = 3;

        boolean saida = a==b ? true : false;
        //System.out.print(saida);

        //Operadores relacionais:
        boolean simNao = a<=b;
        //System.out.print("'a' é igual a 'b'? " + simNao);
        String nome1 = "Kaua";
        String nome2 = "Lima";
        //System.out.print(nome1.equals(nome2));

        //Operadores lógicos:
        if (simNao && entrada){
            System.out.print("as duas são verdadeiras");
        } else if (simNao || entrada) {
            System.out.print("uma das duas é verdadeira");
        } else {
            System.out.print("nada acontece");
        }
    }
}
