package navegadorinternet;

public abstract class NavegadorInternetAbst implements NavegadorInternetIntfc {
   
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
