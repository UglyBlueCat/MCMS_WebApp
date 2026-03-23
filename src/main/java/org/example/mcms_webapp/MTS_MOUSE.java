package org.example.mcms_webapp;

import java.sql.Date;

public class MTS_MOUSE {

    private Integer ID; // INTEGER Primary Key
    private Integer LITTER_ID; // INTEGER Foreign Key to MTS_LITTER
    private String NAME; // VARCHAR2 (64 Char) Animal name
    private Date EDIT_DATE; // DATE Date record was last saved
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
    private Float GENDER_DICT_ID; // NUMBER Dictionary code for mouse gender 1=female, 2=male
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

}
