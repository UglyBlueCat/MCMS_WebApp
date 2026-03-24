package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;

public class MTS_MouseLogic {
    @Autowired
    private static MTS_MouseRepository mts_MouseRepository;

    public void updateOrInsertUsingRepository(MTS_MOUSE mts_MOUSE) {
        mts_MouseRepository.updateOrinsert(mts_MOUSE);
    }

    public static void AddDatabaseEntry(String mouseName) {
        MTS_MOUSE mts_MOUSE = new MTS_MOUSE();
//        mts_MOUSE.setMouseName(mouseName);
        mts_MouseRepository.save(mts_MOUSE);
    }
}
