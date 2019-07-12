public class ResponsavelPPJ {
    private final String nomeResponsavel;
    private String telefoneResponsavel;
    private int diaVencimento;
    private String documento;

    public ResponsavelPPJ(String nomeResponsavel, String telefoneResponsavel, int diaVencimento, String documento) {
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.diaVencimento = diaVencimento;
        this.documento = documento;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public String getDocumento() {
        return documento;
    }
}
