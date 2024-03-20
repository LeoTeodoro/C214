package br.inatel.test;

import br.inatel.HorarioAtendimentoService;

import java.util.ArrayList;

public class MockHorarioAtendimentoService implements HorarioAtendimentoService {


    @Override
    public String buscaHorarioAtendimento(String nomeDoProfessor) {

        if (nomeDoProfessor == "YVO"){
            return HorarioAtendimentoConst.YVO;
        }else if (nomeDoProfessor == "CHRIS"){
            return HorarioAtendimentoConst.CHRIS;
        }else if (nomeDoProfessor == "RENZO"){
            return HorarioAtendimentoConst.RENZO;
        }else if (nomeDoProfessor == "VITORIA"){
            return HorarioAtendimentoConst.VITORIA;
        }else if (nomeDoProfessor == "MARCELO"){
            return HorarioAtendimentoConst.MARCELO;
        }else{
            return HorarioAtendimentoConst.INEXISTENTE;
        }
    }

    @Override
    public boolean horarioAtendimentoExistente(String nomeDoProfessor) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("YVO");
        list.add("CHRIS");
        list.add("RENZO");
        list.add("VITORIA");
        list.add("MARCELO");

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(nomeDoProfessor) || list.get(i).equals(nomeDoProfessor)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }

}
