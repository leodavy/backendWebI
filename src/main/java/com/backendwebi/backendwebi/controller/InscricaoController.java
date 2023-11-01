package com.backendwebi.backendwebi.controller;

import com.backendwebi.backendwebi.model.InscricaoModel;
import com.backendwebi.backendwebi.service.InscricaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/torneios/{torNrId}/categorias/{catNrId}")
public class InscricaoController {

    private final InscricaoService inscricaoService;

    @PostMapping("/realizarInscricao")
    public ResponseEntity<InscricaoModel> realizarInscricao(
            @PathVariable("torNrId") int torNrId,
            @RequestParam int usuNrId1,
            @RequestParam int usuNrId2,
            @PathVariable("catNrId") int catNrId){

        InscricaoModel inscricaoModel = inscricaoService.realizarInscricaoTorneio(usuNrId1, usuNrId2, catNrId);
        return ResponseEntity.ok(inscricaoModel);

    }

    @GetMapping("/listarInscritos")
    public ResponseEntity<List<InscricaoModel>> listarInscricoesPorCategoria(@PathVariable("torNrId") int torNrId,@PathVariable("catNrId") int catNrId){
        List<InscricaoModel> inscricaoModels = inscricaoService.listarInscritosTorneioPorCategoria(catNrId);
        return ResponseEntity.ok(inscricaoModels);
    }

}
