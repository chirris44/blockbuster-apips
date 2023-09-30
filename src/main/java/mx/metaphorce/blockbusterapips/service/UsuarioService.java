package mx.metaphorce.blockbusterapips.service;

import java.util.ArrayList;
import java.util.List;
import mx.metaphorce.blockbusterapips.model.Usuario;
import mx.metaphorce.blockbusterapips.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repo;
    
    public List<Usuario> getAll(){
        List<Usuario> actores = new ArrayList<>();
        for(Usuario usuario : repo.findAll()){
            actores.add(usuario);
        }
        return actores;
    }
    
        public void add(Usuario usuario){
        repo.save(usuario);
    }
}
