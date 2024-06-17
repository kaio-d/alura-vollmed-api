package med.vol.api.domain.medico;

import med.vol.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        Endereco endereco,
        String telefone
) {

    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),
                medico.getEspecialidade(), medico.getEndereco(), medico.getTelefone());
    }

}
