package med.vol.api.domain.consulta;

import java.time.LocalDateTime;

public record DetalhamentoConsulta(
        Long id,
        Long idMedico,
        Long idPaciente,
        LocalDateTime data
) {
}
