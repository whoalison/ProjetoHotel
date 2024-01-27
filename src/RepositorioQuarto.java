import java.util.ArrayList;

public class RepositorioQuarto {
    private ArrayList<Quarto> quartos;

    public RepositorioQuarto(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }

    public void adcionarQuarto (Quarto quarto) {
        quartos.add(quarto);
        // adiciona um quarto na lista de quartos do sistema
    }
    public ArrayList<Quarto> getAllQuartos() {
        return quartos;
        // retorna a lista completa de quartos
    }

    public void removerQuarto(int numeroQuarto) {
        quartos.removeIf(quarto -> quarto.getNumeroQuarto() == numeroQuarto);
        //remove um quarto da lista de quartos dos sitema
    }
    public Quarto getQuartoPorNumero (int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumeroQuarto() == numeroQuarto) {
                return quarto;
            }
        }
        return null;
        // procura um quarto na lista com base no numero do quarto fornecido, caso não encontre retorna nulo
    }
}
