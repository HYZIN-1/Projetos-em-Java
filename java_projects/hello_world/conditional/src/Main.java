//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Estruturas Condicionais:

        int nota = 100;
        String graduacao;

        // se nota maior ou igual a 70, aprovado
        // if-else

        // A = 80, B = 70, C = 60, D = 0
        if (nota >= 80) {
        graduacao = "A";
         } else if (nota >= 70) {
        graduacao = "B";
         } else if (nota >= 60) {
        graduacao = "C";
         } else if (nota >= 0) {
        graduacao = "D";
         } else {
             graduacao = "";
         }

        switch (graduacao) {
        case "A":
        case "B":
         System.out.println("Aluno aprovado!");
         break;
        case "C":
        case "D":
         System.out.println("Não aprovado.");
         break;
        default:
         System.out.println("Graduação inválida!");
        }
    }
}