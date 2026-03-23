package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ForePawGripStrengthRepository forePawGripStrengthRepository;

    @GetMapping("/")
    public String greeting() {

        String subjectGroup = "Controls (Wildtype)";
        String mouseName = "GPAA780.2c";
        Float gripStrength = 114f;
        ForePawGripStrength forePawGripStrength = new ForePawGripStrength();
        forePawGripStrength.setSubjectGroup(subjectGroup);
        forePawGripStrength.setMouseName(mouseName);
        forePawGripStrength.setGripStrength(gripStrength);
        forePawGripStrengthRepository.save(forePawGripStrength);

        return "Database initialisation complete";
    }
}
