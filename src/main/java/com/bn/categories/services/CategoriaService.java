package com.bn.categories.services;

import com.bn.categories.models.CategoriaModel;
import com.bn.categories.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaModel criarCategoria(CategoriaModel categoriaModel) {
        return categoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> buscarTodasCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaModel> buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    public void deletarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

}
