package org.example.mcms_webapp;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTS_MouseRepository extends JpaRepository<MTS_MOUSE, Integer> {
    @Transactional
    default MTS_MOUSE updateOrinsert(MTS_MOUSE entity) {
        return save(entity);
    }
}
