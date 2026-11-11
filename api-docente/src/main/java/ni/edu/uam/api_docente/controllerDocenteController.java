package ni.edu.uam.api_docente;

import ni.edu.uam.api_docente.modelo.Docente;
import ni.edu.uam.api_docente.repository.DocenteRepository;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/docentes")



public class DocenteController {
   private final  DocenteRepository repository;


   public DocenteController(DocenteRepository repository) {
       this.repository  = repository;
   }

   public List<Docente>  getAllDocentes() {

       return repository.findAll();
   }
   public Docente guardar (@RequestBody Docente docente) {
    return repository.save(docente);


   }



}
