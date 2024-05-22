package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;

public class Whatsapp{

    private ArrayList<Contatinho> Contatos;
    private ArrayList<Mensagem> Mensagens;

    
    public Whatsapp(ArrayList<Contatinho> contatos, ArrayList<Mensagem> mensagens) {
        Contatos = contatos;
        Mensagens = mensagens;
    }
    public ArrayList<Contatinho> getContatos() {
        return Contatos;
    }
    public void setContatos(ArrayList<Contatinho> contatos) {
        Contatos = contatos;
    }
    public ArrayList<Mensagem> getMensagens() {
        return Mensagens;
    }
    public void setMensagens(ArrayList<Mensagem> mensagens) {
        Mensagens = mensagens;
    }

    public void listarContatos(){
        for(int i=0; i<Contatos.size(); i++){
            System.out.println("Contato "+i+": "+ Contatos.get(i));
        }
    }
    
    public void listarMensagens(){
        for(int i=0; i<Mensagens.size(); i++){
            System.out.println("Mensagem "+i+": "+ Mensagens.get(i));
        }
    }
}
