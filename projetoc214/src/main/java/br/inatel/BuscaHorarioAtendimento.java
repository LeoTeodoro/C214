package br.inatel;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorarioAtendimento {

    HorarioAtendimentoService horarioAtendimentoService;

    public BuscaHorarioAtendimento(HorarioAtendimentoService service){
        this.horarioAtendimentoService = service;
    }

    public HorarioAtendimento buscaHorarioAtendimento(String nomeDoProfessor){
        // id = 10 -> buscando um HorarioAtendimento de ID 10
        //atendimentoJson é uma string que retornou do serviço
        String atendimentoJson = horarioAtendimentoService.buscaHorarioAtendimento(nomeDoProfessor);

        //jsonObject é um objeto JSON feito a partir da string de retonro
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