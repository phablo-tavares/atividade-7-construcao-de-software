package endereco;
public class Logradouro {
    private String nome;
    public String tipoLogradouro; 

    Logradouro(String nome){
        this.nome = nome;
    }

    Logradouro(String nome, TipoLogradouro tipo){
        this.nome = nome;
        this.tipoLogradouro = tipo.toString();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
