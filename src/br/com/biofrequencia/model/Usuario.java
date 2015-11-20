package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class Usuario {
    int id = 0;
    String nome = "";
    String dtNasc = "";
    String CPF = "";
    String RG = "";
    String telFixo = "";
    String telCelular = "";
    String email = "";
    int tpCadastro = 0;
    boolean ativo = false;
    String senha = "";
    
    public Usuario() {
    }

    public Usuario(int id, String nome, String dtNasc, String CPF, String RG, String telFixo, String telCelular, String email, int tpCadastro, boolean ativo, String senha) {
        this.id = id;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.CPF = CPF;
        this.RG = RG;
        this.telFixo = telFixo;
        this.telCelular = telCelular;
        this.email = email;
        this.tpCadastro = tpCadastro;
        this.ativo = ativo;
        this.senha = senha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTpCadastro() {
        return tpCadastro;
    }

    public void setTpCadastro(int tpCadastro) {
        this.tpCadastro = tpCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void setSenha (String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
}
