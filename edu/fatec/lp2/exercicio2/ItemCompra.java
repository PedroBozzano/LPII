package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{
    Integer quantidade;
    Produto produto;
    Double desconto;

    public Double getDesconto() {
        return desconto;
    }
    public Produto getProduto() {
        return produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public void itemCompra(Produto produto, Double desconto) {
        setProduto(produto);
        setDesconto(desconto);
    }
    
    @Override
    public Double calcularPreco() {
        Produto p = new Produto();
        return p.preco - desconto;
    }
}
