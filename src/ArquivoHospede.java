package com.example.telasprojeto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArquivoHospede {

    public static void salvarDadosEmArquivo(ArrayList<Hospede> lista, String nomeArquivo) {
        try {
            ArrayList<String> linhas = lista.stream().map(ArquivoHospede::hospedeParaString).collect(Collectors.toCollection(ArrayList::new));
            Path arquivo = Paths.get(nomeArquivo);
            Files.write(arquivo, linhas);
            System.out.println("Dados salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void adicionarHospede(Hospede novoHospede, String nomeArquivo) {
        ArrayList<Hospede> hospedes = obterHospedesDoArquivo(nomeArquivo);

        hospedes.add(novoHospede);

        salvarDadosEmArquivo(hospedes, nomeArquivo);
    }

    public static ArrayList<Hospede> obterHospedesDoArquivo(String nomeArquivo) {
        try {
            Path arquivo = Paths.get(nomeArquivo);
            return Files.lines(arquivo).map(ArquivoHospede::stringParaHospede).collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    public static String hospedeParaString(Hospede hospede) {
        return String.format("%s,%s,%s,%d,%s,%s,%s,%d,%s,%s",
                hospede.getNome(),
                hospede.getSobrenome(),
                hospede.getEndereco(),
                hospede.getIdade(),
                hospede.getCpf(),
                hospede.getContato(),
                hospede.getEmail(),
                hospede.getId(),
                hospede.getLogin(),
                hospede.getSenha());
    }
    public static Hospede stringParaHospede(String linha) {
        String[] partes = linha.split(",");
        String nome = partes[0];
        String sobrenome = partes[1];
        String endereco = partes[2];
        int idade = Integer.parseInt(partes[3]);
        String cpf = partes[4];
        String contato = partes[5];
        String email = partes[6];
        int id = Integer.parseInt(partes[7]);
        String login = partes[8];
        String senha = partes[9];

        return new Hospede(nome, sobrenome, endereco, idade, cpf, contato, email, id, login, senha);
    }
}
