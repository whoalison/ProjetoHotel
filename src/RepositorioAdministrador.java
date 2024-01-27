import java.util.ArrayList;

public class RepositorioAdministrador {
    private ArrayList<Administrador> administradores;

    public RepositorioAdministrador() {
        this.administradores = new ArrayList<>();
    }

    public void cadastrarAdministrador(Administrador administrador) {
        administradores.add(administrador);
        // cadastramento de novo administrador na lista de administradores do sistema
    }

    public ArrayList<Administrador> getAllAdministradores() {
        return new ArrayList<>(administradores);
        // retorna uma cópia da lista completa de administradores para evitar modificações externas
    }

    public void removerAdministrador(int id) {
        administradores.removeIf(admin -> admin.getId() == id);
        // remove um administrador da lista de administradores do sistema
    }

    public Administrador getAdministradorPorId(int id) {
        for (Administrador administrador : administradores) {
            if (administrador.getId() == id) {
                return administrador;
            }
        }
        return null;
        // procura um administrador na lista com base no id fornecido, se não encontrar retorna nulo
    }

    public Administrador fazerLogin(String login, String senha) {
        for (Administrador administrador : administradores) {
            if (administrador.getLogin().equals(login) && administrador.getSenha().equals(senha)) {
                return administrador;
            }
        }
        return null;
        // procura um administrador na lista com base no login e senha fornecidos, se não encontrar retorna nulo
    }
}
