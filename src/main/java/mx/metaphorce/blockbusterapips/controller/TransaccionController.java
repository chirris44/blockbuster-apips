package mx.metaphorce.blockbusterapips.controller;

import java.util.List;

import mx.metaphorce.blockbusterapips.model.Transaccion;
import mx.metaphorce.blockbusterapips.model.Vendedor;
import mx.metaphorce.blockbusterapips.service.TransaccionService;
import mx.metaphorce.blockbusterapips.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    TransaccionService ser;

    @PostMapping("/add")
    public void add(@RequestBody Transaccion body){
        ser.add(body);
    }

    @GetMapping("/getAll")
    public List<Transaccion> getAll(){
        return ser.getAll();
    }
}
