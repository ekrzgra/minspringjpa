package minspringjpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import minspringjpa.entities.Video;

@Repository
@Transactional
public class VideoRepository {

	@PersistenceUnit
	private EntityManagerFactory emf;

	public void addVideo(Video video) {
		EntityManager entityManager = emf.createEntityManager();
		entityManager.persist(video);
	}
}
