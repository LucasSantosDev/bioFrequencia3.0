package br.com.biofrequencia.DAO;

import br.com.biofrequencia.model.Usuario;
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
public class UsuarioDAO {
    
    public ArrayList<Usuario> pesquisa(Usuario usuario, Connection con) throws SQLException {
        ResultSet rs = null;
        PreparedStatement st = null;
        String sql = "SELECT * FROM wurzel.benutzer WHERE CPF = '"+usuario.getCPF()+"' AND ativo = true";
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            st = (PreparedStatement) con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                lista.add(new Usuario(
                                      rs.getInt(1), //id
                                      rs.getString(2), //nome
                                      rs.getString(3), //data
                                      rs.getString(4), //cpf
                                      rs.getString(5), //rg
                                      rs.getString(6), //fixo
                                      rs.getString(7), //celular
                                      rs.getString(8), //email
                                      rs.getInt(9), //tipo cadastro
                                      rs.getBoolean(10), //ativo
                                      rs.getString(11))); //senha
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            rs.close();
            st.close();
            con.close();  
        }
        return lista;
    }
    
    public void pesquisaFuncionario(String sql, Connection con) throws SQLException {
        Usuario usuario = new Usuario();
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            st = (PreparedStatement) con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                usuario.setId(rs.getInt(1));
                usuario.setNome(rs.getString(2));
                usuario.setDtNasc(rs.getString(3));
                usuario.setCPF(rs.getString(4));
                usuario.setRG(rs.getString(5));
                usuario.setTelFixo(rs.getString(6));
                usuario.setTelCelular(rs.getString(7));
                usuario.setEmail(rs.getString(8));
                usuario.setTpCadastro(rs.getInt(9));
                usuario.setAtivo(rs.getBoolean(10));
                usuario.setSenha(rs.getString(11));
            }
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, usuario.getNome());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            rs.close();
            st.close();
            con.close();  
        }
    }
    
    public void editaUsuario(Usuario usuario, Connection con, int id) throws SQLException {
        PreparedStatement st = null;
        String update = "UPDATE wurzel.benutzer SET nome = ?, dtNasc = ?, CPF = ?, RG = ?, telFixo = ?, telCelular = ?, email = ? WHERE id = ?";
        try {
                st = con.prepareStatement(update);
                st.setString(1, usuario.getNome());
                st.setString(2, usuario.getDtNasc().replace("/", ""));
                st.setString(3, usuario.getCPF().replace(".", "").replace("-", ""));
                st.setString(4, usuario.getRG().replace(".", "").replace("-", ""));
                st.setString(5, usuario.getTelFixo().replace("(", "").replace(")", ""));
                st.setString(6, usuario.getTelCelular().replace("(", "").replace(")", ""));
                st.setString(7, usuario.getEmail());
                st.setInt(8, id);
                
                st.executeUpdate();
                con.commit();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Status da Alteração", 1);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Algo aconteceu de errado! " + e);
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!", "Status da Alteração", 0);
        } finally {
            st.close();
            con.close();  
        }
    }
    
    public void editaSenha(Usuario usuarioLogado, String senhaAtual, String senhaNova, String senhaNovaRepetir, Connection con) throws SQLException {
        PreparedStatement st = null;
        if(senhaNova.equals(senhaNovaRepetir)) {
            String update = "update wurzel.benutzer set senha = ? where id = ?";
            try {
                st = con.prepareStatement(update);
                st.setString(1, senhaNova);
                st.setInt(2, usuarioLogado.getId());
                st.executeUpdate();
                con.commit();
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Status da Alteração", 1);
            } catch(Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Algo aconteceu de errado! " + e);
                JOptionPane.showMessageDialog(null, "Erro ao alterar senha!", "Status da Alteração", 0);
            } finally {
                st.close();
                con.close();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senhas não coincidem!");
        }
    }

}
