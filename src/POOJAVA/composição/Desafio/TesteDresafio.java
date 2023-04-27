package POOJAVA.composição.Desafio;

import java.util.Scanner;

public class TesteDresafio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("maria Julia");

        Compra compra1= new Compra();
        compra1.adcionarItem("Caneta",9.6,5);
        compra1.adcionarItem(new Produto("Notebook",1589.60),10);

        Compra compra2= new Compra();
        compra2.adcionarItem("Caderno",95.6,59);
        compra2.adcionarItem(new Produto("Notebook Intel",1999.60),10);

        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
