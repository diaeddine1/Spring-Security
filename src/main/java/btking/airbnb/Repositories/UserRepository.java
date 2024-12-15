package btking.airbnb.Repositories;

import btking.airbnb.Models.User;
import org.springframework.data.mongodb.SpringDataMongoDB;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);

}