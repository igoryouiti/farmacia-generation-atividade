package br.org.generation.crudfarmacia.repository;

import br.org.generation.crudfarmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}

