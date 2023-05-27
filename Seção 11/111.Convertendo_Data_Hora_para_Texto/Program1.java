import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

package 111.convertendo_data_hora_para_texto;

public class Program1 {

    public static void main(String[] args) {
        // Criando o objeto Data

        LocalDate d04 = LocalDate.parse("2023-05-27");
        LocalDate d05 = LocalDate.parse("2022-05-20T01:30:26");
        Instant d06 = Instant.parse("2022-05-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println(" d04 = " + fmt1.format(d04));
        System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + d06.format(fmt2));
        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + d06.getEpochSecond());
        System.out.println("d06 = " + d06.getNano());

    }
    
}
