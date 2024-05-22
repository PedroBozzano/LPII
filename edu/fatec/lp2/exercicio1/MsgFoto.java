package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {

    private Integer tamanho;

    public MsgFoto(Integer tamanho, String nome, String celular, Contatinho destinatario, String horaEnvio, String conteudo) {
        super(nome, celular, destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }
    
}
