package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class Aluno {
    
    private int id;
    private String nome;
    private String dtNasc;
    private String RA;
    private String telFixo;
    private String telCelular;
    private String CEP;
    private String cidade;
    private String endereco;
    private String nmResponsavel1;
    private String nmResponsavel2;
    private String numChamada;
    private int curso;
    private int turma;
    private boolean ativo;
    private int sexo; // 1 = f / 2 = m
    
    public Aluno() {
        this.sexo = 1;
        this.ativo = false;
        this.turma = 0;
        this.curso = 0;
        this.numChamada = "";
        this.nmResponsavel2 = "";
        this.nmResponsavel1 = "";
        this.endereco = "";
        this.cidade = "";
        this.CEP = "";
        this.telCelular = "";
        this.telFixo = "";
        this.RA = "";
        this.dtNasc = "";
        this.nome = "";
        this.id = 0;
        
    }
    
    public Aluno(int id, String nome, String dtNasc, String RA, String telFixo, String telCelular, String CEP, String cidade, String endereco, String nmResponsavel1, String nmResponsavel2, String numChamada, int curso, int turma, boolean ativo, int sexo) {
        this.sexo = 1;
        this.ativo = false;
        this.turma = 0;
        this.curso = 0;
        this.numChamada = "";
        this.nmResponsavel2 = "";
        this.nmResponsavel1 = "";
        this.endereco = "";
        this.cidade = "";
        this.CEP = "";
        this.telCelular = "";
        this.telFixo = "";
        this.RA = "";
        this.dtNasc = "";
        this.nome = "";
        this.id = 0;
        this.id = id;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.RA = RA;
        this.telFixo = telFixo;
        this.telCelular = telCelular;
        this.CEP = CEP;
        this.cidade = cidade;
        this.endereco = endereco;
        this.nmResponsavel1 = nmResponsavel1;
        this.nmResponsavel2 = nmResponsavel2;
        this.numChamada = numChamada;
        this.curso = curso;
        this.turma = turma;
        this.ativo = ativo;
        this.sexo = sexo;
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

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNmResponsavel1() {
        return nmResponsavel1;
    }

    public void setNmResponsavel1(String nmResponsavel1) {
        this.nmResponsavel1 = nmResponsavel1;
    }

    public String getNmResponsavel2() {
        return nmResponsavel2;
    }

    public void setNmResponsavel2(String nmResponsavel2) {
        this.nmResponsavel2 = nmResponsavel2;
    }

    public String getNumChamada() {
        return numChamada;
    }

    public void setNumChamada(String numChamada) {
        this.numChamada = numChamada;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    
}
