package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem{
    private Integer numChar;

    public MsgTexto(Integer numChar, String nome, String celular, Contatinho destinatario, String horaEnvio, String conteudo) {
        super(nome, celular, destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public Integer getNumChar() {
        return numChar;
    }

    public void setNumChar(Integer numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }

}
