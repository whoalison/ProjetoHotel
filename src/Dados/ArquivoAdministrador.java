import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Administrador> administradores = obterAdministradoresDoUsuario();
        salvarDadosEmArquivo(administradores, "administradores.txt");
    }

    public static ArrayList<Administrador> obterAdministradoresDoUsuario() {
        ArrayList<Administrador> administradores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionar Administradores (Digite 's' para parar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("s")) {
                break;
            }

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            Administrador administrador = new Administrador(nome, sobrenome, cpf, id, login, senha, idade, telefone, email, endereco);
            administradores.add(administrador);

            System.out.println("Administrador adicionado com sucesso!");
            System.out.println("Digite 's' para parar ou continue adicionando administradores.");
        }

        return administradores;
    }

    public static void salvarDadosEmArquivo(ArrayList<Administrador> lista, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Administrador administrador : lista) {
                writer.write(administradorParaString(administrador));
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String administradorParaString(Administrador administrador) {
        return String.format("%s,%s,%s,%d,%s,%s,%d,%s,%s,%s",
                administrador.getNome(),
                administrador.getSobrenome(),
                administrador.getCpf(),
                administrador.getId(),
                administrador.getLogin(),
                administrador.getSenha(),
                administrador.getIdade(),
                administrador.getTelefone(),
                administrador.getEmail(),
                administrador.getEndereco());
    }
}
