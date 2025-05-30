import java.time.LocalDate;

public class Checkout {

    public static void main(String[] args) {

        Pagamento[] objetosPagamentos = new Pagamento[3];

        objetosPagamentos[0] = new CartaoCredito("Roberto Silva" , "RobertoSilva@hotmail.com", "219872653", "162719", 280, "6782", "928", LocalDate.of(2040, 3, 12), 4000);

        objetosPagamentos[1] = new Boleto("Ana Elizabeth", "AnaE@hotmail.com", "8192365", "8297", 198, LocalDate.of(2025, 6, 10), 0);

        objetosPagamentos[2] = new Pix("Orlando Silva", "Orlando@hot", "829", "8378", 600, "0290", 2500);

        objetosPagamentos[0].processarPagamento();

        //for ( Pagamento elemento : objetosPagamentos )
            //{
             //System.out.printf("\nProcessando Pagamento: \n ", elemento.processarPagamento() );
            //}


    }

}
