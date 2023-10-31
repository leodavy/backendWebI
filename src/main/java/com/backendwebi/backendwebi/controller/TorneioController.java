package com.backendwebi.backendwebi.controller;

import com.backendwebi.backendwebi.model.TorneioModel;
import com.backendwebi.backendwebi.service.TorneioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/torneios")
public class TorneioController {
    private final TorneioService torneioService;

    @PostMapping("/cadastrar")
    public Object cadastrar(@RequestBody @Valid TorneioModel torneioModel) {
        torneioService.cadastrar(torneioModel);
        return "Torneio cadastrado com sucesso!";
    }
    @GetMapping("/listarTodosTorneios")
    public List<TorneioModel> listarTodosTorneios(){
        return torneioService.listarTodosTorneios();
    }
}
