import java.util.ArrayList;
import java.util.List;

public class RepositorioHospede {
    private List<Hospede> hospedes = new ArrayList<>();

    public RepositorioHospede(List<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public void cadastrarHospede (Hospede hospede) {
        hospedes.add(hospede);
        // cadastramento de novo hospede na lista de hospedes do sistema
    }

    public List<Hospede> getAllHospedes() {
        return hospedes;
        // retorna a lista completa de hospedes
    }

    public void removerHospede(int id) {
        hospedes.removeIf(hospede -> hospede.getId() == id);
    }

    public Hospede getHospedePorId (int id) {
        for (Hospede hospede : hospedes) {
            if (hospede.getId() == id) {
                return hospede;
            }
        }
        return null;
        // procura um hospede na lista com base no id fornecido, se não encontrar retorna nulo
    }
}
