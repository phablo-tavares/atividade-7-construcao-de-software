public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Bairro bairro;
    private Logradouro logradouro;

    public Endereco(int numero, String complemento, int cep, Bairro bairro, Logradouro logradouro){
        this.numero = numero;
        this.Complemento = complemento;
        this.CEP = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
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