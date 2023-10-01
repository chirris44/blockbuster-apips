package mx.metaphorce.blockbusterapips.controller;

import java.util.List;

import mx.metaphorce.blockbusterapips.model.Inventario;
import mx.metaphorce.blockbusterapips.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    InventarioService ser;

    @PostMapping("/add")
    public void add(@RequestBody Inventario body){
        ser.add(body);
    }

    @GetMapping("/getAll")
    public List<Inventario> getAll(){
        return ser.getAll();
    }
}
