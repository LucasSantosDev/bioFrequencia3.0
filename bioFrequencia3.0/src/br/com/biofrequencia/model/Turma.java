package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class Turma {

    private int id;
    private int curso;
    private int modulo;
    private String periodo;
    private int ano;
    private String sigla;
    private String sala;
    private int semestre;
    private boolean ativo;

    public Turma() {
        this.id = 0;
        this.curso = 0;
        this.modulo = 0;
        this.periodo = "";
        this.ano = 0;
        this.sigla = "";
        this.sala = "";
        this.semestre = 0;
        this.ativo = false;
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
