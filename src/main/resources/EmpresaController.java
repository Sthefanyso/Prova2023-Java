import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    }
}
