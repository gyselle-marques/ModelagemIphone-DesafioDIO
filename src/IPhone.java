import aparelhotelefonico.AparelhoTelefonicoIntfc;
import navegadorinternet.NavegadorInternetIntfc;
import reprodutormusical.ReprodutorMusicalIntfc;

public class IPhone implements ReprodutorMusicalIntfc, AparelhoTelefonicoIntfc, NavegadorInternetIntfc {
    
  @Override
  public void tocar(String nome) {
    System.out.println("Ouvindo " + (nome) + ".");
  }

  @Override
  public void pausar(String nome) {
    System.out.println(nome + " pausada.");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada.");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo Ligacao...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de Voz.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo Pagina.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando Pagina.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando Pagina.");
  }
}
