package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements InterfaceValidadoraAgendamento {

    public void validar(DadosAgendamentoConsulta dados){
        var agora = LocalDateTime.now();
        var diferencaEmHoras = Duration.between(agora, dados.data()).toMinutes();
        if (diferencaEmHoras < 30){
            throw new ValidacaoException("Uma consulta somente poderá ser agendada com antecedência de 30 minutos.");
        }
    }

}
