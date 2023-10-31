package com.backendwebi.backendwebi.controller;

import com.backendwebi.backendwebi.model.CategoriaModel;
import com.backendwebi.backendwebi.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/torneios/{torNrId}/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(
            @PathVariable("torNrId") int torNrId,
            @RequestBody CategoriaModel categoriaModel) {

        CategoriaModel categoriaCadastrada = categoriaService.cadastrar(torNrId, categoriaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body("Categoria cadastrada com sucesso!");
    }
}
