public class Processador extends Produto {
   private String modelo;
   private int velocidadeGHz;

   public Processador(String nome, String descricao, String modelo, int velocidadeGHz) {
      super(nome, descricao, null, null, modelo, velocidadeGHz, 0);
        this.modelo = modelo;
        this.velocidadeGHz = velocidadeGHz;
   }
   public void exibirinfo() {
      super.exibirinfo();
      System.out.println("Modelo: "+ modelo);
      System.out.println("Velocidade GHz: "+ velocidadeGHz);
  }
}