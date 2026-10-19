package org.example.mcms_webapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ForePawGripStrength {

    @Id
    private String MouseName;
    private String SubjectGroup;
    private Float GripStrength;

    public String getMouseName() {
        return MouseName;
    }

    public void setMouseName(String mouseName) {
        MouseName = mouseName;
    }

    public String getSubjectGroup() {
        return SubjectGroup;
    }

    public void setSubjectGroup(String subjectGroup) {
        SubjectGroup = subjectGroup;
    }

    public Float getGripStrength() {
        return GripStrength;
    }

    public void setGripStrength(Float gripStrength) {
        GripStrength = gripStrength;
    }
}
