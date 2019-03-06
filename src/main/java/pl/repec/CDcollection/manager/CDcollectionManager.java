package pl.repec.CDcollection.manager;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.repec.CDcollection.dao.CDcollectionRepo;
import pl.repec.CDcollection.dao.entity.CD;

import java.util.Optional;

@Service
public class CDcollectionManager {
    private CDcollectionRepo cdCollectionRepo;

    public CDcollectionManager(CDcollectionRepo cdCollectionRepo) {
        this.cdCollectionRepo = cdCollectionRepo;
    }

    public Iterable<CD> findAll() {
        return cdCollectionRepo.findAll();
    }

    public Optional<CD> findById(Long id) {
        return cdCollectionRepo.findById(id);
    }

    public CD save(CD cd) {
        return cdCollectionRepo.save(cd);
    }

    public void delete(Long id) {
        cdCollectionRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb() {
        save(new CD(1, "Riverside", "Second Life Syndrom", "Lewy słupek, poziom 4"));
        save(new CD(2, "Pearl Jam", "Binatural", "prawy słupek, poziom 3"));
        save(new CD(3, "Kazik", "Porozumienie ponad podziałami", "komoda"));
    }
}
