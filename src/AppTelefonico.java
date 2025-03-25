import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AppTelefonico {
    private Map<String, String> contatos;

    public AppTelefonico(){
        contatos = new HashMap<>();
    }

    public void adicionarContatos(String nome, String telefone){
        if (!contatos.containsKey(nome) && !contatos.containsKey(telefone)){
            contatos.put(nome, telefone);
            System.out.println("Contato adicionado: "+ nome + " - "+ telefone);
        }else {
            System.out.println("Contato não adicionado");
        }
    }

    public void exibirContatos(){
        System.out.println("Lista telefonica: ");
        for (Map.Entry<String, String> entry : contatos.entrySet()){
            System.out.println(entry.getKey()+ " - "+ entry.getValue());
        }
    }

    public void removerContatos(String nome, String telefone){
        contatos.remove(nome, telefone);
    }

    public String buscarTelefone(String telefone){
        return contatos.get(telefone);
    }

    public void ligar(String telefone){
        System.out.println("Selecione o contato: ");
        exibirContatos();
        String numero = buscarTelefone(telefone);
        if (numero != null){
            System.out.println("Ligando para: "+ numero);
        }
        else {
            System.out.println("Contato não encontrado!");
        }
    }
    public void atender(){
        System.out.println("Chamando...");
        System.out.println("-----------");
        System.out.println("Ligaçãoa atendida!");
    }

    public void timer(){
        final Integer[] segundos = {1};
        new Thread(() -> {
            do {
                try {
                    Thread.sleep(1000);
                    System.out.println(segundos[0]+ "...");
                    segundos[0]++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }while (segundos[0] < 30);


        });
    }

    public void iniciarCorreioVoz(){
        System.out.println("iniciando correio de voz");
        timer();
        System.out.println("Finalizando correio de voz");
    }

}
