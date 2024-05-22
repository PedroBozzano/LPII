package edu.fatec.lp2.exercicio2;

public class Produto {
    String nome;
    Integer unidade;
    String descricao;
    Double preco;
    Double descontoMaximo;
    Supermercado supermercado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(Double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public Supermercado Produtos(Supermercado supermercado)  {
        return supermercado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
