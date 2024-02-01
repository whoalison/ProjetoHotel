import java.time.LocalDate;

public class Pagamento {
    private double valorTotal;
    private LocalDate dataPagamento;
    private int id;
    private String metodoPagamento;

    public Pagamento(double valorTotal, LocalDate dataPagamento, int id, String metodoPagamento) {
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.id = id;
        this.metodoPagamento = metodoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public int getId() {
        return id;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}

