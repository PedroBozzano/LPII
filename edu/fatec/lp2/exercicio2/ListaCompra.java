package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
    ItemCompra[] itensCompra;
    Integer qtdeMax;

    public ItemCompra[] getItensCompra() {
        return itensCompra;
    }
    public void setItensCompra(ItemCompra[] itensCompra) {
        this.itensCompra = itensCompra;
    }
    public Integer getQtdeMax() {
        return qtdeMax;
    }
    public void setQtdeMax(Integer qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public ItemCompra[] ListaCompra(Integer qtdeMax) {
        return getItensCompra();
    }

    public void Incluir(ItemCompra item) {
        Integer position = 0;
        itensCompra = new ItemCompra[qtdeMax];
        itensCompra[position] = item;
        position += 1;
    }
    
    @Override
    public Double calcularPreco() {
        Produto p = new Produto();
        ItemCompra ic = new ItemCompra();
        return (p.preco*p.unidade) - ic.desconto;
    }
}