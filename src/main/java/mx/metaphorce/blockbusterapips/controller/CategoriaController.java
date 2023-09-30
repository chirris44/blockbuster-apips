package mx.metaphorce.blockbusterapips.controller;

import java.util.List;

import mx.metaphorce.blockbusterapips.model.Categoria;
import mx.metaphorce.blockbusterapips.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService ser;

    @PostMapping("/add")
    public void add(@RequestBody Categoria body){
        ser.add(body);
    }

    @GetMapping("/getAll")
    public List<Categoria> getAll(){
        return ser.getAll();
    }
}