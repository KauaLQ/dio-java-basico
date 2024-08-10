package edu.kaua.sintaxe;
import java.util.Locale;
import java.util.Scanner;
public class ClasseScanner {
    public static void main(String[] args) {
        //criando objeto scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);//Locale é utilizado apenas como referência para as numerações.

        System.out.print("Digite seu primeiro nome...");
        String nome = scanner.next();

        System.out.print("Digite seu primeiro sobrenome...");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade...");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura...");
        double altura = scanner.nextDouble();

        System.out.print("Olá, " + nome + " " + sobrenome + ", " + "seja bem-vindo! ");
        System.out.print("Sua idade é " + idade + "; ");
        System.out.print("Sua altura é " + altura + ".");
    }
}
