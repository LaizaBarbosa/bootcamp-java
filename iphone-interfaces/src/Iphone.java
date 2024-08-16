import java.util.ArrayList;
import java.util.Scanner;

import interfaces.aparelhoTelefonico;
import interfaces.navegadorInternet;
import interfaces.reprodutorMusical;

public class Iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical{   
    Scanner scan = new Scanner(System.in);

    String agenda[] = {"maria - 12345678", "jose - 22222222", "joão - 43434334"};

    String historicoCorreioVoz[] = {"mensagem 1", "mensagem 2"};
        
    public void atender(){
        System.out.println("*atendendo ligação*");
        System.out.println("oiii");
        System.out.println("oieee");
    }
    
    public void ligar(){
        try {
            System.out.println("Escolher número da agenda ou discar? \n1 - Escolher da agenda \n2 - Discar");
        int opc = scan.nextInt();
        String opcContato;
    
        if (opc == 1) {
            for (String contato : agenda) {
                System.out.println(contato);
            }
    
            opcContato = scan.next();
            if (opcContato.equalsIgnoreCase(("Maria"))) {
                System.out.println("Discando para maria");
            }else if (opcContato.equalsIgnoreCase(("Jose"))) {
                System.out.println("Discando para Jose");
            }else if (opcContato.equalsIgnoreCase(("Joao"))) {
                System.out.println("Discando para Joao");
            }else{
                System.out.println("contato nao encontrado");
            }
    
        }else if(opc == 2){
            System.out.println("Digite o número: ");
            opcContato = scan.next();
    
            
            if (opcContato.matches(".*\\d+.*")) { //regex para verificar se numeros foram inseridos
                System.out.println("ligando para " + opcContato);
            }else{
                System.out.println("erro ao discar");
            }
        }
        } catch (Exception e) {
            System.err.println("erro: " + e);
        }
        
    }
    
    public void ouvirCorreio(){
        int i = 1;
        for (String mensagem : historicoCorreioVoz) {
            System.out.printf("%dª mensagem : %S", i, mensagem);
            i++;
        }
        
    }
    
// ---------------------------------------------------------------------------------------------------

    ArrayList<String> paginasWeb = new ArrayList<String>();
    
    public void exibirPagina(int pagina) {
        paginasWeb.add("pagina 1");
        paginasWeb.add("pagina 2");
        paginasWeb.add("pagina 3");

        System.out.println(paginasWeb);
        for (String pg : paginasWeb) {
            System.out.println(pg);
        }

        if (pagina == 1) {
            System.out.println(paginasWeb.get(0));
        } else if(pagina == 2){
            System.out.println(paginasWeb.get(1));
        } else if(pagina == 3){
            System.out.println(paginasWeb.get(2));
        }else{
            System.out.println("pagina não encontrada");
        }
        
    }

    public void atualizarPagina(String pagina) {
        System.out.println("atualizando página " + pagina + "...");
        
    }

    public void addNovaAba(String pagina) {
        paginasWeb.add(pagina);
        System.out.println(pagina);
        
    }
    
// ------------------------------------------------------------------------------------------------

    String listaMusicas[] = {"musica 1", "musica 2", "musica 3"};
    int mSelecionada;

    public void selecionarMusica() {
        System.out.println("Escolha a música desejada: ");

        try {
            int i = 1;
        for (String musica : listaMusicas) {
            System.out.println(i + " - " + musica);
            i++;    
        }

        mSelecionada = scan.nextInt();
        
        switch (mSelecionada) {
            case 1:
                System.out.println(listaMusicas[0] + " selecionada" );
                tocarMusica(listaMusicas[0]);
                break;
            
            case 2:
                System.out.println(listaMusicas[1] + " selecionada" );
                tocarMusica(listaMusicas[1]);
                break;

            case 3:
                System.out.println(listaMusicas[2] + " selecionada" );
                tocarMusica(listaMusicas[2]);
                break;
        
            default:
                System.out.println("erro ao selecionar uma música");
        }
        } catch (Exception e) {
            System.err.println("erro: " + e);
        }
    }

    public void tocarMusica(String musica) {
        if (musica == null) {
            System.out.println("nenhuma musica selecionada");
        }else{
            System.out.println("tocando " + musica);
        }
        
    }

    public void pausarMusica(String musica) {
        System.out.println(musica + " pausada");
        
    }

}