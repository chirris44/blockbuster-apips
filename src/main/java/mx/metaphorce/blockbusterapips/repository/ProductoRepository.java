package mx.metaphorce.blockbusterapips.repository;

import mx.metaphorce.blockbusterapips.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{

}
