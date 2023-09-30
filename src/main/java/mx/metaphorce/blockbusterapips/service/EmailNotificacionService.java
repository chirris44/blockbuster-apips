package mx.metaphorce.blockbusterapips.service;

import mx.metaphorce.blockbusterapips.model.EmailNotificacion;
import mx.metaphorce.blockbusterapips.repository.EmailNotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmailNotificacionService {
    @Autowired
    EmailNotificacionRepository repo;

    public List<EmailNotificacion> getAll(){
        List<EmailNotificacion> emailNotificacions = new ArrayList<>();
        for(EmailNotificacion emailNotificacion : repo.findAll()){
            emailNotificacions.add(emailNotificacion);
        }
        return emailNotificacions;
    }

    public void add(EmailNotificacion emailNotificacion){
        repo.save(emailNotificacion);
    }

}
