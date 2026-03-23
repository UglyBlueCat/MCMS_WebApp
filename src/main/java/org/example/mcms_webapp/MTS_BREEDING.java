package org.example.mcms_webapp;

import java.sql.Date;

public class MTS_BREEDING {

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

}
