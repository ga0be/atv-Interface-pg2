public class Pix extends Pessoa{

    private String ChavePix;
    private double Saldo;

    public Pix(String NomeCompleto, String Email, String Telefone, String cpf, double ValorCompra, String ChavePix, double Saldo) {
        super(NomeCompleto, Email, Telefone, cpf, ValorCompra);
        this.ChavePix = ChavePix;
        this.Saldo = Saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }


    @Override
    public String ToString(){

        return "\nDados comprador: " + super.toString() + "\nNovo saldo: " + this.Saldo;

    }

    public String processarPagamento() {

       double NovoSaldo = getSaldo() - getValorCompra();
       setSaldo(NovoSaldo);

        return "\nCompra realizada com sucesso! " + "\n" + ToString() + "\nSaldo na conta Pix: " + this.Saldo;
    }



}
