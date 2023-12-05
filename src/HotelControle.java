public class HotelControle {

    public HotelControle() {
        this.quartoDisponiveis = new ArrayList<>();
        for (int i = 1; i <= 20; i++){
            quartosDisponiveis.add(new Quarto(i));
        }
    }

    public void realizarReserva(Hospede hospede, int numeroQuarto){
        Quarto quartoSelecionado = buscarQuarto(numeroQuarto);
        if(quartoSelecionado != null && quartoSelecionado.isDisponivel()) {
            quartoSelecionado.reservar(hospede);
            System.out.println("Reserva realizada!" + numeroQuarto);
        } else { 
            System.out.println("Quarto indisponivel!");
        }
    }

    public void realizarCheckIn(int numeroQuarto) {
        Quarto quartoSelecionado = buscarQuarto(numeroQuarto);
        if (quartoSelecionado != null && !quartoSelecionado.isDisponivel()){
            System.out.println("CheckIn realizado para o quarto " + numeroQuarto);
        } else {
            System.out.println("Quarto ocupado!");
        }
    }

    public void realizarCheckOut(int numeroQuarto) {
        Quarto quartoSelecionado = buscarQuarto(numeroQuarto);
        if(quartoSelecionado != null && !quartoSelecionado.isDisponivel()){
            quartoSelecionado.realizarCheckOut();
            System.out.println("CheckoOut realizado!");
        } else {
            System.out.println("Quarto não ocupado ou não encontrado!"); 
        }
    }

    private Quarto buscarQuarto(int numeroQuarto) {
        for (Quarto quarto : quartosDisponiveis) {
            if (quarto.getNumero() == numeroQuarto) {
                return quarto;
            }
        }
        return null; //retorna null se o quarto não for encontrado
    }
}