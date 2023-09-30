package mx.metaphorce.blockbusterapips.service;

import mx.metaphorce.blockbusterapips.model.Categoria;
import mx.metaphorce.blockbusterapips.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repo;

    public List<Categoria> getAll(){
        List<Categoria> categorias = new ArrayList<>();
        for(Categoria categoria : repo.findAll()){
            categorias.add(categoria);
        }
        return categorias;
    }

    public void add(Categoria categoria){
        repo.save(categoria);
    }

}
