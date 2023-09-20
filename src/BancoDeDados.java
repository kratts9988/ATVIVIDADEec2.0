import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Produto";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void inserirproduto(Produto produto) {
        criarTabela();
    
        try (Connection conect = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            // Insert into Computador
            String insertComputador = "INSERT INTO Computador(nome, descrição, tipo_computador, marca) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pStatement = conect.prepareStatement(insertComputador)) {
                pStatement.setString(1, produto.getNome());
                pStatement.setString(2, produto.getDescricao());
                pStatement.setString(3, produto.getTipo());
                pStatement.setString(4, produto.getMarca());
                pStatement.executeUpdate();
                System.out.println("Dados inseridos na tabela Computador com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    
        // Similar blocks for Processador and SistemaOperacional
        // Insert into Processador
        try (Connection connect = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String insertProcessador = "INSERT INTO Processador(nome, descrição, modelo, velocidadeGHz) VALUES (?, ?, ?, ?)";
            try (PreparedStatement prepstmt = connect.prepareStatement(insertProcessador)) {
                prepstmt.setString(1, produto.getNome());
                prepstmt.setString(2, produto.getDescricao());
                prepstmt.setString(3, produto.getModelo());
                prepstmt.setInt(4, produto.getVelocidadeGHz());
                prepstmt.executeUpdate();
                System.out.println("Dados inseridos na tabela Processador com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    
        // Insert into SistemaOperacional
        try (Connection concConnection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String insertSistemaOperacional = "INSERT INTO SistemaOperacional(nome, descrição, modelo, versão) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preSTMT = concConnection.prepareStatement(insertSistemaOperacional)) {
                preSTMT.setString(1, produto.getNome());
                preSTMT.setString(2, produto.getDescricao());
                preSTMT.setString(3, produto.getModelo());
                preSTMT.setInt(4, produto.getVersao());
                preSTMT.executeUpdate();
                System.out.println("Dados inseridos na tabela SistemaOperacional com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }

    public static void criarTabela() {
        try (Connection conect = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {

            String createTableSQl = "CREATE TABLE IF NOT EXISTS Computador (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descrição VARCHAR (100)," +
                    "tipo_computador VARCHAR (100)," +
                    "marca VARCHAR (100)" +
                    ")";

            try (PreparedStatement pStatement = conect.prepareStatement(createTableSQl)) {
                pStatement.executeUpdate();
                System.out.println("Tabela criada com sucesso!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela" + e.getMessage());
        }

        try (Connection connect = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {

            String createTablesql = "CREATE TABLE IF NOT EXISTS Processador (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descrição VARCHAR (100)," +
                    "modelo VARCHAR (100)," + // Added the comma
                    "velocidadeGHz INT (100)" +
                    ")";

            try (PreparedStatement prepstmt = connect.prepareStatement(createTablesql)) {
                prepstmt.executeUpdate();
                System.out.println("Tabela criada com sucesso!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela" + e.getMessage());
        }

        try (Connection concConnection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {

            String createTableSqL = "CREATE TABLE IF NOT EXISTS SistemaOperacional (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descrição VARCHAR (100)," +
                    "modelo VARCHAR (100)," + // Added the comma
                    "versão INT (100)" +
                    ")";

            try (PreparedStatement preSTMT = concConnection.prepareStatement(createTableSqL)) {
                preSTMT.executeUpdate();
                System.out.println("Tabela criada com sucesso!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela" + e.getMessage());
        }

    }
}
