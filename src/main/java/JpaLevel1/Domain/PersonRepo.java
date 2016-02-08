package JpaLevel1.Domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person,Integer>{
    List<Person> findByName(String imie);
}
