package mx.metaphorce.blockbusterapips.service;
import mx.metaphorce.blockbusterapips.model.Vendedor;
import mx.metaphorce.blockbusterapips.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class VendedorService {
    @Autowired
    VendedorRepository repo;

    public List<Vendedor> getAll(){
        List<Vendedor> vendedores = new ArrayList<>();
        for(Vendedor vendedor : repo.findAll()){
            vendedores.add(vendedor);
        }
        return vendedores;
    }

    public void add(Vendedor vendedor){
        repo.save(vendedor);
    }

}
