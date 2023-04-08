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
public class Passenger {

//Passenger = TicketId, TrainId ,Date, Age, Gender
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    private int trainId;
    private String date;
    private String gender;
    private int age;


}
