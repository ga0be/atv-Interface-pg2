import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Boleto extends Pessoa {

    private LocalDate DataVencimento;
    private double Juros;

    public Boleto(String Nome, String Email, String Telefone, String cpf, double ValorCompra, LocalDate DataVencimento, double Juros) {
        super(Nome, Email, Telefone, cpf, ValorCompra);
        this.DataVencimento = DataVencimento;
        this.Juros = Juros;

    }

    public double getJuros() {
        return this.Juros;
    }


    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nDados comprador: " + super.toString() + "\n Data de Vencimento: " + this.DataVencimento.format(formatter) + "\n Juros: " + + this.Juros + "\n";
    }

    @Override
    public String processarPagamento() {
        double  ValorNovo = getValorCompra() + getJuros();
        setValorCompra(ValorNovo);
        return "\nPagamento realizado com sucesso!" + "\n" + "Extrato: " + toString();
    }
}
