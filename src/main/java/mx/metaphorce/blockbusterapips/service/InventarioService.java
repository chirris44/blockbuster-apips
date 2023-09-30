package mx.metaphorce.blockbusterapips.service;
import mx.metaphorce.blockbusterapips.model.Inventario;
import mx.metaphorce.blockbusterapips.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InventarioService {
    @Autowired
    InventarioRepository repo;

    public List<Inventario> getAll(){
        List<Inventario> inventarios = new ArrayList<>();
        for(Inventario inventario : repo.findAll()){
            inventarios.add(inventario);
        }
        return inventarios;
    }

    public void add(Inventario inventario){
        repo.save(inventario);
    }

}
