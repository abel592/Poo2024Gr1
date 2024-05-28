
package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Cliente;
import pe.edu.upeu.syscenterlife.repositorio.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository repository;
    
    //C
    public Cliente guardarEntidad(Cliente cliente){
    return repository.save(cliente);
    }
    //R
    public List <Cliente> listarEntidad(){
    return repository.findAll();
    }
    //
    public Cliente updateEntidad(Cliente cliente){
    return repository.save(cliente);
    }
    //D
    public void eliminarRegEntidad (String dniruc){
    repository.delete(repository.findById(dniruc).get());
    }
    //Buscar
    public Cliente buscarCliente(String dniruc){
    return repository.findById(dniruc).get();
    }
}