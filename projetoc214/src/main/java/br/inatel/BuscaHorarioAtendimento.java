package br.inatel;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorarioAtendimento {

    HorarioAtendimentoService horarioAtendimentoService;

    public BuscaHorarioAtendimento(HorarioAtendimentoService service){
        this.horarioAtendimentoService = service;
    }

    public HorarioAtendimento buscaHorarioAtendimento(String nomeDoProfessor){

        String atendimentoJson = horarioAtendimentoService.buscaHorarioAtendimento(nomeDoProfessor);

        JsonObject jsonObject = JsonParser.parseString(atendimentoJson).getAsJsonObject();

        return new HorarioAtendimento(jsonObject.get("nomeDoProfessor").getAsString(),
        jsonObject.get("horarioDeAtendimento").getAsString(),
        jsonObject.get("periodo").getAsString(),
        jsonObject.get("sala").getAsInt(),
        jsonObject.getAsJsonArray("predio").getAsString());
    }

    public boolean verificaArrayListExistente(String nomeDoProfessor){
        boolean horarioAtendimentoExistente = horarioAtendimentoService.horarioAtendimentoExistente(nomeDoProfessor);

        if (horarioAtendimentoExistente){
            return true;
        }else{
            return false;
        }
    }

}