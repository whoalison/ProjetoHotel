import java.util.List;

public class RepositorioReserva {
    private List<Reserva> reservas;

    public RepositorioReserva(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void adicionarReserva (Reserva reserva) {
        reservas.add(reserva);
        // adiciona uma reserva na lista de reservas do sistema
    }
    public List<Reserva> getAllReserva () {
        return reservas;
        // retorna a lista completa de reservas
    }

    public void removerReserva(int id) {
        reservas.removeIf(reserva -> reserva.getId() == id);
        //remove uma reserva da lista de reservas do sistema
    }
    public Reserva getReservaPorId (int id) {   // id: numero do cadastro de cada hospede "comanda"
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
        // procura uma reserva na lista com base no id fornecido, caso não encontre retorna nulo
    }
}