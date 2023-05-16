package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonAlias;

public enum MotivoCancelamento {

    @JsonAlias("paciente desistiu")
    PACIENTE_DESISTIU,
    @JsonAlias("medico cancelou")
    MEDICO_CANCELOU,
    OUTROS

}
