package br.com.biofrequencia.model;

/**
 *
 * @author Pindorama
 */
public class RadioButtons {
    
    private int professor = 0;
    private int secretaria = 0;
    private int aluno = 0;    
    private int materias = 0;
    private int turmas = 0;
    private int cursos = 0;
    private int horarios = 0;

    public RadioButtons() {
        
    }
    
    public RadioButtons(int professor, int secretaria, int aluno, int materias, int turmas, int cursos, int horarios) {
        this.professor = professor;
        this.secretaria = secretaria;
        this.aluno = aluno;    
        this.materias = materias;
        this.turmas = turmas;
        this.cursos = cursos;
        this.horarios = horarios;
    }

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    public int getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(int secretaria) {
        this.secretaria = secretaria;
    }

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    public int getTurmas() {
        return turmas;
    }

    public void setTurmas(int turmas) {
        this.turmas = turmas;
    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }

    public int getHorarios() {
        return horarios;
    }

    public void setHorarios(int horarios) {
        this.horarios = horarios;
    }
    
    
}
