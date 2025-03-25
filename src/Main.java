public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();


        System.out.println("Iniciando app musical");

        iphone.appMusical.adicionarMusica(lista -> {
            lista.add("Shake it off");
            lista.add("Dive");
            lista.add("Master of Puppets");
            lista.add("T.N.T");
        });
        iphone.appMusical.exibirMusicas();
        iphone.appMusical.tocarMusica("Shake it off");
        iphone.appMusical.proximaMusica();
        iphone.appMusical.pausarMusica("shake it off");
        iphone.appMusical.removerMusicas("Dive");
        iphone.appMusical.exibirMusicas();

        System.out.println("==============fim===============");
        System.out.println("Iniciando app web");

        iphone.appWeb.setUrl("www.youtube.com");
        iphone.appWeb.exibirPag(iphone.appWeb.getUrl());
        iphone.appWeb.atualizarPag();
        iphone.appWeb.novaPag("www.facebook.com");
        System.out.println("=========fim==============");
        System.out.println("Iniciando app telefonico:");
        iphone.appTelefonico.adicionarContatos("Arnaldo", "1124258798");
        iphone.appTelefonico.adicionarContatos("Maria", "1124258798");
        iphone.appTelefonico.adicionarContatos("Jose", "1124657321");
        iphone.appTelefonico.adicionarContatos("Arnaldo", "1131449875");

        iphone.appTelefonico.exibirContatos();

        iphone.appTelefonico.ligar("1131449875");
        iphone.appTelefonico.atender();
        iphone.appTelefonico.iniciarCorreioVoz();
        iphone.appTelefonico.removerContatos("Jose", "1124657321");

        System.out.println("Lista após remoção");
        iphone.appTelefonico.exibirContatos();

    }

}