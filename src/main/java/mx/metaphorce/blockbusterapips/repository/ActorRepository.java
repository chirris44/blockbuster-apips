package mx.metaphorce.blockbusterapips.repository;

import mx.metaphorce.blockbusterapips.model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer>{
    
}
