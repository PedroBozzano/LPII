package edu.fatec.lp2.exercicio1;

public abstract class Mensagem extends Contatinho{
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    
    public Mensagem(String nome, String celular, Contatinho destinatario, String horaEnvio, String conteudo) {
        super(nome, celular);
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }
    public String getHoraEnvio() {
        return horaEnvio;
    }
    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public String toString() {
        return "Mensagem{" +
                "destinatario=" + destinatario.getNome() + " (" + destinatario.getCelular() + ")" +
                ", horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }

    public abstract Mensagem sendMessage();
}
