package TRAIN.SYSTEM.TRAIN.SYSTEM.Service;

import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.FoodOrder;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Passenger;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Repository.FoodOrderRepository;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Repository.PassengerRepository;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderService {
    @Autowired
    TrainRepository trainRepository;
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    FoodOrderRepository foodOrderRepository;

    //add foodOrder
    public String addFoodOrder(FoodOrder foodOrder){
        foodOrderRepository.save(foodOrder);
        return "Added foodOrder";
    }
    //3.GET API - Get the total price of the orders placed by Customers on Date D in TrainId T.

    public int totalPriceOfOrders(int trainId, String date){
        List<FoodOrder> foodOrderList= foodOrderRepository.findAll();
        int totalPrice = 0;
        for(FoodOrder foodOrder: foodOrderList){
            Passenger passenger=passengerRepository.findById(foodOrder.getTicketId()).get();
            if(foodOrder.getTrainId()==trainId && passenger.getDate().equals(date)){
                totalPrice += foodOrder.getPrice();
            }
        }
        return totalPrice;
    }
}
