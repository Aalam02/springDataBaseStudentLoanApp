package org.jspider.springDataBaseStudent.Service;

import org.jspider.springDataBaseStudent.Domian.GoldRate;
import org.jspider.springDataBaseStudent.Repositery.GoldRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoldRateService {
    @Autowired
    private GoldRateRepository repository;
    public List<GoldRate> getAllGoldRate() {
        List<GoldRate>goldRateList=repository.findAll();
        return goldRateList;
    }

    public void updateGoldRate(GoldRate goldRate) {
        repository.save(goldRate);
    }

    public void addNewGoldRate(GoldRate goldRate) {
        repository.save(goldRate);
    }


    public void deleteId(int id) {
        repository.deleteById(id);
    }
}
