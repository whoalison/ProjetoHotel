import java.util.List;

public class RepositorioQuarto {
    private List<Quarto> quartos;

    public RepositorioQuarto(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public void adcionarQuarto (Quarto quarto) {
        quartos.add(quarto);
        // adiciona um quarto na lista de quartos do sistema
    }
    public List<Quarto> getAllQuartos() {
        return quartos;
        // retorna a lista completa de quartos
    }

    public void removerQuarto(int id) {
        quartos.removeIf(quarto -> quarto.getNumeroQuarto() == id);
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
