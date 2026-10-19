package org.example.mcms_webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class MTS_MouseLogic {
    @Autowired
    private MTS_MouseRepository mts_MouseRepository;

    public void updateOrInsertUsingRepository(MTS_MOUSE mts_MOUSE) {
        mts_MouseRepository.updateOrinsert(mts_MOUSE);
    }

    public void AddDatabaseEntry(String mouseName) {
        Random random = new Random();

        MTS_MOUSE mts_MOUSE = new MTS_MOUSE();
        mts_MOUSE.setNAME(mouseName);
        mts_MOUSE.setEDIT_DATE(new Date());
        mts_MOUSE.setCREATED_DATE(new Date());

        Integer litterID= random.nextInt(6) + 1;
        mts_MOUSE.setLITTER_ID(litterID);

        Integer genderID= random.nextInt(2) + 1;
        mts_MOUSE.setGENDER_DICT_ID(genderID);

        mts_MouseRepository.save(mts_MOUSE);
    }
}
