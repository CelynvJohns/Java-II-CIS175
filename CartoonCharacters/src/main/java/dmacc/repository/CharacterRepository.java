package dmacc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Characters;

@Repository
public interface CharacterRepository extends JpaRepository<Characters, Long>{

}
