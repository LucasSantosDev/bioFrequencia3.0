package br.com.biofrequencia.DAO;

import br.com.biofrequencia.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pindorama
 */
public class FuncionarioDAO {
    
    public void cadastrar(Funcionario funcionario, Connection con) throws SQLException {
        PreparedStatement st = null;
        String insert = "insert into benutzer values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
                st = con.prepareStatement(insert);
                
                st.setInt(1, funcionario.getId());
                st.setString(2, funcionario.getNome());
                st.setString(3, funcionario.getDtNasc().replace("/", ""));
                st.setString(4, funcionario.getCPF().replace(".", "").replace("-", ""));
                st.setString(5, funcionario.getRG().replace(".", "").replace("-", ""));
                st.setString(6, funcionario.getTelFixo().replace("(", "").replace(")", ""));
                st.setString(7, funcionario.getTelCelular().replace("(", "").replace(")", ""));
                st.setString(8, funcionario.getEmail());
                st.setInt(9, funcionario.getTpCadastro());
                st.setBoolean(10, funcionario.isAtivo());
                st.setString(11, funcionario.getSenha());
                
                st.executeUpdate();
                con.commit();
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Status do Cadastro", 1);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Algo aconteceu de errado! " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!", "Status do Cadastro", 0);
        } finally {
            st.close();
            con.close();  
        }
    }
}
