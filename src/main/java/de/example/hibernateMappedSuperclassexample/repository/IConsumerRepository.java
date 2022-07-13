package de.example.hibernateMappedSuperclassexample.repository;

import de.example.hibernateMappedSuperclassexample.model.Consumer;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsumerRepository extends IUserRepository<Consumer> {

    public Consumer findByProductWishName(String productWishName);
}
