public class Computador extends Produto {
   private String tipo;
   private String marca;

   public Computador(String nome, String descricao, String tipo, String marca) {
      super(nome, descricao, tipo, marca, null, 0, 0);
      this.tipo = tipo;
      this.marca = marca;
     }
   public void exibirinfo() {
      super.exibirinfo();
      System.out.println("tipo de computador: "+ tipo);
      System.out.println("marca do computador: "+ marca);
      
  }

   // Getters e setters
}