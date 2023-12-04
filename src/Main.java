import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Repositórios
        List<Hospede> hospedes = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        List<Quarto> quartos = new ArrayList<>();
        List<Pagamento> pagamentos = new ArrayList<>();

        RepositorioHospede repoHospede = new RepositorioHospede(hospedes);
        RepositorioReserva repoReserva = new RepositorioReserva(reservas);
        RepositorioQuarto repoQuarto = new RepositorioQuarto(quartos);
        RepositorioPagamento repoPagamento = new RepositorioPagamento(pagamentos);

        // Criando instância de Hotel
        Hotel hotel = new Hotel(50, hospedes, reservas, quartos, 100);

        // Criando instâncias de Hospede, Quarto e Pagamento (exemplo)
        Hospede hospede1 = new Hospede("Maria", "Virginia", "Rua da Alegria, 123", 30, "12345678901", "(81)993456789", "mariavirginia@gmail.com", 1);
        Quarto quarto1 = new Quarto("Luxo", 101, true);
        Pagamento pagamento1 = new Pagamento(150.0, new Date(), 1);

        // Cadastrando Hospede, Quarto e Pagamento nos repositórios
        repoHospede.cadastrarHospede(hospede1);
        repoQuarto.adcionarQuarto(quarto1);
        repoPagamento.adicionarPagamento(pagamento1);

        // Criando uma Reserva
        Reserva reserva1 = new Reserva(new Date(), new Date(), hospede1, quarto1, quarto1, 150.0, 1, pagamento1);

        // Adicionando a Reserva ao Repositório de Reservas
        repoReserva.adicionarReserva(reserva1);

        //Testando algumas das instancias criadas
        System.out.println("Lista de Hospedes:");
        List<Hospede> listaHospedes = repoHospede.getAllHospedes();
        for (Hospede h : listaHospedes) {
            System.out.println(h.getNome() + " " + h.getSobrenome());
        }

        System.out.println("\nLista de Reservas:");
        List<Reserva> listaReservas = repoReserva.getAllReserva();
        for (Reserva r : listaReservas) {
            System.out.println("Reserva " + r.getId() + ": " + r.getHospede().getNome() + " " + r.getHospede().getSobrenome());
        }

        System.out.println("\nQuartos Disponíveis: " + hotel.getQuartosDisponiveis());
    }
}
