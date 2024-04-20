public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Bairro bairro;

    public Endereco(int numero, String complemento, int cep, Bairro bairro){
        this.numero = numero;
        this.Complemento = complemento;
        this.CEP = cep;
        this.bairro = bairro;
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
}