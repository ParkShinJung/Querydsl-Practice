import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.lang.reflect.Member;

@DataJpaTest
@ActiveProfiles("test")
@Import(querydslTest.class)
@Transactional
public class querydslTest {

    @PersistenceContext
    EntityManager em;

    JPAQueryFactory jpaQueryFactory;

}
