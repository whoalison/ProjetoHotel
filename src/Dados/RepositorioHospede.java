import java.util.ArrayList;

public class RepositorioHospede {
    private ArrayList<Hospede> hospedes;

    public RepositorioHospede(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public void cadastrarHospede(Hospede hospede) {
        hospedes.add(hospede);
        // cadastramento de novo hospede na lista de hospedes do sistema
    }

    public ArrayList<Hospede> getAllHospedes() {
        return hospedes;
        // retorna a lista completa de hospedes
    }

    public void removerHospede(int id) {
        hospedes.removeIf(hospede -> hospede.getId() == id);
        // remove um hospede da lista de hospedes do sistema
    }

    public Hospede getHospedePorId(int id) {
        for (Hospede hospede : hospedes) {
            if (hospede.getId() == id) {
                return hospede;
            }
        }
        return null;
        // procura um hospede na lista com base no id fornecido, se não encontrar retorna nulo
    }
}
