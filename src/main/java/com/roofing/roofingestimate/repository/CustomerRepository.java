package com.roofing.roofingestimate.repository;
import com.roofing.roofingestimate.model.Customer;
//JpaRepository is a Spring Boot tool that does database work for you.
import org.springframework.data.jpa.repository.JpaRepository;



/*public class CustomerRepository {
}*/

// 🧠 This interface gives you CRUD methods for Customer
public interface CustomerRepository  extends JpaRepository <Customer, Long>{
}



