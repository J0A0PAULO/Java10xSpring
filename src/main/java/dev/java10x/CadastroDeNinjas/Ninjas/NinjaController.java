package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa minha primeira mensagem";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar todos Ninjas";
    }
    // Mostrar todos os ninjas por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar Ninja";
    }
    // Deletar Ninja (DELETE
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Deletar Ninja";
    }
}

