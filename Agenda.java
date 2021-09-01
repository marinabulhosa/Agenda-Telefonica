/**
 *@author Marina Bulhosa
 */
package agendatelef;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Agenda {

    /*atributo da classe Agenda*/
    private ArrayList<Contato> contatos;

    /*Construtor da classe Agenda*/
    public Agenda() {

        this.contatos = new ArrayList<Contato>();

    }

    public boolean adicionarContato(String nome, int telefone, String endereco, String relacao) {
        /*this é uma referência ao objeto atual */
        for (Contato c : this.contatos) {
            if (c.getNome().toUpperCase().equals(nome.toUpperCase())) {
                alterarContato(nome, telefone, endereco, relacao);
                return false;
            }
        }
        this.contatos.add(new Contato(nome, telefone, endereco, relacao));
        return true;
    }

    public boolean alterarContato(String nome, int telefone, String endereco, String relacao) {
        /*this é uma referência ao objeto atual  */
        for (Contato c : this.contatos) {
            if (c.getNome().toUpperCase().equals(nome.toUpperCase())) {
                c.setTelefone(telefone);
                c.setEndereco(endereco);
                c.setRelacao(relacao);
                return true;
            }
        }
        return false;
    }

    public Contato buscarPorNome(String nome) {
        /*this é uma referência ao objeto atual  */
        for (Contato c : this.contatos) {
            if (c.getNome().toUpperCase().contains(nome.toUpperCase())) {
                return c;
            }
        }
        return null;

    }

    public boolean removerContato(String nome) {
        /*this é uma referência ao objeto atual */
        for (Contato c : this.contatos) {
            if (c.getNome().toUpperCase().equals(nome.toUpperCase())) {
                this.contatos.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean salvar(String nomeDoArquivo) {

        try {
            File arquivoContatos = new File(nomeDoArquivo + ".txt");
            FileWriter fileWriter = new FileWriter(arquivoContatos);
            BufferedWriter escrever = new BufferedWriter(fileWriter);
            for (Contato contatos : this.contatos) {

                escrever.write(contatos.getNome());
                escrever.write(Integer.toString(contatos.getTelefone()));
                escrever.write(contatos.getEndereco());
                escrever.write(contatos.getRelacao());

            }
            escrever.close();
            fileWriter.close();
            return true;

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            return false;
        }
    }

    public boolean recuperar(String nomeDoArquivo) {

        File arquivoContatos = new File(nomeDoArquivo + ".txt");
        try {

            FileReader fileReader = new FileReader(arquivoContatos);
            BufferedReader ler = new BufferedReader(fileReader);
            String linha = ler.readLine();

            while ((linha = ler.readLine()) != null) {
                Contato Recuperar = new Contato(linha, 0, null, null);
                Recuperar.setNome(ler.readLine());
                Recuperar.setTelefone(Integer.parseInt(ler.readLine()));
                Recuperar.setEndereco(ler.readLine());
                Recuperar.setRelacao(ler.readLine());

                System.out.println(linha);
                linha = ler.readLine();
                contatos.add(Recuperar);
            }

            ler.close();
            fileReader.close();
            return true;

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            return false;
        }
    }

    /*Função que auxila na impressão da agenda*/
    public String toString() {
        if (this.contatos.isEmpty()) {
            return "Agenda vazia";
        }
        String retorno = "Contatos na sua agenda:\n";
        for (Contato contato : this.contatos) {
            retorno += contato;
        }
        return retorno;
    }
}
