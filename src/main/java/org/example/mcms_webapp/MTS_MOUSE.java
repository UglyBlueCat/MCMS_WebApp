package org.example.mcms_webapp;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class MTS_MOUSE {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer ID; // INTEGER Primary Key
    private Integer LITTER_ID; // INTEGER Foreign Key to MTS_LITTER
    @Column(unique=true)
    private String NAME; // VARCHAR2 (64 Char) Animal name
    private Date EDIT_DATE; // DATE Date record was last saved
    @Column(unique=true)
    private String RFID_TAG; // VARCHAR2 (256 Char) Alternate ID for mice containing microchip identifier
    private Float COAT_COLOUR_DICT_ID; // NUMBER Dictionary code for mouse coat colour
    private Float EYE_COLOUR_DICT_ID; // NUMBER Dictionary code for mouse eye colour
    private Float EARMARK_DICT_ID; // NUMBER Dictionary code for identifying tag on mouse's ear
    private Date BIRTH_DATE; // DATE Animal date of birth
    private Date DEATH_DATE; // DATE Animal date of death
    private Float CAUSE_OF_DEATH_DICT_ID; // NUMBER Dictionary code for reason of death
    private String EDITED_BY; // VARCHAR2 (128 Char) Username of last person to edit the record
    private Date WEAN_DATE; // DATE Date animal was separated from its mother
    private Float CAGE_ID; // NUMBER Foreign Key to MTS_CAGE
    private Float CURRENT_OWNER_ID; // NUMBER NOT USED
    private Float CHECK_NUMBER; // NUMBER Used for optimistic locking in web application
    private Integer GENDER_DICT_ID; // NUMBER Dictionary code for mouse gender 1=female, 2=male
    private Integer CREATOR_ID; // INTEGER Foreign Key to personnel table for creator of the record
    private Date CREATED_DATE; // DATE Date record was created
    private String BARCODE; // VARCHAR2 (128 Char) Machine generated unique identifier for animal
    private Boolean IS_NON_BREEDER; // NUMBER (1) NOT USED
    private Boolean IS_SENTINEL; // NUMBER (1) Is the mouse used for health screening?
    private String GENERATION; // VARCHAR2 (128 Char) The generation of the mouse from original breeding
    private Integer COLONY_INFO_ID; // INTEGER Foreign key to the colony the mouse belongs to
    private Date ARRIVAL_DATE; // DATE NOT USED
    private Boolean IS_STERILE; // NUMBER (1) Is the animal vasectomised? 1=sterile, 0=non-sterile
    private Date LATEST_PLUG_DATE; // DATE NOT USED
    private Boolean IS_POOLED; // NUMBER (1) Is the mouse part of an anonymous pool of mice?
    private Boolean IS_STUD; // NUMBER (1) Is the mouse male and used for breeding?
    private Boolean IS_PROVEN_STUD; // NUMBER (1) Is the mouse male and fertile?
    private Date CHECKSUM_DATE; // DATE Internal use
    private Float CHECKSUM; // NUMBER Internal use
    private Integer CULLED_BY_ID; // INTEGER Foreign Key to personnel table for user who culled the animal
    private Integer SEVERITY_ID; // INTEGER Dictionary code for overall life experience score
    private Integer SPECIES_ID; // INTEGER Dictionary code for species.
    private Integer PRIMARY_CULL_METHOD_ID; // INTEGER Dictionary code for method used to cull animal
    private Integer SECONDARY_CULL_METHOD_ID; // INTEGER Dictionary code for method use to confirm cull of animal

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getLITTER_ID() {
        return LITTER_ID;
    }

    public void setLITTER_ID(Integer LITTER_ID) {
        this.LITTER_ID = LITTER_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Date getEDIT_DATE() {
        return EDIT_DATE;
    }

    public void setEDIT_DATE(Date EDIT_DATE) {
        this.EDIT_DATE = EDIT_DATE;
    }

    public String getRFID_TAG() {
        return RFID_TAG;
    }

    public void setRFID_TAG(String RFID_TAG) {
        this.RFID_TAG = RFID_TAG;
    }

    public Float getCOAT_COLOUR_DICT_ID() {
        return COAT_COLOUR_DICT_ID;
    }

    public void setCOAT_COLOUR_DICT_ID(Float COAT_COLOUR_DICT_ID) {
        this.COAT_COLOUR_DICT_ID = COAT_COLOUR_DICT_ID;
    }

    public Float getEYE_COLOUR_DICT_ID() {
        return EYE_COLOUR_DICT_ID;
    }

    public void setEYE_COLOUR_DICT_ID(Float EYE_COLOUR_DICT_ID) {
        this.EYE_COLOUR_DICT_ID = EYE_COLOUR_DICT_ID;
    }

    public Float getEARMARK_DICT_ID() {
        return EARMARK_DICT_ID;
    }

    public void setEARMARK_DICT_ID(Float EARMARK_DICT_ID) {
        this.EARMARK_DICT_ID = EARMARK_DICT_ID;
    }

    public Date getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public void setBIRTH_DATE(Date BIRTH_DATE) {
        this.BIRTH_DATE = BIRTH_DATE;
    }

    public Date getDEATH_DATE() {
        return DEATH_DATE;
    }

    public void setDEATH_DATE(Date DEATH_DATE) {
        this.DEATH_DATE = DEATH_DATE;
    }

    public Float getCAUSE_OF_DEATH_DICT_ID() {
        return CAUSE_OF_DEATH_DICT_ID;
    }

    public void setCAUSE_OF_DEATH_DICT_ID(Float CAUSE_OF_DEATH_DICT_ID) {
        this.CAUSE_OF_DEATH_DICT_ID = CAUSE_OF_DEATH_DICT_ID;
    }

    public String getEDITED_BY() {
        return EDITED_BY;
    }

    public void setEDITED_BY(String EDITED_BY) {
        this.EDITED_BY = EDITED_BY;
    }

    public Date getWEAN_DATE() {
        return WEAN_DATE;
    }

    public void setWEAN_DATE(Date WEAN_DATE) {
        this.WEAN_DATE = WEAN_DATE;
    }

    public Float getCAGE_ID() {
        return CAGE_ID;
    }

    public void setCAGE_ID(Float CAGE_ID) {
        this.CAGE_ID = CAGE_ID;
    }

    public Float getCURRENT_OWNER_ID() {
        return CURRENT_OWNER_ID;
    }

    public void setCURRENT_OWNER_ID(Float CURRENT_OWNER_ID) {
        this.CURRENT_OWNER_ID = CURRENT_OWNER_ID;
    }

    public Float getCHECK_NUMBER() {
        return CHECK_NUMBER;
    }

    public void setCHECK_NUMBER(Float CHECK_NUMBER) {
        this.CHECK_NUMBER = CHECK_NUMBER;
    }

    public Integer getGENDER_DICT_ID() {
        return GENDER_DICT_ID;
    }

    public void setGENDER_DICT_ID(Integer GENDER_DICT_ID) {
        this.GENDER_DICT_ID = GENDER_DICT_ID;
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

    public String getBARCODE() {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE) {
        this.BARCODE = BARCODE;
    }

    public Boolean getIS_NON_BREEDER() {
        return IS_NON_BREEDER;
    }

    public void setIS_NON_BREEDER(Boolean IS_NON_BREEDER) {
        this.IS_NON_BREEDER = IS_NON_BREEDER;
    }

    public Boolean getIS_SENTINEL() {
        return IS_SENTINEL;
    }

    public void setIS_SENTINEL(Boolean IS_SENTINEL) {
        this.IS_SENTINEL = IS_SENTINEL;
    }

    public String getGENERATION() {
        return GENERATION;
    }

    public void setGENERATION(String GENERATION) {
        this.GENERATION = GENERATION;
    }

    public Integer getCOLONY_INFO_ID() {
        return COLONY_INFO_ID;
    }

    public void setCOLONY_INFO_ID(Integer COLONY_INFO_ID) {
        this.COLONY_INFO_ID = COLONY_INFO_ID;
    }

    public Date getARRIVAL_DATE() {
        return ARRIVAL_DATE;
    }

    public void setARRIVAL_DATE(Date ARRIVAL_DATE) {
        this.ARRIVAL_DATE = ARRIVAL_DATE;
    }

    public Boolean getIS_STERILE() {
        return IS_STERILE;
    }

    public void setIS_STERILE(Boolean IS_STERILE) {
        this.IS_STERILE = IS_STERILE;
    }

    public Date getLATEST_PLUG_DATE() {
        return LATEST_PLUG_DATE;
    }

    public void setLATEST_PLUG_DATE(Date LATEST_PLUG_DATE) {
        this.LATEST_PLUG_DATE = LATEST_PLUG_DATE;
    }

    public Boolean getIS_POOLED() {
        return IS_POOLED;
    }

    public void setIS_POOLED(Boolean IS_POOLED) {
        this.IS_POOLED = IS_POOLED;
    }

    public Boolean getIS_STUD() {
        return IS_STUD;
    }

    public void setIS_STUD(Boolean IS_STUD) {
        this.IS_STUD = IS_STUD;
    }

    public Boolean getIS_PROVEN_STUD() {
        return IS_PROVEN_STUD;
    }

    public void setIS_PROVEN_STUD(Boolean IS_PROVEN_STUD) {
        this.IS_PROVEN_STUD = IS_PROVEN_STUD;
    }

    public Date getCHECKSUM_DATE() {
        return CHECKSUM_DATE;
    }

    public void setCHECKSUM_DATE(Date CHECKSUM_DATE) {
        this.CHECKSUM_DATE = CHECKSUM_DATE;
    }

    public Float getCHECKSUM() {
        return CHECKSUM;
    }

    public void setCHECKSUM(Float CHECKSUM) {
        this.CHECKSUM = CHECKSUM;
    }

    public Integer getCULLED_BY_ID() {
        return CULLED_BY_ID;
    }

    public void setCULLED_BY_ID(Integer CULLED_BY_ID) {
        this.CULLED_BY_ID = CULLED_BY_ID;
    }

    public Integer getSEVERITY_ID() {
        return SEVERITY_ID;
    }

    public void setSEVERITY_ID(Integer SEVERITY_ID) {
        this.SEVERITY_ID = SEVERITY_ID;
    }

    public Integer getSPECIES_ID() {
        return SPECIES_ID;
    }

    public void setSPECIES_ID(Integer SPECIES_ID) {
        this.SPECIES_ID = SPECIES_ID;
    }

    public Integer getPRIMARY_CULL_METHOD_ID() {
        return PRIMARY_CULL_METHOD_ID;
    }

    public void setPRIMARY_CULL_METHOD_ID(Integer PRIMARY_CULL_METHOD_ID) {
        this.PRIMARY_CULL_METHOD_ID = PRIMARY_CULL_METHOD_ID;
    }

    public Integer getSECONDARY_CULL_METHOD_ID() {
        return SECONDARY_CULL_METHOD_ID;
    }

    public void setSECONDARY_CULL_METHOD_ID(Integer SECONDARY_CULL_METHOD_ID) {
        this.SECONDARY_CULL_METHOD_ID = SECONDARY_CULL_METHOD_ID;
    }
}
