package org.example.mcms_webapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class MTS_BREEDING {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ID; // INTEGER Primary Key
    private Date START_DATE; // DATE Date breeding pair were set up
    private Date END_DATE; // DATE Date breeding was ended
    private Integer CHECK_NUMBER; // INTEGER Used for optimistic locking in web application
    private String EDITED_BY; // VARCHAR2 (128 Char) Username of last person to edit the record
    private Date EDIT_DATE; // DATE Date record was last saved
    private String COMMENTS; // VARCHAR2 (4000 Char) Comments relating to the whole breeding added by the user
    private Integer CREATOR_ID; // INTEGER Foreign Key to personnel table for creator of the record
    private Date CREATED_DATE; // DATE Date record was created
    private Integer MALE_ID; // INTEGER Foreign Key to MTS_MOUSE for the male in the breeding pair
    private Float FEMALE_ID; // NUMBER Foreign Key to MTS_MOUSE for the female in the breeding pair
    private Integer OFFSPRING_COLONY_ID; // INTEGER Foreign Key to the colony the offspring will belong to
    private Boolean PSEUDO_BREEDING; // NUMBER (1) Is this a breeding with a vasectomised male?
    private Integer EMBRYO_TRANSFER_ID; // INTEGER Foreign Key
    private String NAME_PREFIX; // VARCHAR2 (10 Char) Name of the breeding (4 letter code)
    private Integer BREEDING_NUMBER; // INTEGER Number of the breeding (a sequential number the indicates the number of breedings that have occurred for the given colony)
    private String OFFSPRING_GENERATION; // VARCHAR2 (5 Byte) Generation of the offspring
    private Boolean TIMED_MATING; // NUMBER (1) Is this a breeding which will result in embryos of a given age?
    private Float TIMED_MATING_EMBRYO_AGE; // NUMBER Age required for embryos if this is a timed breeding.
    private Integer BREEDING_CATEGORY_DICT_ID; // INTEGER Dictionary code for the specific type of breeding
    private Integer PROTOCOL_ID; // INTEGER Foreign Key
    private Integer PERSONAL_LICENCE_ID; // INTEGER Foreign Key
    private Integer PROCEDURE_DICT_ID; // INTEGER Foreign Key
    private Integer FOSTER_PARENT_ID; // INTEGER Foreign Key to MTS_MOUSE for optional foster parent.
    private Integer OPERATOR_PIL_ID; // INTEGER Foreign Key

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(Date START_DATE) {
        this.START_DATE = START_DATE;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public Integer getCHECK_NUMBER() {
        return CHECK_NUMBER;
    }

    public void setCHECK_NUMBER(Integer CHECK_NUMBER) {
        this.CHECK_NUMBER = CHECK_NUMBER;
    }

    public String getEDITED_BY() {
        return EDITED_BY;
    }

    public void setEDITED_BY(String EDITED_BY) {
        this.EDITED_BY = EDITED_BY;
    }

    public Date getEDIT_DATE() {
        return EDIT_DATE;
    }

    public void setEDIT_DATE(Date EDIT_DATE) {
        this.EDIT_DATE = EDIT_DATE;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public Integer getCREATOR_ID() {
        return CREATOR_ID;
    }

    public void setCREATOR_ID(Integer CREATOR_ID) {
        this.CREATOR_ID = CREATOR_ID;
    }

    public Date getCREATED_DATE() {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(Date CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    public Integer getMALE_ID() {
        return MALE_ID;
    }

    public void setMALE_ID(Integer MALE_ID) {
        this.MALE_ID = MALE_ID;
    }

    public Float getFEMALE_ID() {
        return FEMALE_ID;
    }

    public void setFEMALE_ID(Float FEMALE_ID) {
        this.FEMALE_ID = FEMALE_ID;
    }

    public Integer getOFFSPRING_COLONY_ID() {
        return OFFSPRING_COLONY_ID;
    }

    public void setOFFSPRING_COLONY_ID(Integer OFFSPRING_COLONY_ID) {
        this.OFFSPRING_COLONY_ID = OFFSPRING_COLONY_ID;
    }

    public Boolean getPSEUDO_BREEDING() {
        return PSEUDO_BREEDING;
    }

    public void setPSEUDO_BREEDING(Boolean PSEUDO_BREEDING) {
        this.PSEUDO_BREEDING = PSEUDO_BREEDING;
    }

    public Integer getEMBRYO_TRANSFER_ID() {
        return EMBRYO_TRANSFER_ID;
    }

    public void setEMBRYO_TRANSFER_ID(Integer EMBRYO_TRANSFER_ID) {
        this.EMBRYO_TRANSFER_ID = EMBRYO_TRANSFER_ID;
    }

    public String getNAME_PREFIX() {
        return NAME_PREFIX;
    }

    public void setNAME_PREFIX(String NAME_PREFIX) {
        this.NAME_PREFIX = NAME_PREFIX;
    }

    public Integer getBREEDING_NUMBER() {
        return BREEDING_NUMBER;
    }

    public void setBREEDING_NUMBER(Integer BREEDING_NUMBER) {
        this.BREEDING_NUMBER = BREEDING_NUMBER;
    }

    public String getOFFSPRING_GENERATION() {
        return OFFSPRING_GENERATION;
    }

    public void setOFFSPRING_GENERATION(String OFFSPRING_GENERATION) {
        this.OFFSPRING_GENERATION = OFFSPRING_GENERATION;
    }

    public Boolean getTIMED_MATING() {
        return TIMED_MATING;
    }

    public void setTIMED_MATING(Boolean TIMED_MATING) {
        this.TIMED_MATING = TIMED_MATING;
    }

    public Float getTIMED_MATING_EMBRYO_AGE() {
        return TIMED_MATING_EMBRYO_AGE;
    }

    public void setTIMED_MATING_EMBRYO_AGE(Float TIMED_MATING_EMBRYO_AGE) {
        this.TIMED_MATING_EMBRYO_AGE = TIMED_MATING_EMBRYO_AGE;
    }

    public Integer getBREEDING_CATEGORY_DICT_ID() {
        return BREEDING_CATEGORY_DICT_ID;
    }

    public void setBREEDING_CATEGORY_DICT_ID(Integer BREEDING_CATEGORY_DICT_ID) {
        this.BREEDING_CATEGORY_DICT_ID = BREEDING_CATEGORY_DICT_ID;
    }

    public Integer getPROTOCOL_ID() {
        return PROTOCOL_ID;
    }

    public void setPROTOCOL_ID(Integer PROTOCOL_ID) {
        this.PROTOCOL_ID = PROTOCOL_ID;
    }

    public Integer getPERSONAL_LICENCE_ID() {
        return PERSONAL_LICENCE_ID;
    }

    public void setPERSONAL_LICENCE_ID(Integer PERSONAL_LICENCE_ID) {
        this.PERSONAL_LICENCE_ID = PERSONAL_LICENCE_ID;
    }

    public Integer getPROCEDURE_DICT_ID() {
        return PROCEDURE_DICT_ID;
    }

    public void setPROCEDURE_DICT_ID(Integer PROCEDURE_DICT_ID) {
        this.PROCEDURE_DICT_ID = PROCEDURE_DICT_ID;
    }

    public Integer getFOSTER_PARENT_ID() {
        return FOSTER_PARENT_ID;
    }

    public void setFOSTER_PARENT_ID(Integer FOSTER_PARENT_ID) {
        this.FOSTER_PARENT_ID = FOSTER_PARENT_ID;
    }

    public Integer getOPERATOR_PIL_ID() {
        return OPERATOR_PIL_ID;
    }

    public void setOPERATOR_PIL_ID(Integer OPERATOR_PIL_ID) {
        this.OPERATOR_PIL_ID = OPERATOR_PIL_ID;
    }
}
