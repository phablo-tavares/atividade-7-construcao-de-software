public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Bairro bairro;
    private Logradouro logradouro;
    private String tipoEndereco;

    public Endereco(int numero, String complemento, int cep, Bairro bairro, Logradouro logradouro, TipoEndereco tipo){
        this.numero = numero;
        this.Complemento = complemento;
        this.CEP = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.tipoEndereco = tipoEndereco.toString();
    }

    public int getCEP() {
        return CEP;
    }
    public String getComplemento() {
        return Complemento;
    }
    public int getNumero() {
        return numero;
    }
    public void setCEP(int cEP) {
        CEP = cEP;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Bairro getBairro() {
        return bairro;
    }
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}