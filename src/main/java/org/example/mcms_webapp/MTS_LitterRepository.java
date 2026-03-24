package org.example.mcms_webapp;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTS_LitterRepository extends JpaRepository<MTS_LITTER, Integer> {
    @Transactional
    default MTS_LITTER updateOrinsert(MTS_LITTER entity) {
        return save(entity);
    }
}
