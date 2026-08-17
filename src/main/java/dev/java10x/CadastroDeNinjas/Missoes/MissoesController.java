package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // Post - mandar requisicao para criar
    @PostMapping("/criar")
    public String adicionarMissao() {
        return "Adicionar Missao";
    }

    //Get - mandar requisicao para pegar
    @GetMapping("/todos")
    public String listarTodasMissoes() {
        return "Mostrar todas missoes";
    }

    @GetMapping("/todosID")
    public String listarMissaoPorID(){
        return "Mostrar missao por ID";
    }

    // Put - mandar requisicao para alterar
    @PutMapping("/alterarID")
    public String alterarMissaoPorID() {
        return "Alterar por ID";
    }

    // Deletar - mandar requisicao para deletar
    @DeleteMapping("/deletarID")
    public String deletarMissao() {
        return "Deletar Missao";
    }

}
