package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class MTS_LitterLogic {
    @Autowired
    private MTS_LitterRepository mts_LitterRepository;


    public void updateOrInsertUsingRepository(MTS_LITTER mts_LITTER) {
        mts_LitterRepository.updateOrinsert(mts_LITTER);
    }

    public void AddDatabaseEntry(Integer LITTER_NUMBER) {
        Random random = new Random();

        MTS_LITTER mts_LITTER = new MTS_LITTER();
        mts_LITTER.setLITTER_NUMBER(LITTER_NUMBER);
        mts_LITTER.setEDIT_DATE(new Date());
        mts_LITTER.setCREATED_DATE(new Date());

        Integer breedingID= random.nextInt(4) + 1;
        mts_LITTER.setBREEDING_ID(breedingID);

        Integer numberBorn = random.nextInt(9) + 1;
        mts_LITTER.setNUMBER_BORN(numberBorn);

        mts_LitterRepository.save(mts_LITTER);
    }
}
