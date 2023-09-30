package mx.metaphorce.blockbusterapips.service;

import mx.metaphorce.blockbusterapips.model.Resena;
import mx.metaphorce.blockbusterapips.repository.ResenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ResenaService {
    @Autowired
    ResenaRepository repo;

    public List<Resena> getAll(){
        List<Resena> resenas = new ArrayList<>();
        for(Resena resena : repo.findAll()){
            resenas.add(resena);
        }
        return resenas;
    }

    public void add(Resena resena){
        repo.save(resena);
    }

}
