public class App{
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.ligar();
        iphone.ouvirCorreio();

        System.out.println(' ');
        
        iphone.atualizarPagina("aaa");
        iphone.addNovaAba("nova página");
        iphone.exibirPagina(1);
        
        System.out.println(' ');
        
        iphone.selecionarMusica();
        iphone.pausarMusica("musica 1");
        iphone.tocarMusica("outra musica");
    }
    
}



