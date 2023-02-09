package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;
import org.hibernate.boot.archive.scan.spi.PackageInfoArchiveEntryHandler;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }

}
