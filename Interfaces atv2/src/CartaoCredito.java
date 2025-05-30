import java.time.LocalDate;

public class CartaoCredito extends Pessoa {

    private String NumeroCartao;
    private String Cvc;
    private LocalDate DataVencimento;
    private double Limite;

    public CartaoCredito(String NomeCompleto, String Email, String Telefone, String cpf, double ValorCompra,  String NumeroCartao, String Cvc, LocalDate DataVencimento, double Limite) {

        super(NomeCompleto, Email, Telefone, cpf, ValorCompra);
        this.NumeroCartao = NumeroCartao;
        this.Cvc = Cvc;
        this.DataVencimento = DataVencimento;
        this.Limite = Limite;
    }

    public double getLimite() {
        return Limite;
    }

    public void setLimite(double Limite) {
        this.Limite = Limite;
    }

    @Override
    public String toString(){
        return "\n" + "Dados do pagador: " + "\n" + super.toString() + "\n" + "Dados do cartão: " +  "\n" + "Numero: " + this.NumeroCartao + "\nData de Vencimento: " + this.DataVencimento + "\nLimite atualizado: " + this.Limite + "\n";
    }

    @Override
    public String processarPagamento() {

        double  NovoLimite = getLimite() - getValorCompra();
        setLimite(NovoLimite);

        return "\nCompra realizada com sucesso! " + "\n" + toString();

    }








}
