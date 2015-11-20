package br.com.biofrequencia.DAO;

import br.com.biofrequencia.model.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pindorama
 */
public class MateriaDAO {
 
    public ArrayList<Materia> pesquisar(String sql, Connection con) {
        ArrayList<Materia> lista = new ArrayList<>();
        System.out.println("SQL->"+sql);
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {
            if (rs != null) {
                while (rs.next()) {
                    lista.add(new Materia(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getBoolean(7)));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Matéria e Turma não coincidem.", "Status de Pesquisa", 0);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Matéria e Turma não coincidem.", "Status de Pesquisa", 0);
        }
        return lista;
    }
}
