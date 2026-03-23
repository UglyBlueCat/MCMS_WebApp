// https://www.baeldung.com/spring-data-jpa-update-or-insert

package org.example.mcms_webapp;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForePawGripStrengthRepository extends JpaRepository<ForePawGripStrength, Integer> {
    @Transactional
    default ForePawGripStrength updateOrinsert(ForePawGripStrength entity) {
        return save(entity);
    }
}
