package br.com.biofrequencia.DAO;

import br.com.biofrequencia.model.ProfessorD;
import br.com.biofrequencia.model.ProfessorP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pindorama
 */
public class ProfessorDAO {

    public ArrayList<ProfessorP> pesquisarP(String sql, Connection con) {
        System.out.println(sql);
        ArrayList<ProfessorP> lista = new ArrayList<>();
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                lista.add(new ProfessorP(rs.getInt(1), rs.getString(2), rs.getString(3).replace("/", ""), rs.getString(4).replace(".", "").replace("-", ""), rs.getString(5).replace(".", "").replace("-", ""), rs.getString(6).replace("(", "").replace(")", "").replace("-", ""), rs.getString(7).replace("(", "").replace(")", "").replace("-", ""), rs.getString(8), rs.getInt(9), rs.getBoolean(10), rs.getString(11)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }

    public ArrayList<ProfessorD> pesquisarD(String sql, Connection con) {
        System.out.println(sql);
        ArrayList<ProfessorD> lista = new ArrayList<>();
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                lista.add(new ProfessorD(rs.getInt(1), rs.getString(2), rs.getString(3).replace("/", ""), rs.getString(4).replace(".", "").replace("-", ""), rs.getString(5).replace(".", "").replace("-", ""), rs.getString(6).replace("(", "").replace(")", "").replace("-", ""), rs.getString(7).replace("(", "").replace(")", "").replace("-", ""), rs.getString(8), rs.getInt(9), rs.getBoolean(10), rs.getString(11)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
