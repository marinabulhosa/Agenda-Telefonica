/**
 *@author Marina Bulhosa
 */

package agendatelef;
import java.util.Scanner;

public class Agendatelef {

  
   
    public static void main(String[] args) {
        
        Scanner snint = new Scanner(System.in);
        Scanner snstring = new Scanner(System.in);
        
        int opcao;
        String nome;
        int telefone;
        String endereco;
        String relacao;
        String nomeDoArquivo;
        
        Contato c;
        
        Agenda agendaTelefonica = new Agenda();	
        Principal.inicializa(agendaTelefonica);
        
        do{

            System.out.println("===========Menu de Opções===========");
            System.out.println("1- Inserir contato na agenda");
            System.out.println("2- Buscar contato na agenda");
            System.out.println("3- Alterar um contato da agenda");
            System.out.println("4- Remover um contato da agenda");
            System.out.println("5- Listar os contatos da agenda");
            System.out.println("6- Salvar os contatos na agenda");
            System.out.println("7- Recuperar os contatos da agenda");
            System.out.println("8- Sair");
            System.out.println("O que deseja fazer?");
            opcao = snint.nextInt();

                switch (opcao) {
                    case 1:

                        System.out.println("Escreva um nome");
                        nome = snstring.nextLine();

                        System.out.println("Escreva o numero de telefone");
                        telefone = snint.nextInt();

                        System.out.println("Escreva o endereco");
                        endereco = snstring.nextLine();

                        System.out.println("Escreva a relacao");
                        relacao = snstring.nextLine();
                        
                        if(agendaTelefonica.adicionarContato(nome, telefone, endereco, relacao)){
                            System.out.println("O contato foi adicionado com sucesso!");
                        }else{
                            System.out.println("O contato foi alterado com sucesso!");
                        }
                        

                        break;
                    case 2:

                        System.out.println("Escreva um nome");
                        nome = snstring.nextLine();
                        c = agendaTelefonica.buscarPorNome(nome);
                        
                        if(c!= null){
                            System.out.println(c);
                        }else{
                            System.out.println("Não foi possível encontrar o contato");
                        }
                        
                        break;

                    case 3:

                        System.out.println("Escreva um nome");
                        nome = snstring.nextLine();

                        System.out.println("Escreva o numero de telefone");
                        telefone = snint.nextInt();

                        System.out.println("Escreva o endereco");
                        endereco = snstring.nextLine();

                        System.out.println("Escreva a relacao");
                        relacao = snstring.nextLine();

                        
                        if(agendaTelefonica.alterarContato(nome, telefone, endereco, relacao)){
                            System.out.println("O contato foi alterado com sucesso!");
                        }else{
                            System.out.println("Não foi possível encontrar este contato!");
                        }
                        
                        break;

                    case 4:

                        System.out.println("Escreva um nome");
                        nome = snstring.nextLine();
                        
                        if(agendaTelefonica.removerContato(nome)){
                            System.out.println("O contato foi removido com sucesso!");
                        }else{
                            System.out.println("Não foi possível encontrar este contato!");
                        }
                        
                        
                        break;

                    case 5:

                        System.out.println(agendaTelefonica);
                        
                        break;

                    case 6:

                        System.out.println("Escreva o nome do arquivo que deseja criar");
                        nomeDoArquivo = snstring.nextLine();
                        
                        if(agendaTelefonica.salvar(nomeDoArquivo)){
                            System.out.println("Agenda salva com sucesso!");
                        }else{
                            System.out.println("ERRO!");
                            System.out.println("Não foi possível salvar esta agenda!");
                        }
 
                        break;

                    case 7:

                        System.out.println("Escreva o nome do arquivo que deseja recuperar");
                        nomeDoArquivo = snstring.nextLine();
                        
                        if(agendaTelefonica.recuperar(nomeDoArquivo)){
                            System.out.println("Agenda recuperada com sucesso!");
                        }else{
                            System.out.println("ERRO!");
                            System.out.println("Não foi possível recuperar esta agenda!");
                        }
                      
                        break;
                    case 8:

                        System.out.println("Saindo!");
                        break;
                    default:
                        System.out.println("Somente numeros entre 1 e 6");
                }
            
            
        }while(opcao!=8);
        snint.close();
        snstring.close();
    }

}
