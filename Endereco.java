public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;

    public Endereco(int numero, int complemento, int cep){
        this.numero = numero;
        this.Complemento = complemento;
        this.CEP = cep;
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
}