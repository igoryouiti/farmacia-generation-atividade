package br.org.generation.crudfarmacia.repository;

import br.org.generation.crudfarmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> finAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
