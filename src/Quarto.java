public class Quarto {
    private String tipoQuarto;
    private int numeroQuarto;

    private boolean statusDisponibilidade;

    public Quarto (String tipoQuarto, int numeroQuarto, boolean statusDisponibilidade) {
        this.tipoQuarto = tipoQuarto;
        this.numeroQuarto = numeroQuarto;
        this.statusDisponibilidade = statusDisponibilidade;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }


    public boolean getStatusDisponibilidade() {
        return statusDisponibilidade;
    }

    public void setStatusDisponibilidade(boolean statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }
}