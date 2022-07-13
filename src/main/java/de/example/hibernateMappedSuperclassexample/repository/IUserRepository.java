package de.example.hibernateMappedSuperclassexample.repository;

import de.example.hibernateMappedSuperclassexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/*
    - @NoRepositoryBean means not allowed creating bean
    - abstract with <T extends User>, so Producer and Consumer can extend using their concrete class
    - Example: IUserRepository<Producer>
 */
@NoRepositoryBean
public interface IUserRepository<T extends User> extends JpaRepository<T, Integer> {
}
