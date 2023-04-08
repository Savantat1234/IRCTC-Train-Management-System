package TRAIN.SYSTEM.TRAIN.SYSTEM.Repository;

import TRAIN.SYSTEM.TRAIN.SYSTEM.Entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Integer> {
}
