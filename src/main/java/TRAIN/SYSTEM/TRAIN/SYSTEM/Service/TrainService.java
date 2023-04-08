package TRAIN.SYSTEM.TRAIN.SYSTEM.Service;

import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Train;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
    @Autowired
    TrainRepository trainRepository;
    public String addTrain(Train train){
        trainRepository.save(train);
        return "Train Added";
    }
}
