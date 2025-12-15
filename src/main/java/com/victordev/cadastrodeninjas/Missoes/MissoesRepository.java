package com.victordev.cadastrodeninjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// estendendo a entidade MissoesModel, pegando o tipo do id como parametro.
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
