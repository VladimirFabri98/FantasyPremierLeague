package fpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="home_away")
public class HomeAway {
	
	@Id
	private long id;
	private String name;
	@Column(name="home_wins")
	private int homeWins;
	@Column(name="away_wins")
	private int awayWins;
	@Column(name="home_draws")
	private int homeDraws;
	@Column(name="away_draws")
	private int awayDraws;
	
	public HomeAway() {
		
	}
	
	public HomeAway(long id, int homeWins, int awayWins, int homeDraws, int awayDraws, String name) {
		super();
		this.id = id;
		this.homeWins = homeWins;
		this.awayWins = awayWins;
		this.homeDraws = homeDraws;
		this.awayDraws = awayDraws;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getHomeWins() {
		return homeWins;
	}
	public void setHomeWins(int homeWins) {
		this.homeWins = homeWins;
	}
	public int getAwayWins() {
		return awayWins;
	}
	public void setAwayWins(int awayWins) {
		this.awayWins = awayWins;
	}
	public int getHomeDraws() {
		return homeDraws;
	}
	public void setHomeDraws(int homeDraws) {
		this.homeDraws = homeDraws;
	}
	public int getAwayDraws() {
		return awayDraws;
	}
	public void setAwayDraws(int awayDraws) {
		this.awayDraws = awayDraws;
	}
	
	
	

}
