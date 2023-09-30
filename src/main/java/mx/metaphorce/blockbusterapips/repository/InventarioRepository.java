package mx.metaphorce.blockbusterapips.repository;
import mx.metaphorce.blockbusterapips.model.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Integer>{

}
