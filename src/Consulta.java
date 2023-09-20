import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Produto";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void Consulta1() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM computador");
                ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String nome = resultSet.getString("nome");
                String descrição = resultSet.getString("descrição");
                String tipo_computador = resultSet.getString("tipo_computador");
                String marca = resultSet.getString("marca");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("descrição: " + descrição);
                System.out.println("Raça: " + tipo_computador);
                System.out.println("Tipo de Animal: " + marca);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar animais: " + e.getMessage());
        }
    }

     
    public static void Consulta2() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM computador");
                ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String nome = resultSet.getString("nome");
                String descrição = resultSet.getString("descrição");
                String tipo_computador = resultSet.getString("tipo_computador");
                String marca = resultSet.getString("marca");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("descrição: " + descrição);
                System.out.println("Raça: " + tipo_computador);
                System.out.println("Tipo de Animal: " + marca);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar animais: " + e.getMessage());
        }
    }

    public static void Consulta3() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM computador");
                ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String nome = resultSet.getString("nome");
                String descrição = resultSet.getString("descrição");
                String tipo_computador = resultSet.getString("tipo_computador");
                String marca = resultSet.getString("marca");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("descrição: " + descrição);
                System.out.println("Raça: " + tipo_computador);
                System.out.println("Tipo de Animal: " + marca);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar animais: " + e.getMessage());
        }
    }
}

//termine de fazer uma terceira opção de consulta, e edite todas as consultas de acordo com as tabelas do mysql.