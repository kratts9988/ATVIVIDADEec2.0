public class SistemaOperacional extends Produto {
   private int versao;

   public SistemaOperacional(String nome, String descricao, int versao) {
      super(nome, descricao, null, null, null, 0,versao);
        this.versao = versao;
   }
   public void exibirinfo() {
      super.exibirinfo();
      System.out.println("Versão: "+ versao);
  }

   // Getters e setters
}