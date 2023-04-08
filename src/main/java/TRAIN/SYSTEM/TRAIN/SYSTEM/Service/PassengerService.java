package TRAIN.SYSTEM.TRAIN.SYSTEM.Service;

import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Passenger;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Train;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Repository.PassengerRepository;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    TrainRepository trainRepository;

    //add passenger
    public String addPassenger(Passenger passenger){
        passengerRepository.save(passenger);
        return "passenger added";
    }
    //1.GET API - Find the Number of passengers travelling from City X and City Y on Date D
    public int getPassengercount(String x, String y, String  date){
        List<Passenger> passengerList = passengerRepository.findAll();
        int count=0;
        for(Passenger passenger: passengerList){
            Train train =trainRepository.findById(passenger.getTrainId()).get();
            if(train.getSourcr().equals(x) && train.getDestnation().equals(y) && passenger.getDate().equals(date)){
                count++;
            }

        }
        return count;
    }
    public int getFemalePassenger(int x, int y, String destn){
      List<Passenger> passengerList = passengerRepository.findAll();
      int count = 0;
      for(Passenger passenger: passengerList){
          Train train = trainRepository.findById(passenger.getTrainId()).get();
          if(passenger.getGender().equals("female")){
              if(passenger.getAge() >= x && passenger.getAge() <= y){
                  if(train.getDestnation().equals(destn)){
                      count++;
                  }

              }
          }
      }
      return count;
    }


}
