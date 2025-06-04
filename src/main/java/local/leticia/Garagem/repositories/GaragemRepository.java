/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.leticia.Garagem.repositories;

import java.util.List;
import local.leticia.Garagem.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjatb
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long >{
    Veiculo findById(long id);
}

    

