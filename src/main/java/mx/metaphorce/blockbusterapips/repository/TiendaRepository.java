package mx.metaphorce.blockbusterapips.repository;

import mx.metaphorce.blockbusterapips.model.Tienda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends CrudRepository<Tienda, Integer>{

}
