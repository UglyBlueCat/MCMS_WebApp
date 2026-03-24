package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MTS_BreeedingLogic {
    @Autowired
    private static MTS_BreedingRepository mts_BreedingRepository;

    public void updateOrInsertUsingRepository(MTS_BREEDING mts_BREEDING) {
        mts_BreedingRepository.updateOrinsert(mts_BREEDING);
    }

    public static void AddDatabaseEntry(String mouseName) {
        MTS_BREEDING mts_BREEDING = new MTS_BREEDING();
//        mts_BREEDING.setMouseName(mouseName);
        mts_BreedingRepository.save(mts_BREEDING);
    }
}
