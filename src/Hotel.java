import java.util.List;

public class Hotel {

    private int quartosDisponiveis;

    private List<Hospede> hospedes;
    private List<Reserva> reservas;
    private List<Quarto> quartos;
    private int quantidadeQuartos;

    public Hotel (int quartosDisponiveis, List<Hospede> hospedes, List<Reserva> reservas, List<Quarto> quartos, int quantidadeQuartos) {
        this.quartosDisponiveis = quartosDisponiveis;
        this.hospedes = hospedes;
        this.reservas = reservas;
        this.quartos = quartos;
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(List<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }


    public int getQuartosDisponiveis() {
        return quartosDisponiveis;
    }

    public void setQuartosDisponiveis(int quartosDisponiveis) {
        this.quartosDisponiveis = quartosDisponiveis;
    }
}