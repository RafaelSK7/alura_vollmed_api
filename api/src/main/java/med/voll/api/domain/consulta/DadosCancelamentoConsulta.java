package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(

        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo



) {
}
