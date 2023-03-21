import entities.entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Enumeracoes {
    public static void main(String[] args) {
        /*
        * É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
        * Palavra chave em java: enum
        * Vantagem: Melhor semântica, código mais legível e auxiliado pelo compilador
        * */
        /*
         * Ciclo de vida de um pedido:
         * Pagamento do pedido (pendente)
         * Processando
         * Enviado
         * Entregue
         */

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        //Conversão de string para um enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    }
}
