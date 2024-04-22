package endereco;
import java.util.Date;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private Endereco endereco;

    PessoaFisica(String nome, String sexo, Date dataNascimento, Endereco endereco){
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    PessoaFisica(String nome, String sexo, Date dataNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}