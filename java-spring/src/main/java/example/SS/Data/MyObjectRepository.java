package example.SS.Data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyObjectRepository extends MongoRepository<MyObject,String> {
    public MyObject findByMyString(String myString);
}
