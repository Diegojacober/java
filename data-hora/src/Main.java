import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // data-[hora] local: ano-mês-dia-[hora] sem fuso horário, [hora] opcional
        // data-hora global: ano-mês-dia-hora com fuso horário
        //duração: tempo decorrido entre as duas datas

        //GMT - Greenwich mean time
        /*
         - horário de Londres
         - Horario do padrão UTC - Coordinated Universal Time
         - Também chamado de "Z" time, ou zulu time

         GMT/UTC:
         - São Paulo: Gmt-3
         - Manaus> GMT-4
         - Portugal GMT+1

         PADRÃO ISO 8601:

         Data-[hora]-local:
            2022-07-21
            2022-07-21T14:52
            2022-07-21T14:52:09
            2022-07-21T14:52:09.4073

         Data-hora global:
            2022-07:23T14:52:09Z
            2022-07:23T14:52:09.68464Z
            2022-07:23T14:52:09-03:00
         */

        // instanciando data-hora em java

        //exibe ano-mes-dia
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        // exibe ano-mes-diaThora:minuto:segundos
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        // exibe ano-mes-diaThora:minuto:segundosZ z-> do padrão gmt/utc
        Instant d03 = Instant.now();
        System.out.println(d03);

        LocalDate d04 = LocalDate.parse("2023-05-16");
        System.out.println(d04.toString());

        LocalDateTime d05 = LocalDateTime.parse("2023-07-23T05:30:26");
        System.out.println(d05.toString());

        Instant d06 = Instant.parse("2023-07-23T05:30:26Z");
        System.out.println(d06.toString());

        // vai exibir o horario informado convertido para o padrão informado
        Instant d07 = Instant.parse("2023-07-23T05:30:26-03:00");
        System.out.println(d07.toString());

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        System.out.println(d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 15:50", fmt2);
        System.out.println(d09);
    }
}