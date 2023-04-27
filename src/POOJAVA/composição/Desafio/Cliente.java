package POOJAVA.composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String Nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        Nome = nome;
    }
    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    double obterValorTotal(){
        double total = 0;
        for (Compra c: compras){
            total +=c.obterValorTotal();
        }
        return total;
    }
}
