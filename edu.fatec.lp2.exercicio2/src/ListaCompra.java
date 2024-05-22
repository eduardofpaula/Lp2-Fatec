import java.util.List;

public class ListaCompra implements Calculavel{
    private List<ItemCompra> ItemCompra[];
    private int qtdeMax;

    public List<ItemCompra>[] getItemCompra() {
        return ItemCompra;
    }

    public void setItemCompra(List<ItemCompra>[] itemCompra) {
        ItemCompra = itemCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    @Override
    public double calcularPreco(){

    }

}
