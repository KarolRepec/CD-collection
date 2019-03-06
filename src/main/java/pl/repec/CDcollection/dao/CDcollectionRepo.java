package pl.repec.CDcollection.dao;

import org.springframework.data.repository.CrudRepository;
import pl.repec.CDcollection.dao.entity.CD;

public interface CDcollectionRepo extends CrudRepository<CD, Long> {
}
