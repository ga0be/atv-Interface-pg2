public abstract class Pessoa implements Pagamento {

    private String NomeCompleto;
    private String Email;
    private String Telefone;
    private String cpf;
    private double ValorCompra;


    public Pessoa(String NomeCompleto, String Email, String Telefone, String cpf, double ValorCompra) {
        this.NomeCompleto = NomeCompleto;
        this.Email = Email;
        this.Telefone = Telefone;
        this.cpf = cpf;
        this.ValorCompra = ValorCompra;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }
    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorCompra() {

        return ValorCompra;

    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    @Override
    public String toString(){

        return "\nNome: " + this.NomeCompleto + "\nEmail: " + this.Email + "\nTelefone: " + this.Telefone + "\nCPF: " + this.cpf + "\nValorCompra: " + this.ValorCompra;
    }

}