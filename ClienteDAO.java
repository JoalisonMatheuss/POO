
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jose Barros
 */
public class ClienteDAO {

    public ClienteDAO(){
        
    }
    
    public void adicionarCliente(Cliente cliente) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO CLIENTE VALUES(?,?)");
            stmt.setInt(1, cliente.getCodCliente());
            stmt.setString(2, cliente.getNome());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM CLIENTE ORDER BY CODIGO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ContaCorrente conta = new Cliente(rs.getInt("codigoCliente"),
                        rs.getString("nomeCliente"));
                listaRetorno.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }


    public Cliente getClientePeloCodigo(int codigoCliente) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM CLIENTE WHERE CODIGO=?");
            stmt.setInt(1, codigoCliente);
            rs = stmt.executeQuery();

            if (rs.next()) {
                ContaCorrente cliente = new Cliente(rs.getInt("codigoCliente"),
                        rs.getString("nomeCliente"));
                return cliente;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }

    public void updateCliente(Cliente cliente) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE CLIENTE SET nomeCliente=?, WHERE CODIGO=?");
            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getCodCliente());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarCliente(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM CLIENTE WHERE CODIGO=?");
            stmt.setInt(1, getCodCliente);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}
