import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fatec.provajava.services.EmpresaService;

public class EmpresaController {
    
    @PostMapping
    public ResponseEntity<Empresa> saveEmpresa(@RequestBody Empresa empresa){
        Empresa newEmpresa = empresaService.save(empresa);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(fornecedor.getId())
            .toUri();

        return ResponseEntity.created(location).body(newEmpresa);
    
    @Autowired
    private EmpresaService empresaService;     

    @GetMapping("Empresas")
    public ResponseEntity<List<Empresa>> getEmpresa(){
        list<Empresa> Empresas = empresaService.getEmpresa();
        return ResponseEntity.ok().body(empresa);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable int id){
        empresaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    

}
