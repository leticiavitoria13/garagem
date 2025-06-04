/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.leticia.Garagem.controllers;

import java.util.List;
import local.leticia.Garagem.DTO.VeiculoMinDTO;
import local.leticia.Garagem.entities.Veiculo;
import local.leticia.Garagem.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjatb
 */
@RestController
public class GaragemController {

    @Autowired
    private GaragemService garagemService;

    @GetMapping("/forsale")
    public ResponseEntity<List<VeiculoMinDTO>> findAll() {
        List<VeiculoMinDTO> result = garagemService.findAll();
         if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Veiculo> findById (@PathVariable long id) {
        Veiculo result = garagemService.findById(id);
        
        if(result == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping ("/cor/{corName}")
    public ResponseEntity<List<VeiculoMinDTO>> findByCorIgnoreCase(@PathVariable String corName) {
        
        List<VeiculoMinDTO> result = garagemService.findByCor (corName) ;
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping ("/ano/{ano}")
    public ResponseEntity<List<VeiculoMinDTO>> findByAno(@PathVariable int ano) {
        
        List<VeiculoMinDTO> result = garagemService.findByAno (ano) ;
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}