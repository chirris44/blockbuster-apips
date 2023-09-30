package mx.metaphorce.blockbusterapips.service;
import mx.metaphorce.blockbusterapips.model.Transaccion;
import mx.metaphorce.blockbusterapips.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TransaccionService {
    @Autowired
    TransaccionRepository repo;

    public List<Transaccion> getAll(){
        List<Transaccion> transaccions = new ArrayList<>();
        for(Transaccion transaccion : repo.findAll()){
            transaccions.add(transaccion);
        }
        return transaccions;
    }

    public void add(Transaccion transaccion){
        repo.save(transaccion);
    }

}

