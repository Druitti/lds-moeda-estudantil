package br.pucminas.moeda.repositories;

import br.pucminas.moeda.models.Aluno;
import br.pucminas.moeda.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>  {
}
