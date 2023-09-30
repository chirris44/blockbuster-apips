package mx.metaphorce.blockbusterapips.service;
import mx.metaphorce.blockbusterapips.model.Producto;
import mx.metaphorce.blockbusterapips.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductoService {
    @Autowired
    ProductoRepository repo;

    public List<Producto> getAll(){
        List<Producto> productos = new ArrayList<>();
        for(Producto producto : repo.findAll()){
            productos.add(producto);
        }
        return productos;
    }

    public void add(Producto producto){
        repo.save(producto);
    }

}
