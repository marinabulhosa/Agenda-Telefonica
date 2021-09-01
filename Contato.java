/**
 *@author Marina Bulhosa
 */

package agendatelef;

public class Contato {
    
 
    private String nome;
    private int telefone;
    private String endereco;
    private String relacao;

    /*Construtor da classe Contato*/
    public Contato(String nome, int telefone, String endereco, String relacao)
    {
        this.nome       = nome;
        this.telefone   = telefone;
        this.endereco   = endereco;
        this.relacao    = relacao;
    }

    /*Getters - usado para obter informação,sempre retorna um valor*/
    public String getNome()
    {
        return this.nome;
    }
    
    public int getTelefone()
    {
        return this.telefone;
    }

    public String getEndereco()
    {
        return this.endereco;
    }
    
    public String getRelacao()
    {
        return this.relacao;
    }

    /*Setters - usado para definir valores,geralmente não retorna valores*/
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setRelacao(String relacao)
    {
        this.relacao = relacao;
    }
   
    /*Função que auxila na impressão da agenda*/
    public String toString()
    {
        return "Nome: "+this.nome+
               ", Telefone: "+this.telefone+
               ", Endereco: "+this.endereco+
               ", Relacao: "+this.relacao+"\n";
    }
    
}
