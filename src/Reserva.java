import java.util.Date;

public class Reserva {
    private Date dataCheckIn;
    private Date dataCheckOut;
    private Hospede hospede;
    private Quarto quartoReservado;
    private Quarto quarto;
    private double preco;
    private int id;
    private Pagamento pagamento;

    public Reserva(Date dataCheckIn, Date dataCheckOut, Hospede hospede, Quarto quartoReservado, Quarto quarto, double preco, int id, Pagamento pagamento) {
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.hospede = hospede;
        this.quartoReservado = quartoReservado;
        this.quarto = quarto;
        this.preco = preco;
        this.id = id;
        this.pagamento = pagamento;

    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuartoReservado() {
        return quartoReservado;
    }

    public void setQuartoReservado(Quarto quartoReservado) {
        this.quartoReservado = quartoReservado;
    }
}