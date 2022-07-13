package de.example.hibernateMappedSuperclassexample;

import de.example.hibernateMappedSuperclassexample.model.Consumer;
import de.example.hibernateMappedSuperclassexample.model.Producer;
import de.example.hibernateMappedSuperclassexample.repository.IConsumerRepository;
import de.example.hibernateMappedSuperclassexample.repository.IProducerRepository;
import de.example.hibernateMappedSuperclassexample.repository.IUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HibernateMappedSuperclassExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(HibernateMappedSuperclassExampleApplication.class, args);

		// theese are  two way to access jpa
		IProducerRepository producerRepo = configurableApplicationContext.getBean(IProducerRepository.class);
		IUserRepository<Consumer> consumerRepo = configurableApplicationContext.getBean(IConsumerRepository.class);

		LocalDate currentDate = LocalDate.now();
		Producer focusedProducer = new Producer(currentDate, "some GmbH", 5, "Collaborative robot");
		Consumer focusedConsumer = new Consumer(currentDate, "philanthropy", 300000, "TRex");

		producerRepo.save(focusedProducer);
		consumerRepo.save(focusedConsumer);

		producerRepo.save(new Producer(currentDate, "long Ltd", 10, "MechaGodzilla"));
		producerRepo.save(new Producer(currentDate, "new AG", 1, "Vegetables"));
		producerRepo.save(new Producer(currentDate, "middle PT", 5, "Milk"));

		List<Producer> foundedProducer = producerRepo.findByExperience(5);
		System.out.println(foundedProducer.size());

		Consumer foundedConsumer = ((IConsumerRepository)consumerRepo).findByProductWishName("TRex");
		System.out.println(foundedConsumer.getBalance());



	}

}
