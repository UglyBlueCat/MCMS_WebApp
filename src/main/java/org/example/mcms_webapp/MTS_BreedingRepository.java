package org.example.mcms_webapp;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTS_BreedingRepository extends JpaRepository<MTS_BREEDING, Integer> {
    @Transactional
    default MTS_BREEDING updateOrinsert(MTS_BREEDING entity) {
        return save(entity);
    }
}
