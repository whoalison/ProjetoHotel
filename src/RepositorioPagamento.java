import java.util.ArrayList;
import java.util.List;

public class RepositorioPagamento {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public RepositorioPagamento(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public void adicionarPagamento (Pagamento pagamento) {
        pagamentos.add(pagamento);
        // adiciona um pagamento na lista de pagamentos do sistema
    }
    public List<Pagamento> getAllPagamentos () {
        return pagamentos;
        // retorna a lista completa de pagamentos
        // lembrar de deixar no plural "Pagamentos"
    }

    public void removerPagamento(int id) {
        pagamentos.removeId(pagamento -> pagamento.getId() == id);
    }
    public Pagamento getPagamentoPorId (int id) {
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getId() == id) {
                return pagamento;
            }
        }
        return null;
        // procura um pagamento na lista com base na id fornecida, caso não encontre retorna nulo
    }
}
