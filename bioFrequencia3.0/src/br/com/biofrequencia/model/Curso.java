package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class Curso {
    
    private int id = 0;
    private String nomeCurso = "";
    private int quantidadeModulos = 0;
    private boolean ativo = false;

    public Curso() {
        
    }

    public Curso(String nomeCurso, int quantidadeModulos, boolean ativo) {
        this.nomeCurso = nomeCurso;
        this.quantidadeModulos = quantidadeModulos;
        this.ativo = ativo;
    }

    public Curso(int id, String nomeCurso, int quantidadeModulos, boolean ativo) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.quantidadeModulos = quantidadeModulos;
        this.ativo = ativo;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    
    public void setNomeCurso(String NomeCurso) {
        this.nomeCurso = NomeCurso;
    }

    public int getQuantidadeModulos() {
        return quantidadeModulos;
    }

    public void setQuantidadeModulos(int quantidadeModulos) {
        this.quantidadeModulos = quantidadeModulos;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
