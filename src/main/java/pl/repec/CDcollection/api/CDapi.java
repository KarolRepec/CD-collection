package pl.repec.CDcollection.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.repec.CDcollection.dao.entity.CD;
import pl.repec.CDcollection.manager.CDcollectionManager;

import java.util.Optional;


@RestController
@RequestMapping("/api/cd")
public class CDapi {

    private CDcollectionManager cdCollection;

    @Autowired
    public CDapi(CDcollectionManager cdCollection) {
        this.cdCollection = cdCollection;
    }

    public CDapi() {
    }

    @GetMapping("/testAdmin")
    public String testAdmin() {
        return "You're at test admin page";
    }

    @GetMapping("/all")
    public Iterable<CD> getAll() {
        return cdCollection.findAll();
    }

    @GetMapping
    public Optional<CD> getById(Long id) {
        return cdCollection.findById(id);
    }

    @PostMapping
    public CD addCd(CD cd) {
        return cdCollection.save(cd);
    }

    @DeleteMapping
    public void removeCd(Long id) {
        cdCollection.delete(id);
    }
}
