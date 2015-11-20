package br.com.biofrequencia.DAO;

import br.com.biofrequencia.model.Aluno;
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
public class AlunoDAO {

    public void cadastrar(Connection con, Aluno aluno) {
        String insert = "INSERT INTO schuler VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(insert)) {

            Statement stmt = (Statement) con.createStatement();
            String sql = "SELECT * FROM SCHULER WHERE id=(SELECT MAX(id) FROM SCHULER)";
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            rs.next();
            int proximoCodigo = rs.getInt(1) + 1;
            rs.close();

            st.setInt(1, proximoCodigo);
            st.setString(2, aluno.getNome());
            st.setString(3, aluno.getDtNasc());
            st.setString(4, aluno.getRA());
            st.setString(5, aluno.getTelFixo());
            st.setString(6, aluno.getTelCelular());
            st.setString(7, aluno.getCEP());
            st.setString(8, aluno.getCidade());
            st.setString(9, aluno.getEndereco());
            st.setString(10, aluno.getNmResponsavel1());
            st.setString(11, aluno.getNmResponsavel2());
            st.setString(12, aluno.getNumChamada());
            st.setInt(13, aluno.getCurso());
            st.setInt(14, aluno.getTurma());
            st.setBoolean(15, aluno.isAtivo());
            st.setInt(16, aluno.getSexo());

//            System.out.println("ID:"+proximoCodigo+"\n"+
//                    "Nome:"+aluno.getNome()+"\n"+
//                    "Data:"+aluno.getDtNasc()+"\n"+
//                    "RA:"+aluno.getRA()+"\n"+
//                    "Fixo:"+aluno.getTelFixo()+"\n"+
//                    "Celular:"+aluno.getTelCelular()+"\n"+
//                    "CEP:"+aluno.getCEP()+"\n"+
//                    "Cidade:"+aluno.getCidade()+"\n"+
//                    "Endereço:"+aluno.getEndereco()+"\n"+
//                    "Rsp1:"+aluno.getNmResponsavel1()+"\n"+
//                    "Rsp2:"+aluno.getNmResponsavel2()+"\n"+
//                    "Número Chamada:"+aluno.getNumChamada()+"\n"+
//                    "Curso:"+aluno.getCurso()+"\n"+
//                    "Turma:"+aluno.getTurma()+"\n"+
//                    "Ativo?:"+aluno.isAtivo()+"\n"+
//                    "Sexo:"+aluno.getSexo());
            
            System.out.println(insert);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "O aluno foi cadastrado com sucesso!", "Status do Cadastro", 1);
        } catch (Exception e) {
            System.out.println("Algo aconteceu de errado! " + e);
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro!", "Status do Cadastro", 0);
        }
    }

    public void pesquisaAluno(String sql, Connection con) throws SQLException {
        Aluno aluno = new Aluno();
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            st = (PreparedStatement) con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                aluno.setId(rs.getInt(1));
                aluno.setNome(rs.getString(2));
                aluno.setDtNasc(rs.getString(3));
                aluno.setRA(rs.getString(4));
                aluno.setTelFixo(rs.getString(5));
                aluno.setTelCelular(rs.getString(6));
                aluno.setCEP(rs.getString(7));
                aluno.setCidade(rs.getString(8));
                aluno.setEndereco(rs.getString(9));
                aluno.setNmResponsavel1(rs.getString(10));
                aluno.setNmResponsavel2(rs.getString(11));
                aluno.setNumChamada(rs.getString(12));
                aluno.setCurso(rs.getInt(13));
                aluno.setTurma(rs.getInt(14));
                aluno.setAtivo(rs.getBoolean(15));
                aluno.setSexo(rs.getInt(16));
            }
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, aluno.getNome());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Nada encontrado");
        } finally {
            rs.close();
            st.close();
        }
    }

    public ArrayList<Aluno> pesquisar(String sql, Connection con) {
        ArrayList<Aluno> lista = new ArrayList<>();
        try (PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                lista.add(new Aluno(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), 
                        rs.getInt(13), rs.getInt(14), rs.getBoolean(15), rs.getInt(16)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Nada encontrado!", "Status da Pesquisa", 0);
        }
        return lista;
    }
    
}
