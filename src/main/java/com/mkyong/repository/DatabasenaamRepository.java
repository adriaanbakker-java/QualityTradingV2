package com.mkyong.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabasenaamRepository extends CrudRepository<Databasenaam, Long> {

    @Query(value =
            "select naam from databasenaam where id = 1",
            nativeQuery = true)
    String getNaam();
}
