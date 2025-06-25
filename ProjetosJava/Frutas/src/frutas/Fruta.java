package frutas;

public class Fruta {
    private int id;
    private String Nome;
    private String Quantidade;
    private String Maturacao;
    private String localColhido;

    //constructor
    public Fruta(int id, String Nome, String Quantidade, String Maturacao, String localColhido) {
        this.id = id;
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.Maturacao = Maturacao;
        this.localColhido = localColhido;
    }

    //constructor vazio
    public Fruta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getMaturacao() {
        return Maturacao;
    }

    public void setMaturacao(String Maturacao) {
        this.Maturacao = Maturacao;
    }

    public String getLocalColhido() {
        return localColhido;
    }

    public void setLocalColhido(String localColhido) {
        this.localColhido = localColhido;
    }

}
