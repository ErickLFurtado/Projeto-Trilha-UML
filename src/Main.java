public class Main {
    public static void main(String[] args) {
        AppMusical appMusical = new AppMusical();
        AppTelefonico appTelefonico = new AppTelefonico();
        AppWeb appWeb = new AppWeb();

        System.out.println("Iniciando app musical");

        appMusical.adicionarMusica(lista ->{
            lista.add("Shake it off");
            lista.add("Dive");
            lista.add("Master of Puppets");
            lista.add("T.N.T");
        });
        appMusical.exibirMusicas();
        appMusical.tocarMusica("Shake it off");
        appMusical.proximaMusica();
        appMusical.pausarMusica("shake it off");
        appMusical.removerMusicas("Dive");
        appMusical.exibirMusicas();

        System.out.println("==============fim===============");
        System.out.println("Iniciando app web");

        appWeb.setUrl("www.youtube.com");
        appWeb.exibirPag(appWeb.getUrl());
        appWeb.atualizarPag();
        appWeb.novaPag("www.facebook.com");
        System.out.println("=========fim==============");
        System.out.println("Iniciando app telefonico:");
        appTelefonico.adicionarContatos("Arnaldo", "1124258798");
        appTelefonico.adicionarContatos("Maria", "1124258798");
        appTelefonico.adicionarContatos("Jose", "1124657321");
        appTelefonico.adicionarContatos("Arnaldo", "1131449875");

        appTelefonico.exibirContatos();

        appTelefonico.ligar("1131449875");
        appTelefonico.atender();
        appTelefonico.iniciarCorreioVoz();
        appTelefonico.removerContatos("Jose", "1124657321");

        System.out.println("Lista após remoção");
        appTelefonico.exibirContatos();

    }

}