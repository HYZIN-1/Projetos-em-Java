import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Manipulação de Strings e Datas:

        // Olá, {nome}. Hoje é {diaDaSemana}, BOM DIA!

        String nome = "HYZIN";

        // ISO 8601 (Data padrao para o mundo inteiro)
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom Dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa Noite!";
        } else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s%n", nome, diaSemana, saudacao.toUpperCase());
        System.out.printf("Olá, %s. Hoje é %s, %s", diaSemana, nome, saudacao.toUpperCase());
    }
}