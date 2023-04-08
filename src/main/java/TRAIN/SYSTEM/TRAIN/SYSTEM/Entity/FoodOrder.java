package TRAIN.SYSTEM.TRAIN.SYSTEM.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodOrder {
    //FoodOrder = TicketId, TrainId, Price
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodOrderId;
    private int ticketId;
    private int trainId;
    private int price;
}
