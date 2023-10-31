package com.backendwebi.backendwebi.controller;

import org.springframework.http.HttpStatus;
import com.backendwebi.backendwebi.model.UsuarioModel;
import com.backendwebi.backendwebi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Object cadastrar(@RequestBody @Valid UsuarioModel usuarioModel) {
        usuarioService.cadastrar(usuarioModel);
        return "Usuário cadastrado com sucesso!";
    }
    @PostMapping("/autenticar")
    public ResponseEntity<String> autenticar(@RequestBody UsuarioModel usuarioModel){
    String usuTxLogin = usuarioModel.getUsuTxLogin();
    String usuTxSenha = usuarioModel.getUsuTxSenha();

        if (usuarioService.autenticarUsuario(usuTxLogin, usuTxSenha)) {
            return ResponseEntity.ok("Usuário autenticado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Falha na autenticação. Verifique seu nome de usuário e senha.");
        }
    }
    @GetMapping("/listarTodosUsuarios")
    public List<UsuarioModel> listarTodosUsuarios(){
        return usuarioService.listarTodosUsuarios();
    }
    @GetMapping("/encontrarUsuarioPeloId/{usuNrId}")
    public Object encontrarUsuarioPeloId(@PathVariable int usuNrId){
        return usuarioService.encontrarUsuarioPeloId(usuNrId);
    }
    @GetMapping("/buscarPorNome/{usuTxNome}")
    public ResponseEntity<UsuarioModel> buscarPorNome(@PathVariable String usuTxNome) {
        UsuarioModel usuario = usuarioService.encontrarUsuarioPeloNome(usuTxNome);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
