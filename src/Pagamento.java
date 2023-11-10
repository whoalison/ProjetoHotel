import java.util.Date;

public class Pagamento {
    private double valorTotal;
    private Date dataPagamento;
    private int id;

    public Pagamento(double valorTotal, Date dataPagamento, int id) {
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}