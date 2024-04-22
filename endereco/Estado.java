package endereco;
public class Estado {
    private String sigla;
    public String nome;
    private Pais pais;

    Estado(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    Estado(String sigla, String nome, Pais pais){
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
