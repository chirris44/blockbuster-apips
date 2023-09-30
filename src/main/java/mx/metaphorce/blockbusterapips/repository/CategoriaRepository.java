package mx.metaphorce.blockbusterapips.repository;


import mx.metaphorce.blockbusterapips.model.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{

}
