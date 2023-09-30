package mx.metaphorce.blockbusterapips.repository;
import mx.metaphorce.blockbusterapips.model.Transaccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends CrudRepository<Transaccion, Integer>{

}
