package mx.metaphorce.blockbusterapips.repository;
import mx.metaphorce.blockbusterapips.model.Resena;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResenaRepository extends CrudRepository<Resena, Integer>{

}