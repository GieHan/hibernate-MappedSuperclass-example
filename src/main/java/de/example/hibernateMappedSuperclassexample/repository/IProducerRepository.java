package de.example.hibernateMappedSuperclassexample.repository;

import de.example.hibernateMappedSuperclassexample.model.Producer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProducerRepository extends IUserRepository<Producer> {

    public List<Producer> findByExperience(int experience);
}
