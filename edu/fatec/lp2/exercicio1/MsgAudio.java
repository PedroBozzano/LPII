package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem{
    private Integer duracao;

    public MsgAudio(Integer duracao, String nome, String celular, Contatinho destinatario, String horaEnvio, String conteudo) {
        super(nome, celular, destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }
    
}
