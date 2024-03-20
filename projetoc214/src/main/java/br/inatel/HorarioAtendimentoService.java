package br.inatel;

public interface HorarioAtendimentoService {

    public String buscaHorarioAtendimento(String nomeDoProfessor);

    public boolean horarioAtendimentoExistente(String nomeDoProfessor);

}
