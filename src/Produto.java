public class Produto {
   private String nome;
   private String descricao;
   private String tipo;
   private String marca;
   private String modelo;
   private int velocidadeGHz;
   private int versao;

   public Produto(String nome, String descricao, String tipo, String marca, String modelo, int velocidadeGHz, int versao) {
      this.nome = nome;
      this.descricao = descricao;
      this.tipo = tipo;
      this.marca = marca;
      this.modelo = modelo;
      this.velocidadeGHz = velocidadeGHz;
      this.versao = versao;
   }

   public void exibirinfo() {
      System.out.println("nome do produto: " + nome);
      System.out.println("descricão: " + descricao);

   }

   public String getNome() {
      return nome;
   }

   public String getDescricao() {
      return descricao;
   }

   public String getTipo() {
      return tipo;
   }

   public String getMarca() {
      return marca;
   }

   public String getModelo() {
      return modelo;
   }

   public int getVelocidadeGHz() {
      return velocidadeGHz;
   }

   public int getVersao() {
      return versao;
   }
}