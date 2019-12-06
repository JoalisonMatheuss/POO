

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author
 */
public class ItemDAO {

    public ItemDAO(){
        
    }
    

    public void adcionarItem(Item item) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO PRODUTO VALUES(?,?,?)");
            stmt.setProduto(1, item.getProduto());
            stmt.setDouble(2, item.getvalorUnitario());
            stmt.setInt(3, item.getQtd());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    


    public List<Item> listarItem() {
        List<Item> item = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM ITEM ORDER BY CodProduto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto(rs.getInt("codProduto"),
                        rs.getDouble("custo"), rs.getString("descricao"), rs.getDouble("preco"), rs.getString("nome"), rs.getDouble("lucro"));
                estoque.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return estoque;
    }
    

    
    
	
	

    public Produto getProdutoPeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Produto WHERE CodProduto=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
            	Produto p = new Produto(rs.getInt("codProduto"),
                        rs.getDouble("custo"), rs.getString("descricao"), rs.getDouble("preco"), rs.getString("nome"), rs.getDouble("lucro"));
                return p;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }

    
    

    public void AtualizarProduto(Produto p) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Produto SET codProduto=?, custo=?, descricao=?, preco=?, nome=?, lucro=? WHERE CodProduto=?");
            stmt.setInt(1, p.getCodProduto());
            stmt.setDouble(2, p.getCusto());
            stmt.setString(3, p.getDescricao());
            stmt.setDouble(4, p.getPreco());
            stmt.setString(5, p.getNome());
            stmt.setDouble(6, p.getLucro());
            stmt.setInt(7, p.getCodProduto());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    
    
    
    public void deletarProduto(int codProduto) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Produto WHERE CodProduto=?");
            stmt.setInt(1, codProduto);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}



	
