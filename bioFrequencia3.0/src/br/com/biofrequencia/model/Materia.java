package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class Materia {
    
    private int id;
    private int turma;
    private String nome;
    private String sigla;
    private int profPrincipal;
    private int profDivisao;
    private boolean ativo;

    public Materia() {
        this.id = 0;
        this.turma = 0;
        this.nome = "";
        this.sigla = "";
        this.profPrincipal = 0;
        this.profDivisao = 0;
        this.ativo = false;
    }
    
    public Materia(int id, int turma, String nome, String sigla, int profPrincipal, int profDivisao, boolean ativo) {
        this.id = id;
        this.turma = turma;
        this.nome = nome;
        this.sigla = sigla;
        this.profPrincipal = profPrincipal;
        this.profDivisao = profDivisao;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getProfPrincipal() {
        return profPrincipal;
    }

    public void setProfPrincipal(int profPrincipal) {
        this.profPrincipal = profPrincipal;
    }

    public int getProfDivisao() {
        return profDivisao;
    }

    public void setProfDivisao(int profDivisao) {
        this.profDivisao = profDivisao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
