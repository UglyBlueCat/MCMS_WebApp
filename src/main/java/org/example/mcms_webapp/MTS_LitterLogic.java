package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MTS_LitterLogic {
    @Autowired
    private static MTS_LitterRepository mts_LitterRepository;

    public void updateOrInsertUsingRepository(MTS_LITTER mts_LITTER) {
        mts_LitterRepository.updateOrinsert(mts_LITTER);
    }

    public static void AddDatabaseEntry(String mouseName) {
        MTS_LITTER mts_LITTER = new MTS_LITTER();
//        mts_LITTER.setMouseName(mouseName);
        mts_LitterRepository.save(mts_LITTER);
    }
}
