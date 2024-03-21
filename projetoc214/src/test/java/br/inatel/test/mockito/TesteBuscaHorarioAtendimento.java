package br.inatel.test.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.BuscaHorarioAtendimento;
import br.inatel.HorarioAtendimento;
import br.inatel.HorarioAtendimentoService;
import br.inatel.test.HorarioAtendimentoConst;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaHorarioAtendimento {

    @Mock
    private HorarioAtendimentoService service;
    private BuscaHorarioAtendimento buscaHorarioAtendimento;

    @Before
    public void setup(){
        buscaHorarioAtendimento = new BuscaHorarioAtendimento(service);
    }


    //Testes de sucesso

    @Test
    public void testeBuscaNomeDoProfessorYvo(){
        Mockito.when(service.buscaHorarioAtendimento("YVO")).thenReturn(HorarioAtendimentoConst.YVO);

        HorarioAtendimento yvo = buscaHorarioAtendimento.buscaHorarioAtendimento("YVO");
        //Faz assertion
        assertEquals("Yvo", yvo.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaHorarioAtendimentoChris(){
        Mockito.when(service.buscaHorarioAtendimento("CHRIS")).thenReturn(HorarioAtendimentoConst.CHRIS);

        HorarioAtendimento chris = buscaHorarioAtendimento.buscaHorarioAtendimento("CHRIS");
        //Faz assertion
        assertEquals("19h00", chris.getHorarioAtendimento());

    }

    @Test
    public void testeBuscaPeriodoRenzo(){
        Mockito.when(service.buscaHorarioAtendimento("RENZO")).thenReturn(HorarioAtendimentoConst.RENZO);

        HorarioAtendimento renzo = buscaHorarioAtendimento.buscaHorarioAtendimento("RENZO");
        //Faz assertion
        assertEquals("Noturno", renzo.getPeriodo());

    }

    @Test
    public void testeBuscaSalaVitoria(){
        Mockito.when(service.buscaHorarioAtendimento("VITORIA")).thenReturn(HorarioAtendimentoConst.VITORIA);

        HorarioAtendimento vitoria = buscaHorarioAtendimento.buscaHorarioAtendimento("VITORIA");
        //Faz assertion
        assertEquals(13, vitoria.getSala());

    }

    @Test
    public void testeBuscaHorarioAtendimentoMarcelo(){
        Mockito.when(service.buscaHorarioAtendimento("MARCELO")).thenReturn(HorarioAtendimentoConst.MARCELO);

        HorarioAtendimento marcelo = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCELO");
        //Faz assertion
        assertEquals("Marcelo", marcelo.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaPredioMarcelo(){
        Mockito.when(service.buscaHorarioAtendimento("MARCELO")).thenReturn(HorarioAtendimentoConst.MARCELO);

        HorarioAtendimento marcelo = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCELO");
        //Faz assertion
        assertEquals("6", marcelo.getPredio());

    }

    @Test
    public void testeBuscaHorarioAtendimentoInexistente(){
        Mockito.when(service.buscaHorarioAtendimento("SONED")).thenReturn(HorarioAtendimentoConst.INEXISTENTE);

        HorarioAtendimento inexistente = buscaHorarioAtendimento.buscaHorarioAtendimento("SONED");
        //Faz assertion
        assertEquals("Inexistente", inexistente.getNomeDoProfessor());

    }

        @Test
    public void testeBuscaHorarioAtendimentoValido(){

        Mockito.when(service.horarioAtendimentoExistente("Yvo")).thenReturn(true);
        boolean horarioAtendimentoValido = service.horarioAtendimentoExistente("Yvo");

        assertTrue(horarioAtendimentoValido);
    }

    @Test
    public void testeBuscarHorarioAtendimentoClass(){
        Mockito.when(service.buscaHorarioAtendimento("YVO")).thenReturn(HorarioAtendimentoConst.YVO);
        HorarioAtendimento yvo = buscaHorarioAtendimento.buscaHorarioAtendimento("YVO");

        assertEquals("class br.inatel.HorarioAtendimento", yvo.getClass().toString());

    }

    @Test
    public void testeBuscarHorarioAtendimentoTipo(){
        Mockito.when(service.buscaHorarioAtendimento("YVO")).thenReturn(HorarioAtendimentoConst.YVO);
        HorarioAtendimento yvo = buscaHorarioAtendimento.buscaHorarioAtendimento("YVO");

        assertTrue(yvo instanceof HorarioAtendimento);

    }

    //Testes de falha
    @Test
    public void testeBuscaNomeDoProfessorYvoFalha(){
        Mockito.when(service.buscaHorarioAtendimento("YV")).thenReturn(HorarioAtendimentoConst.INEXISTENTE);

        HorarioAtendimento yvo = buscaHorarioAtendimento.buscaHorarioAtendimento("YV");
        //Faz assertion
        assertNotEquals("Yvo", yvo.getNomeDoProfessor());

    }
    @Test
    public void testeBuscaHorarioAtendimentoChrisFalha(){
        Mockito.when(service.buscaHorarioAtendimento("CHRIS")).thenReturn(HorarioAtendimentoConst.CHRIS);

        HorarioAtendimento chris = buscaHorarioAtendimento.buscaHorarioAtendimento("CHRIS");
        //Faz assertion
        assertFalse("19h30".equals(chris.getHorarioAtendimento()));
    }

    @Test
    public void testeBuscaPeriodoRenzoFalha(){
        Mockito.when(service.buscaHorarioAtendimento("RENZO")).thenReturn(HorarioAtendimentoConst.RENZO);

        HorarioAtendimento renzo = buscaHorarioAtendimento.buscaHorarioAtendimento("RENZO");
        //Faz assertion
        assertNotEquals("Diurno", renzo.getPeriodo());
    }

    @Test
    public void testeBuscaSalaVitoriaFalha(){
        Mockito.when(service.buscaHorarioAtendimento("VITORIA")).thenReturn(HorarioAtendimentoConst.VITORIA);

        HorarioAtendimento vitoria = buscaHorarioAtendimento.buscaHorarioAtendimento("VITORIA");
        //Faz assertion
        assertNotEquals(14, vitoria.getSala());
    }

    @Test
    public void testeBuscaPredioMarceloFalha(){
        Mockito.when(service.buscaHorarioAtendimento("MARCELO")).thenReturn(HorarioAtendimentoConst.MARCELO);

        HorarioAtendimento marcelo = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCELO");
        //Faz assertion
        assertNotEquals("7", marcelo.getPredio());
    }

    @Test
    public void testeBuscaHorarioAtendimentoInexistenteFalha(){
        Mockito.when(service.buscaHorarioAtendimento("SONED")).thenReturn(HorarioAtendimentoConst.INEXISTENTE);

        HorarioAtendimento inexistente = buscaHorarioAtendimento.buscaHorarioAtendimento("SONED");
        //Faz assertion
        assertFalse("Soned".equals(inexistente.getNomeDoProfessor()));
    }

    @Test
    public void testeBuscaHorarioAtendimentoInvalido(){

        Mockito.when(service.horarioAtendimentoExistente("Yvo")).thenReturn(false);
        boolean horarioAtendimentoValido = service.horarioAtendimentoExistente("Yvo");

        assertFalse(horarioAtendimentoValido);
    }

    @Test
    public void testeBuscarHorarioAtendimentoTipoFalha(){
        Mockito.when(service.buscaHorarioAtendimento("YVO")).thenReturn(HorarioAtendimentoConst.YVO);
        HorarioAtendimento yvo = buscaHorarioAtendimento.buscaHorarioAtendimento("YVO");

        assertFalse(yvo instanceof HorarioAtendimentoService);

    }
    
    @Test
    public void testeBuscaHorarioAtendimentoValidoFalse(){

        Mockito.when(service.horarioAtendimentoExistente("Yvo")).thenReturn(false);
        boolean horarioAtendimentoValido = service.horarioAtendimentoExistente("Yvo");

        assertFalse(horarioAtendimentoValido);
    }
    
    @Test
    public void testeBuscaNomeDoProfessorYvoAssertNotEquals(){
        Mockito.when(service.buscaHorarioAtendimento("YV")).thenReturn(HorarioAtendimentoConst.INEXISTENTE);

        HorarioAtendimento yvo = buscaHorarioAtendimento.buscaHorarioAtendimento("YV");
        //Faz assertion
        assertNotEquals("Yvo", yvo.getNomeDoProfessor());

    }

}
