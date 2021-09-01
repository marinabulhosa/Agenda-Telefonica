/**
 *@author Marina Bulhosa
 */
package agendatelef;

public class Principal {

    public static void inicializa(Agenda agendaTelefonica) {
        								
            agendaTelefonica.adicionarContato("Fulano", 99999999, "Rua A", "UFF");                              //Inserir o Contato "Fulano", 99999999, "Rua A", "UFF";
            agendaTelefonica.adicionarContato("Ciclano", 88888888, "Rua B", "Cederj");                          //Inserir o Contato "Ciclano", 88888888, "Rua B", "Cederj";
            agendaTelefonica.adicionarContato("Beltrano", 88889999, "Rua C", "Infância");                       //Inserir o Contato "Beltrano", 88889999, "Rua C", "Infância";
            agendaTelefonica.adicionarContato("Fulano", 77777777, "Rua D", "UFF");                              //Inserir o Contato "Fulano", 77777777, "Rua D";
            agendaTelefonica.removerContato("Ciclano");								//Remover o Contato "Ciclano";
            System.out.println(agendaTelefonica);								//Listar o conteudo da Agenda;
       
    }
}
