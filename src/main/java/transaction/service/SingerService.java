package transaction.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transaction.model.Singer;

import java.util.stream.Stream;

@Service("jpaSingerService")
@Repository
public class SingerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingerService.class);

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public Stream<Singer> findAll() {
        return em.createNamedQuery(Singer.FIND_ALL, Singer.class)
                .getResultList().stream();
    }


}
