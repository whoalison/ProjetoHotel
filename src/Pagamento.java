import java.util.Date;

public class Pagamento {
    private double valorTotal;
    private Date dataPagamento;
    private String id;
    private String metodoPagamento;

  public Pagamento(double valorTotal, Date dataPagamento, String id, String metodoPagamento) {
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.identificador = id;
        this.metodoPagamento = metodoPagamento;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}