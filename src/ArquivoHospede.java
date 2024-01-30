import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Hospede> hospedes = obterHospedesDoUsuario();
        salvarDadosEmArquivo(hospedes, "hospedes.txt");
    }

    public static ArrayList<Hospede> obterHospedesDoUsuario() {
        ArrayList<Hospede> hospedes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionar Hóspedes (Digite 's' para parar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("s")) {
                break;
            }

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Contato: ");
            String contato = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            Hospede hospede = new Hospede(nome, sobrenome, endereco, idade, cpf, contato, email, id);
            hospedes.add(hospede);

            System.out.println("Hóspede adicionado com sucesso!");
            System.out.println("Digite 's' para parar ou continue adicionando hóspedes.");
        }

        return hospedes;
    }

    public static void salvarDadosEmArquivo(ArrayList<Hospede> lista, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Hospede hospede : lista) {
                writer.write(hospedeParaString(hospede));
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String hospedeParaString(Hospede hospede) {
        return String.format("%s,%s,%s,%d,%s,%s,%s,%d",
                hospede.getNome(),
                hospede.getSobrenome(),
                hospede.getEndereco(),
                hospede.getIdade(),
                hospede.getCpf(),
                hospede.getContato(),
                hospede.getEmail(),
                hospede.getId());
    }
}
