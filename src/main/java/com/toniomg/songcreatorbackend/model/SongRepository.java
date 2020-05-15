package com.toniomg.songcreatorbackend.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface SongRepository extends CrudRepository<Song, Long> {

}
