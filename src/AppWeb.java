public class AppWeb {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPag(String url){
        setUrl(url);
        System.out.println("Pagina atual: "+ getUrl());
    }
    public void atualizarPag(){
        System.out.println("Atualizando pagina");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("Pagina atualizada");
    }
    public void novaPag(String novaUrl){
        url = novaUrl;
        System.out.println("Nova aba: "+ url);
    }

}
