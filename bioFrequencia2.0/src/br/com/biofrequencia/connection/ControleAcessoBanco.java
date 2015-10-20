package br.com.biofrequencia.connection;

import br.com.biofrequencia.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Pindorama
 */
public class ControleAcessoBanco {
    
    public Usuario ler(Connection con, Usuario usuario, String senha) {
        String sql = "select * from benutzer where (CPF = '" +usuario.getCPF()+"') AND (senha = '"+senha +"') AND (ativo = true)";
        System.out.println(sql);
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {

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
                //usuario.testaClasse();
            }
            rs.close();
            st.close();
            //con.close();
        } catch (Exception e) {
            System.out.println("Algo aconteceu de errado! " + e);
        }
        return usuario;
    }
}
