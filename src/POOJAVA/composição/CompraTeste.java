package POOJAVA.composição;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.nomeCliente = "João";
        c1.itens.add(new Item("caneta",1,4.9));
        c1.itens.add(new Item("borracha",2,5.5));
        c1.itens.add(new Item("lapis",7,10.5));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

    }
}
