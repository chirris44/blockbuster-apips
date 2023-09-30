package mx.metaphorce.blockbusterapips.repository;
import mx.metaphorce.blockbusterapips.model.EmailNotificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailNotificacionRepository extends CrudRepository<EmailNotificacion, Integer>{

}
