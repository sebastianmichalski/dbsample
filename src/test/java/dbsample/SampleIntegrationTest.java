package dbsample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Created by shekerama on 2017-01-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class SampleIntegrationTest {

    @Autowired
    private PersonRepository personRepository;

    @Before
    public void setUp() {
        personRepository.deleteAll();

        Person p = new Person();
        p.setMagicField("test");

        personRepository.save(p);
    }

    @Test
    public void testOnSuccess() {
        final Optional<Person> p = personRepository.findOneByMagicField("test");
        assertTrue(p.isPresent());
    }


}
