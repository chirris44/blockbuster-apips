package mx.metaphorce.blockbusterapips.service;

import mx.metaphorce.blockbusterapips.model.Carrito;
import mx.metaphorce.blockbusterapips.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarritoService {
    @Autowired
    CarritoRepository repo;

    public List<Carrito> getAll(){
        List<Carrito> carritos = new ArrayList<>();
        for(Carrito carrito : repo.findAll()){
            carritos.add(carrito);
        }
        return carritos;
    }

    public void add(Carrito carrito){
        repo.save(carrito);
    }

}