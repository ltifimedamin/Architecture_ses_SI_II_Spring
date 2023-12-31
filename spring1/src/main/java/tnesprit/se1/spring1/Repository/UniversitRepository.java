package tnesprit.se1.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tnesprit.se1.spring1.Entities.Bloc;
import tnesprit.se1.spring1.Entities.Chambre;
import tnesprit.se1.spring1.Entities.Universit;

import java.util.List;

public interface UniversitRepository extends JpaRepository<Universit,Long> {
    @Query(value = "SELECT * FROM Universit u WHERE u.nom_universite = :nom", nativeQuery = true)
    List<Universit> findByNom(@Param("nom") String nom);
}
