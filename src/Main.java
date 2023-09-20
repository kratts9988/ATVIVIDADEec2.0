import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner skr = new Scanner(System.in)) {
            System.out.println("Escolha um Produto: ");
            System.out.println("1. Computador");
            System.out.println("2. Processador");
            System.out.println("3. SistemaOperacional");

            int escolha = skr.nextInt();
            skr.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do computador: ");
                    String nomeComputador = skr.nextLine();
                    System.out.println("Descreva o computador: ");
                    String descricaoComputador = skr.nextLine();
                    System.out.println("Qual o tipo de computador: ");
                    String tipo = skr.nextLine();
                    System.out.println("Marca do computador: ");
                    String marca = skr.nextLine();
                    Computador computador = new Computador(nomeComputador, descricaoComputador, tipo, marca);
                    computador.exibirinfo();
                    BancoDeDados.inserirproduto(computador);

                    break;
                case 2:
                    System.out.println("Digite o nome do processador: ");
                    String nomeProcessador = skr.nextLine();
                    System.out.println("Descreva o processador: ");
                    String descricaoProcessador = skr.nextLine();
                    System.out.println("Qual o modelo do processador: ");
                    String modelo = skr.nextLine();
                    System.out.println("Velocidade GHz do processador: ");
                    int velocidadeGHz = skr.nextInt();
                    Processador processador = new Processador(nomeProcessador, descricaoProcessador, modelo,
                            velocidadeGHz);
                    processador.exibirinfo();
                    BancoDeDados.inserirproduto(processador);
                    break;
                case 3:
                    System.out.println("Digite o nome do Sistema Operacional: ");
                    String nomeSistemaOperacional = skr.nextLine();
                    System.out.println("Descreva o sistema operacional: ");
                    String descricaoSistemaOperacional = skr.nextLine();
                    System.out.println("Qual a versão do sistema operacional: ");
                    int versao = skr.nextInt();
                    SistemaOperacional sistemaOperacional = new SistemaOperacional(nomeSistemaOperacional,
                            descricaoSistemaOperacional, versao);
                    sistemaOperacional.exibirinfo();
                    BancoDeDados.inserirproduto(sistemaOperacional);
                    break;
                case 4:
                    System.out.println("Escolha uma Tabela: ");
                    System.out.println("1. Computador");
                    System.out.println("2. Processador");
                    System.out.println("3. SistemaOperacional");

                    int escolha1 = skr.nextInt();
                    skr.nextLine();
                    switch (escolha1) {
                        case 1:
                            Consulta novaConsulta1 = new Consulta();
                            novaConsulta1.Consulta1();
                            break;
                        case 2:
                            Consulta novaConsulta2 = new Consulta();
                            novaConsulta2.Consulta2();
                            break;
                        case 3:
                            Consulta novaConsulta3 = new Consulta();
                            novaConsulta3.Consulta3();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

    }

}
