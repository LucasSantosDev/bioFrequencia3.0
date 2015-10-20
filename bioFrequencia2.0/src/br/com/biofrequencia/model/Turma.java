package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class Turma {

    private int id = 0;
    private int curso = 0;
    private int modulo = 0;
    private String periodo = "";
    private int ano = 0;
    private String sigla = "";
    private String sala = "";
    private int semestre = 0;
    private boolean ativo = false;

    public Turma() {

    }

    public Turma(int id, int curso, int modulo, String periodo, int ano, String sigla, String sala, int semestre, boolean ativo) {
        this.id = id;
        this.curso = curso;
        this.modulo = modulo;
        this.periodo = periodo;
        this.ano = ano;
        this.sigla = sigla;
        this.sala = sala;
        this.semestre = semestre;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
