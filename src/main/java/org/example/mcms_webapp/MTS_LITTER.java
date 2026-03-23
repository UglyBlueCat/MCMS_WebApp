package org.example.mcms_webapp;

import java.sql.Date;

public class MTS_LITTER {

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

}
