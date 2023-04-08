package TRAIN.SYSTEM.TRAIN.SYSTEM;

import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.FoodOrder;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Passenger;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Train;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Service.FoodOrderService;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Service.PassengerService;
import TRAIN.SYSTEM.TRAIN.SYSTEM.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    TrainService trainService;
    @Autowired
    PassengerService passengerService;
    @Autowired
    FoodOrderService foodOrderService;

    ////POST API - Add a Passenger with ticketId , trainId ,Date,age,gender
    @PostMapping("addtrain")
    public String addTrain(@RequestBody Train train) {
        return trainService.addTrain(train);
    }

    //POST API - Add a Passenger with ticketId , trainId ,Date,age,gender
@PostMapping("addpassenger")
    public String addPassenger(@RequestBody Passenger passenger){
        return passengerService.addPassenger(passenger);
    }
    @GetMapping("getpassengercount")
    public int getPassengercount(@RequestParam String x , @RequestParam String y , @RequestParam String date){
        return passengerService.getPassengercount(x,y,date);
    }
    @GetMapping("getFemalePassenger")
    public int getFemalePassenger(@RequestParam int x, @RequestParam int y,@RequestParam String destn){
        return passengerService.getFemalePassenger(x,y,destn);
    }
    @PostMapping("add_food_orde")
    public String addFoodOrder(FoodOrder foodOrder){
        return foodOrderService.addFoodOrder(foodOrder);
    }

    //3.GET API - Get the total price of the orders placed by Customers on Date D in TrainId T.
    @GetMapping("priceOfOrders")
    public int totalPriceOfOrders(int trainId, String date){
        return foodOrderService.totalPriceOfOrders(trainId,date);
    }


}



