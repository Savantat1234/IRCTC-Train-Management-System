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
public class Train {
    //Train = TrainNo, Source, Destination
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainId;
    private String sourcr;
    private String destnation;
}
