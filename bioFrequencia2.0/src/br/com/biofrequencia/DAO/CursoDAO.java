package br.com.biofrequencia.DAO;

import br.com.biofrequencia.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pindorama
 */
public class CursoDAO {
    
    public void cadastrarCurso(Connection con, Curso curso) {
        String insert = "INSERT INTO kurs VALUES (?,?,?,?)";
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(insert)) {

            Statement stmt = (Statement) con.createStatement();
            String sql = "select max(id) from kurs";
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            rs.next();
            int proximoCodigo = rs.getInt(1) + 1;
            rs.close();

            st.setInt(1, proximoCodigo);
            st.setString(2, curso.getNomeCurso());
            st.setInt(3, curso.getQuantidadeModulos());
            st.setBoolean(4, curso.getAtivo());
            
            System.out.println(insert);
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "O curso foi cadastrado com sucesso!", "Status do Cadastro", 1);
        } catch (Exception e) {
            System.out.println("Algo aconteceu de errado! " + e);
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro!", "Status do Cadastro", 0);
        }
    }
    
    public ArrayList<Curso> pesquisar(String sql, Connection con) {
        System.out.println(sql);
        ArrayList<Curso> lista = new ArrayList<>();
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                lista.add(new Curso(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
            
}
