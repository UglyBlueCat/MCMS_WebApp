// https://www.baeldung.com/spring-data-jpa-update-or-insert

package org.example.mcms_webapp;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;
import java.util.Map;

public interface ForePawGripStrengthRepository extends JpaRepository<ForePawGripStrength, Integer> {
    @NativeQuery("""
            select mts_mouse.litter_id, AVG(fore_paw_grip_strength.grip_strength)
            from fore_paw_grip_strength
            join mts_mouse on fore_paw_grip_strength.mouse_name = mts_mouse.name
            group by mts_mouse.litter_id
            """)
    List<Map<Integer, Float>> findAverageGripStrengthByLitter();

    @Transactional
    default ForePawGripStrength updateOrinsert(ForePawGripStrength entity) {
        return save(entity);
    }
}
