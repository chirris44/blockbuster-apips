package mx.metaphorce.blockbusterapips.repository;

import mx.metaphorce.blockbusterapips.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
}
