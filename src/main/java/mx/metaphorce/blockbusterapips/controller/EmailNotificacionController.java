package mx.metaphorce.blockbusterapips.controller;
import java.util.List;

import mx.metaphorce.blockbusterapips.model.EmailNotificacion;
import mx.metaphorce.blockbusterapips.service.EmailNotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emailnotificacion")
public class EmailNotificacionController {

    @Autowired
    EmailNotificacionService ser;

    @PostMapping("/add")
    public void add(@RequestBody EmailNotificacion body){
        ser.add(body);
    }

    @GetMapping("/getAll")
    public List<EmailNotificacion> getAll(){
        return ser.getAll();
    }
}