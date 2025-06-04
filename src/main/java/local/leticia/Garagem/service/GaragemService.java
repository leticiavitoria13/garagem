/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.leticia.Garagem.service;

import java.util.List;
import local.leticia.Garagem.entities.Veiculo;
import local.leticia.Garagem.repositories.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjatb
 */
@Service
public class GaragemService {

    @Autowired
    private GaragemRepository garagemRepository;

    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }
}
