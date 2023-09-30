package mx.metaphorce.blockbusterapips.repository;
import mx.metaphorce.blockbusterapips.model.Carrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends CrudRepository<Carrito, Integer>{

}
