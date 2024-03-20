package br.inatel;

public class HorarioAtendimento {

    private String nomeDoProfessor;
    private String horarioAtendimento;
    private String periodo;
    private int sala;
    private String predio;

    public HorarioAtendimento (String nomeDoProfessor, String horarioAtendimento, String periodo, int sala, String predio){
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioAtendimento = horarioAtendimento;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }
}
