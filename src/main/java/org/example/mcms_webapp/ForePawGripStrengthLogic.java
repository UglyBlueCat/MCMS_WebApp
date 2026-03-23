// https://www.baeldung.com/spring-data-jpa-update-or-insert

package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForePawGripStrengthLogic {
    @Autowired
    private ForePawGripStrengthRepository forePawGripStrengthRepository;

    public void updateOrInsertUsingRepository(ForePawGripStrength forePawGripStrength) {
        forePawGripStrengthRepository.updateOrinsert(forePawGripStrength);
    }
}
