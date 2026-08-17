package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String msm() {
        return "Essa é minha missao Ninja";
    }

    @PostMapping("/adicionar")
    public String adicionarMissao() {
        return "Adicionar Missao";
    }

    @GetMapping("/todos")
    public String mostrarTodasMissoes() {
        return "Mostrar todas missoes";
    }

    @GetMapping("/todosID")
    public String mostrarMissaoPorID(){
        return "Mostrar missao por ID";
    }

    @PutMapping("/alterarID")
    public String alterarMissaoPorID() {
        return "Alterar por ID";
    }

    @DeleteMapping("/deletarID")
    public String deletarMissao() {
        return "Deletar Missao";
    }

}
