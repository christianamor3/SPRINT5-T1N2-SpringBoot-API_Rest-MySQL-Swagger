package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.services;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.dto.FlorEntityDTO;
import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.repository.FlorEntityRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlorEntityServiceImpl implements FlorEntityService {

    @Autowired
    FlorEntityRepository repo;


    @Override
    public FlorEntityDTO save(FlorEntityDTO florEntityDTO) {
       FlorEntity florEntity = FlorEntityDTO.toEntity(florEntityDTO);
       repo.save(florEntity);

       return FlorEntityDTO.toDTO(florEntity);
    }

    @Override
    public FlorEntityDTO update(int id, FlorEntityDTO florEntityDTO) {
        Optional<FlorEntity> florEntity = repo.findById(id);

        if (florEntity.isPresent()){
            florEntity.get().setNomFlor(florEntityDTO.getNomFlor());
            florEntity.get().setPaisFlor(florEntityDTO.getPaisFlor());

            repo.save(florEntity.get());

            return FlorEntityDTO.toDTO(florEntity.get());
        } else {
           throw new EntityNotFoundException("No se ha encontrado la flor con ese ID");
        }
    }

    @Override
    public String deleteById(int id) {
        Optional<FlorEntity> florEntityOp = repo.findById(id);

        if (florEntityOp.isPresent()){
            repo.deleteById(id);
            return "Se ha eliminado la flor correctamente";
        } else {
            throw new EntityNotFoundException("No se ha encontrado la flor con ese ID");
        }

    }

    @Override
    public FlorEntityDTO findById(int id) {
        Optional<FlorEntity> florEntityOp = repo.findById(id);

        if (florEntityOp.isEmpty()){
            throw new EntityNotFoundException("No se ha encontrado la flor");
        } else {
            return FlorEntityDTO.toDTO(florEntityOp.get());
        }
    }

    @Override
    public List<FlorEntityDTO> findAll() {
        return repo.findAll().stream().map(FlorEntityDTO::toDTO).collect(Collectors.toList());
    }
}
