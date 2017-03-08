package minspringjpa.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "video")
public class Video {

	private long id;
	private String name;
	private Date createdOn;
	private Set<DailyStatistics> dailyStatistics;
	private Boolean userHasAccess;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true)
	public long getId() {
		return id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	@Column(name = "created_on", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedOn() {
		return createdOn;
	}

	@Transient
	public Boolean isUserHasAccess() {
		return userHasAccess;
	}

	@OneToMany(mappedBy = "releatedVideo", cascade = CascadeType.REMOVE)
	public Set<DailyStatistics> getDailyStatistics() {
		return dailyStatistics;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public void setDailyStatistics(Set<DailyStatistics> dailyStatistics) {
		this.dailyStatistics = dailyStatistics;
	}

	public void setUserHasAccess(Boolean userHasAccess) {
		this.userHasAccess = userHasAccess;
	}

}
