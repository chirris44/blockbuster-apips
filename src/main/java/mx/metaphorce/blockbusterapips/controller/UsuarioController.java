package mx.metaphorce.blockbusterapips.controller;

import java.util.List;
import mx.metaphorce.blockbusterapips.model.Usuario;
import mx.metaphorce.blockbusterapips.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService ser;
    
    @PostMapping("/add")
    public void add(@RequestBody Usuario body){
        ser.add(body);
    }
    
    @GetMapping("/getAll")
    public List<Usuario> getAll(){
        return ser.getAll();
    }
}
