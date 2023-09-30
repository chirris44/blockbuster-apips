package mx.metaphorce.blockbusterapips.controller;
import java.util.List;

import mx.metaphorce.blockbusterapips.model.Resena;
import mx.metaphorce.blockbusterapips.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resena")
public class ResenaController {

    @Autowired
    ResenaService ser;

    @PostMapping("/add")
    public void add(@RequestBody Resena body){
        ser.add(body);
    }

    @GetMapping("/getAll")
    public List<Resena> getAll(){
        return ser.getAll();
    }
}
