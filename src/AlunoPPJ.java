import java.util.Date;

public class AlunoPPJ {
    private final String nome;
    private int idade;
    private Date dataNascimento;
    private Date dataIngresso;
    private String escolaAnoEscolar;
    private double mensalidade;
    private String telefoneAluno;

    public AlunoPPJ(String nome, int idade, Date dataNascimento, Date dataIngresso, String escolaAnoEscolar,
                 double mensalidade, String telefoneAluno) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.dataIngresso = dataIngresso;
        this.escolaAnoEscolar = escolaAnoEscolar;
        this.mensalidade = mensalidade;
        this.telefoneAluno = telefoneAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public String getEscolaAnoEscolar() {
        return escolaAnoEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }
}