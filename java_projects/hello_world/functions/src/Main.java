//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Funçoes

        int result = soma(2, 3);
        System.out.println(result);

        String nomeOriginal = "HYZIN!";
        saudacao(nomeOriginal);


    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }

}