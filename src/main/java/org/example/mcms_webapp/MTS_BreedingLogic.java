package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MTS_BreedingLogic {
    @Autowired
    private MTS_BreedingRepository mts_BreedingRepository;

    public void updateOrInsertUsingRepository(MTS_BREEDING mts_BREEDING) {
        mts_BreedingRepository.updateOrinsert(mts_BREEDING);
    }

    public void AddDatabaseEntry(Integer BREEDING_NUMBER) {
        MTS_BREEDING mts_BREEDING = new MTS_BREEDING();
        mts_BREEDING.setBREEDING_NUMBER(BREEDING_NUMBER);
        mts_BREEDING.setCREATED_DATE(new Date());
        mts_BREEDING.setEDIT_DATE(new Date());
        mts_BreedingRepository.save(mts_BREEDING);
    }
}
