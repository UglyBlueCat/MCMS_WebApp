package org.example.mcms_webapp;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ForePawGripStrengthRepository forePawGripStrengthRepository;

    @GetMapping("/")
    public String greeting() {

        String forepawGripStrengthJSON = "[\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA780.2c\",\"GripStrength\":114},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA711.6d\",\"GripStrength\":105},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA716.4d\",\"GripStrength\":91.4},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA780.2e\",\"GripStrength\":117},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA780.2f\",\"GripStrength\":105},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA731.5g\",\"GripStrength\":116},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA731.5f\",\"GripStrength\":92.3},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA711.6b\",\"GripStrength\":107},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA780.2d\",\"GripStrength\":112},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA758.1c\",\"GripStrength\":88.9},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA731.3c\",\"GripStrength\":113},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA711.6c\",\"GripStrength\":100},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA716.4c\",\"GripStrength\":101},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA731.3b\",\"GripStrength\":93.6},\n" +
                "{\"SubjectGroup\":\"Controls (Wildtype)\",\"MouseName\":\"GPAA780.2b\",\"GripStrength\":103},\n" +
                "{\"SubjectGroup\":\"Subject Group 1 (Heterozygous)\",\"MouseName\":\"MAAE77.1c\",\"GripStrength\":75.5},\n" +
                "{\"SubjectGroup\":\"Subject Group 1 (Heterozygous)\",\"MouseName\":\"MAAE61.2a\",\"GripStrength\":134},\n" +
                "{\"SubjectGroup\":\"Subject Group 1 (Heterozygous)\",\"MouseName\":\"MAAE63.1b\",\"GripStrength\":76.4},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE103.1i\",\"GripStrength\":110},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE103.1h\",\"GripStrength\":105},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE94.1c\",\"GripStrength\":106},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE63.1c\",\"GripStrength\":83.3},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE97.1e\",\"GripStrength\":76},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE94.1e\",\"GripStrength\":103},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE63.1f\",\"GripStrength\":65.7},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE97.1d\",\"GripStrength\":116},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE98.1f\",\"GripStrength\":108},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE97.1a\",\"GripStrength\":91},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE94.1g\",\"GripStrength\":99.2},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE91.1f\",\"GripStrength\":99.6},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE77.1d\",\"GripStrength\":69.1},\n" +
                "{\"SubjectGroup\":\"Subject Group 2 (Homozygous)\",\"MouseName\":\"MAAE65.1f\",\"GripStrength\":93.1}\n" +
                "]";

        String response = "Database initialisation complete";

        try {
            JsonArray forepawGripStrengthJsonArray = JsonParser.parseString(forepawGripStrengthJSON).getAsJsonArray();
            System.out.println("forepawGripStrengthJsonArray: "+forepawGripStrengthJsonArray);

            final int forepawGripStrengthJsonArraySize = forepawGripStrengthJsonArray.size();

            for (int i = 0; i < forepawGripStrengthJsonArraySize; i++) {
                JsonObject forepawGripStrengthJsonObject = forepawGripStrengthJsonArray.get(i).getAsJsonObject();
                System.out.println("forepawGripStrengthJsonObject: "+forepawGripStrengthJsonObject);

                String subjectGroup = forepawGripStrengthJsonObject.get("SubjectGroup").getAsString();
                String mouseName = forepawGripStrengthJsonObject.get("MouseName").getAsString();
                Float gripStrength = forepawGripStrengthJsonObject.get("GripStrength").getAsFloat();
                
                ForePawGripStrength forePawGripStrength = new ForePawGripStrength();
                forePawGripStrength.setSubjectGroup(subjectGroup);
                forePawGripStrength.setMouseName(mouseName);
                forePawGripStrength.setGripStrength(gripStrength);
                forePawGripStrengthRepository.save(forePawGripStrength);
            }
        } catch (Exception e) {
            response = "Error: "+e+"<p>forepawGripStrengthJSON: "+forepawGripStrengthJSON;
        }

        return response;
    }
}
