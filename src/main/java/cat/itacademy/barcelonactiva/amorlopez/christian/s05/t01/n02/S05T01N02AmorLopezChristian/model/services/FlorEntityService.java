package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.services;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.dto.FlorEntityDTO;

import java.util.List;
import java.util.Optional;

public interface FlorEntityService {

    FlorEntityDTO save (FlorEntityDTO florEntityDTO);

    FlorEntityDTO update (int id, FlorEntityDTO florEntityDTO);

    String deleteById(int id);

    FlorEntityDTO findById(int id);

    List<FlorEntityDTO> findAll();
}
