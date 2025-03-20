import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AppMusical {
    private List<String> listaMusicas;
    private String musicaSelecionada;

    public AppMusical(){
        this.listaMusicas = new ArrayList<>();
    }
    public void tocarMusica(String musica){
        if (listaMusicas.contains(musica)){
            musicaSelecionada = musica;
            System.out.println("Tocando: "+ musicaSelecionada);
        }
        else{
            System.out.println("Musica: %S não encontrada!"+ musica);
        }
    }
    public void pausarMusica(String musica){
        if (listaMusicas.contains(musica)){
            if (musicaSelecionada.equals(musica)){
                System.out.println("pausando musica!");
                musicaSelecionada = null;
            }
        }else {
            System.out.println("Não há musicas tocando no momento");
        }
    }
    public void proximaMusica(){
        if (listaMusicas.isEmpty()){
            System.out.println("Sem musicas na lista!");
            return;
        }
        if (listaMusicas.equals(null)){
            musicaSelecionada = listaMusicas.get(0);
            System.out.println("Tocando: "+ musicaSelecionada);
        }
        else {
            int indice = listaMusicas.indexOf(musicaSelecionada);

            if (indice < listaMusicas.size() - 1){
                musicaSelecionada = listaMusicas.get(indice + 1);
                System.out.println("Tocando: "+ musicaSelecionada);
            }
            else {
                System.out.println("Fim da lista!");
            }
        }

    }
    public void adicionarMusica(Consumer<List<String>> adicionador){
        adicionador.accept(listaMusicas);
    }
    public void removerMusicas(String musica){
        listaMusicas.remove(musica);
        System.out.println(musica + " Removida com sucesso!");
    }

    public void exibirMusicas(){
        if (listaMusicas.isEmpty()){
            System.out.println("A lista de musicas está vazia!");
            return;
        }
        else {
          listaMusicas.forEach(musica -> System.out.println((listaMusicas.indexOf(musica)+ 1)+". "+ musica));
        }
    }
}
