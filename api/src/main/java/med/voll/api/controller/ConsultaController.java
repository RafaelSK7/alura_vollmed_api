package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.consulta.ConsultaService;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import med.voll.api.domain.consulta.DadosDetalhamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    @Transactional
    public ResponseEntity agendarConsulta(@RequestBody @Valid DadosAgendamentoConsulta dados){
        var dto = consultaService.agendar(dados);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/cancelar")
    @Transactional
    public ResponseEntity cancelarConsulta(@RequestBody @Valid DadosCancelamentoConsulta dados){
        consultaService.cancelar(dados);
        return ResponseEntity.ok(new DadosCancelamentoConsulta(dados.idConsulta(), dados.motivo()));
    }

}
