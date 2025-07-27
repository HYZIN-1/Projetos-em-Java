//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Operadores Booleanos | Tabela Verdade:

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // tabela verdade

        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR) (Pipe Pipe)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        String menssagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        String sol = fazendoSol ? "Está fazendo sol" : "Não está fazendo sol";

        System.out.println(menssagem + " e " + sol);
    }
}