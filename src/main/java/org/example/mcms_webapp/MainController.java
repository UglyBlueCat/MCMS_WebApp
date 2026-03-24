package org.example.mcms_webapp;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String greeting() {

        String forepawGripStrengthJSON = ForePawGripStrengthLogic.SampleJSON;

        String response = "Database initialisation complete";

        try {
            JsonArray forepawGripStrengthJsonArray = JsonParser.parseString(forepawGripStrengthJSON).getAsJsonArray();

            final int forepawGripStrengthJsonArraySize = forepawGripStrengthJsonArray.size();

            for (int i = 0; i < forepawGripStrengthJsonArraySize; i++) {
                JsonObject forepawGripStrengthJsonObject = forepawGripStrengthJsonArray.get(i).getAsJsonObject();

                String subjectGroup = forepawGripStrengthJsonObject.get("SubjectGroup").getAsString();
                String mouseName = forepawGripStrengthJsonObject.get("MouseName").getAsString();
                Float gripStrength = forepawGripStrengthJsonObject.get("GripStrength").getAsFloat();

                ForePawGripStrengthLogic.AddDatabaseEntry(mouseName, subjectGroup, gripStrength);
            }
        } catch (JsonSyntaxException e) {
            response = "Error: "+e+"<p>forepawGripStrengthJSON: "+forepawGripStrengthJSON;
        }

        return response;
    }
}
