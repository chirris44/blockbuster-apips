package mx.metaphorce.blockbusterapips.repository;

import mx.metaphorce.blockbusterapips.model.Vendedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Integer>{

}
