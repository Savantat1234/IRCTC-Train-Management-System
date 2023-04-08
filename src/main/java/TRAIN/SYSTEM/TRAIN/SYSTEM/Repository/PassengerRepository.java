package TRAIN.SYSTEM.TRAIN.SYSTEM.Repository;

import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
