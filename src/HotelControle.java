import java.util.ArrayList;

public class HotelControle {
    private ArrayList<Quarto> quartosDisponiveis;

    public HotelControle() {
        this.quartosDisponiveis = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            // Corrigir a criação de instâncias de Quarto
            quartosDisponiveis.add(new Quarto(i, true));
        }
    }

    public void realizarReserva(Hospede hospede, int numeroQuarto) {
        Quarto quartoSelecionado = buscarQuarto(numeroQuarto);
        if (quartoSelecionado != null && quartoSelecionado.getStatusDisponibilidade()) {
            // Adicionar método reservar() à classe Quarto
            quartoSelecionado.reservar(hospede);
            System.out.println("Reserva realizada! Quarto: " + numeroQuarto);
        } else {
            System.out.println("Quarto indisponível ou não encontrado!");
        }
    }

    public void realizarCheckIn(int numeroQuarto) {
        Quarto quartoSelecionado = buscarQuarto(numeroQuarto);
        if (quartoSelecionado != null && !quartoSelecionado.getStatusDisponibilidade()) {
            System.out.println("CheckIn realizado para o quarto " + numeroQuarto);
        } else {
            System.out.println("Quarto ocupado ou não encontrado!");
        }
    }

    public void realizarCheckOut(int numeroQuarto) {
        Quarto quartoSelecionado = buscarQuarto(numeroQuarto);
        if (quartoSelecionado != null && !quartoSelecionado.getStatusDisponibilidade()) {
            // Adicionar método realizarCheckOut() à classe Quarto
            quartoSelecionado.realizarCheckOut();
            System.out.println("CheckOut realizado! Quarto: " + numeroQuarto);
        } else {
            System.out.println("Quarto não ocupado ou não encontrado!");
        }
    }

    private Quarto buscarQuarto(int numeroQuarto) {
        for (Quarto quarto : quartosDisponiveis) {
            if (quarto.getNumeroQuarto() == numeroQuarto) {
                return quarto;
            }
        }
        return null; // retorna null se o quarto não for encontrado
    }
}
