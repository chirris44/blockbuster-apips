package mx.metaphorce.blockbusterapips.service;
import mx.metaphorce.blockbusterapips.model.Tienda;
import mx.metaphorce.blockbusterapips.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TiendaService {
    @Autowired
    TiendaRepository repo;

    public List<Tienda> getAll(){
        List<Tienda> tiendas = new ArrayList<>();
        for(Tienda tienda : repo.findAll()){
            tiendas.add(tienda);
        }
        return tiendas;
    }

    public void add(Tienda vendedor){
        repo.save(vendedor);
    }

}
