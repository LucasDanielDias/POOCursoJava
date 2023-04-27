package POOJAVA.composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();
    void  adcionarItem(Produto p, int quantidade){
        this.itens.add(new Item(p,quantidade));
    }
    void adcionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(new Produto(nome,preco),quantidade));
    }

    void  adcionarIten(String nome, double preco, int quantidade){
        var produto = new Produto(nome,preco);
        this.itens.add(new Item(produto,quantidade));
    }

    double obterValorTotal(){
        double total = 0;

        for (Item item:this.itens){
            total += item.quant * item.produto.preco;
        }
        return total;
    }
}
