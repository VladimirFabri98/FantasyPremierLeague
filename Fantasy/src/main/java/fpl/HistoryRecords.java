package fpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history_records")
public class HistoryRecords {

	
	@Id
	private long id;
	
	@Column(name="club_one")
	private String clubOne;
	
	@Column(name="club_two")
	private String clubTwo;
	
	@Column(name="club_one_wins")
	private int clubOneWins;
	
	@Column(name="club_two_wins")
	private int clubTwoWins;
	
	private int draws;
	
	public HistoryRecords() {
		
	}
	
	public HistoryRecords(long id, String clubOne, String clubTwo, int clubOneWins, int clubTwoWins, int draws) {
		super();
		this.id = id;
		this.clubOne = clubOne;
		this.clubTwo = clubTwo;
		this.clubOneWins = clubOneWins;
		this.clubTwoWins = clubTwoWins;
		this.draws = draws;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClubOne() {
		return clubOne;
	}

	public void setClubOne(String clubOne) {
		this.clubOne = clubOne;
	}

	public String getClubTwo() {
		return clubTwo;
	}

	public void setClubTwo(String clubTwo) {
		this.clubTwo = clubTwo;
	}

	public int getClubOneWins() {
		return clubOneWins;
	}

	public void setClubOneWins(int clubOneWins) {
		this.clubOneWins = clubOneWins;
	}

	public int getClubTwoWins() {
		return clubTwoWins;
	}

	public void setClubTwoWins(int clubTwoWins) {
		this.clubTwoWins = clubTwoWins;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}
	
	
	
}
