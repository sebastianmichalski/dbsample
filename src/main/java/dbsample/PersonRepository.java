package dbsample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by shekerama on 2017-01-23.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Transactional(transactionManager = "transactionManager")
    Optional<Person> findOneByMagicField(String magicField);

}
