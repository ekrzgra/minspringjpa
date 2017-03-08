package minspringjpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "dailyStatistics")
public class DailyStatistics {

	private long id;
	private Date snapshotTime;
	private long views;
	private long comments;
	private Video releatedVideo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stats_id", unique = true)
	public long getId() {
		return id;
	}

	@Column(name = "snapshot_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getSnapshotTime() {
		return snapshotTime;
	}

	@Column(name = "views", nullable = false)
	public long getViews() {
		return views;
	}

	@Column(name = "comments", nullable = false)
	public long getComments() {
		return comments;
	}

	@ManyToOne
	public Video getReleatedVideo() {
		return releatedVideo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSnapshotTime(Date snapshotTime) {
		this.snapshotTime = snapshotTime;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public void setComments(long comments) {
		this.comments = comments;
	}

	public void setReleatedVideo(Video releatedVideo) {
		this.releatedVideo = releatedVideo;
	}

}
