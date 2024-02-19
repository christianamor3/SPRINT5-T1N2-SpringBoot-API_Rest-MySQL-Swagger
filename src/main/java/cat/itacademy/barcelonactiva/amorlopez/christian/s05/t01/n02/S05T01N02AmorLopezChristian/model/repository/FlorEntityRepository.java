package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.domain.FlorEntity;

@Repository
public interface FlorEntityRepository extends JpaRepository<FlorEntity, Integer> {
}
