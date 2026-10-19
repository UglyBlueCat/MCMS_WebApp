package org.example.mcms_webapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class MTS_LITTER {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ID; // INTEGER Primary Key
    private Integer BREEDING_ID; // INTEGER Foreign Key to MTS_BREEDING
    private Date BIRTH_DATE; // DATE Date of birth of mice
    private Float CHECK_NUMBER; // NUMBER Used for optimistic locking in web application
    private String EDITED_BY; // VARCHAR2 (128 Char) Username of last person to edit the record
    private Date EDIT_DATE; // DATE Date record was last saved
    private Integer CREATOR_ID; // INTEGER Foreign Key to personnel table for creator of the record
    private Date CREATED_DATE; // DATE Date record was created
    private Date PLUG_CHECK_DATE; // DATE Date female was checked for possible pregnancy
    private Integer NUMBER_BORN; // INTEGER Number of mice born in this litter
    private String COMMENTS; // VARCHAR2 (4000 Char) Comments relating to whole litter added by user
    private Integer NUMBER_HARVESTED; // INTEGER Number of embryos in this litter
    private Date DUE_DATE; // DATE Expected date of birth
    private Integer LITTER_NUMBER; // INTEGER Sequential number of litter for the given breeding
    private String NAME_PREFIX; // VARCHAR2 (10 Char) Prefix (containing breeding name)
    private Boolean NOT_PREGNANT; // NUMBER (1) Was this a false pregnancy?
    private Integer WEANED_BY_ID; // INTEGER Foreign key to personnel table for technician who weaned the litter
    private Boolean TOTAL_LITTER_LOSS; // NUMBER (1) Did all pups for this litter die?

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getBREEDING_ID() {
        return BREEDING_ID;
    }

    public void setBREEDING_ID(Integer BREEDING_ID) {
        this.BREEDING_ID = BREEDING_ID;
    }

    public Date getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public void setBIRTH_DATE(Date BIRTH_DATE) {
        this.BIRTH_DATE = BIRTH_DATE;
    }

    public Float getCHECK_NUMBER() {
        return CHECK_NUMBER;
    }

    public void setCHECK_NUMBER(Float CHECK_NUMBER) {
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

    public Date getPLUG_CHECK_DATE() {
        return PLUG_CHECK_DATE;
    }

    public void setPLUG_CHECK_DATE(Date PLUG_CHECK_DATE) {
        this.PLUG_CHECK_DATE = PLUG_CHECK_DATE;
    }

    public Integer getNUMBER_BORN() {
        return NUMBER_BORN;
    }

    public void setNUMBER_BORN(Integer NUMBER_BORN) {
        this.NUMBER_BORN = NUMBER_BORN;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public Integer getNUMBER_HARVESTED() {
        return NUMBER_HARVESTED;
    }

    public void setNUMBER_HARVESTED(Integer NUMBER_HARVESTED) {
        this.NUMBER_HARVESTED = NUMBER_HARVESTED;
    }

    public Date getDUE_DATE() {
        return DUE_DATE;
    }

    public void setDUE_DATE(Date DUE_DATE) {
        this.DUE_DATE = DUE_DATE;
    }

    public Integer getLITTER_NUMBER() {
        return LITTER_NUMBER;
    }

    public void setLITTER_NUMBER(Integer LITTER_NUMBER) {
        this.LITTER_NUMBER = LITTER_NUMBER;
    }

    public String getNAME_PREFIX() {
        return NAME_PREFIX;
    }

    public void setNAME_PREFIX(String NAME_PREFIX) {
        this.NAME_PREFIX = NAME_PREFIX;
    }

    public Boolean getNOT_PREGNANT() {
        return NOT_PREGNANT;
    }

    public void setNOT_PREGNANT(Boolean NOT_PREGNANT) {
        this.NOT_PREGNANT = NOT_PREGNANT;
    }

    public Integer getWEANED_BY_ID() {
        return WEANED_BY_ID;
    }

    public void setWEANED_BY_ID(Integer WEANED_BY_ID) {
        this.WEANED_BY_ID = WEANED_BY_ID;
    }

    public Boolean getTOTAL_LITTER_LOSS() {
        return TOTAL_LITTER_LOSS;
    }

    public void setTOTAL_LITTER_LOSS(Boolean TOTAL_LITTER_LOSS) {
        this.TOTAL_LITTER_LOSS = TOTAL_LITTER_LOSS;
    }
}
