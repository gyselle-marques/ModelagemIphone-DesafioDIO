package aparelhotelefonico;

public class AparelhoTelefonicoAbst implements AparelhoTelefonicoIntfc {
    
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
}
