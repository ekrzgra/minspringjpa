package minspringjpa.repositories;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import minspringjpa.config.AppConfig;
import minspringjpa.entities.Video;

@ContextConfiguration(classes = AppConfig.class)
@RunWith(SpringRunner.class)
@Commit
public class VideoRepositoryTest {

	@Autowired
	private VideoRepository repository;

	@Test
	public void saveTest() {
		Video v = new Video();
		v.setName("v1");
		v.setCreatedOn(new Date());
		v.setUserHasAccess(false);
		repository.addVideo(v);
	}
}
