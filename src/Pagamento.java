import java.util.Date;

public class Pagamento {
    private double valorTotal;
    private Date dataPagamento;
    private String identificador;
    private String metodoPagamento;

  public Pagamento(double valorTotal, Date dataPagamento, String identificador, String metodoPagamento) {
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.identificador = identificador;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setId(String identificador) {
        this.identificador = identificador;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}