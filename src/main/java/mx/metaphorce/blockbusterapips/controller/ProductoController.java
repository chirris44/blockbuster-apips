package mx.metaphorce.blockbusterapips.controller;
import java.util.List;

import mx.metaphorce.blockbusterapips.model.Producto;
import mx.metaphorce.blockbusterapips.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService ser;

    @PostMapping("/add")
    public void add(@RequestBody Producto body){
        ser.add(body);
    }

    @GetMapping("/getAll")
    public List<Producto> getAll(){
        return ser.getAll();
    }
}
