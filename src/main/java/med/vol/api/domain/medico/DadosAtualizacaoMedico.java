package med.vol.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,

        String telefone,
        String nome,
        DadosEndereco endereco
) {

}
