package teste;

public class test {
    private String nomeportador;
    private Integer idade = 0;
    private String tipoc;

    public void setPortador(String Portador) {
        nomeportador = Portador;
    }

    public String getPortador() {
        return nomeportador;
    }

    public void setIdade(Integer Idade) {
        idade = Idade; }

    public Integer getIdade() {
        return idade; }

    public void setTipoC(String TipoC) {
        tipoc = TipoC; }

    public String getTipoC() {
        return tipoc; }

    public void mostrarCadastro() {
        System.out.printf("\nPortador: %s\nIdade: %d\nTipo da Conta: %s\n", getPortador(), getIdade(), getTipoC());
    }
}