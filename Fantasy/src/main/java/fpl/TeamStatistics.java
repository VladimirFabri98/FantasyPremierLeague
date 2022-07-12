package fpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team_statistics")
public class TeamStatistics {

	@Id
	private long id;
	
	private String name;
	
	@Column(name = "goals_per_90_real")
	private double goalsPer90Real;
	
	@Column(name = "goals_per_90_exp")
	private double goalsPer90Exp;
	
	@Column(name = "goals_against_per_90")
	private double goalsAgainstPer90;
	
	@Column(name = "goals_last_5_games_per_90_exp")
	private double goalsLast5GamesPer90Exp;
	
	@Column(name = "goals_against_per_90_last_5")
	private double goalsAgainstPer90Last5;

	public TeamStatistics() {
		
	}
	
	public TeamStatistics(long id, String name, double goalsPer90Real, double goalsPer90Exp, double goalsAgainstPer90,
			double goalsLast5GamesPer90Real, double goalsLast5GamesPer90Exp, double goalsAgainstPer90Last5) {
		super();
		this.id = id;
		this.name = name;
		this.goalsPer90Real = goalsPer90Real;
		this.goalsPer90Exp = goalsPer90Exp;
		this.goalsAgainstPer90 = goalsAgainstPer90;
		this.goalsLast5GamesPer90Exp = goalsLast5GamesPer90Real;
		this.goalsAgainstPer90Last5 = goalsAgainstPer90Last5;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGoalsPer90Real() {
		return goalsPer90Real;
	}

	public void setGoalsPer90Real(double goalsPer90Real) {
		this.goalsPer90Real = goalsPer90Real;
	}

	public double getGoalsPer90Exp() {
		return goalsPer90Exp;
	}

	public void setGoalsPer90Exp(double goalsPer90Exp) {
		this.goalsPer90Exp = goalsPer90Exp;
	}

	public double getGoalsAgainstPer90() {
		return goalsAgainstPer90;
	}

	public void setGoalsAgainstPer90(double goalsAgainstPer90) {
		this.goalsAgainstPer90 = goalsAgainstPer90;
	}

	public double getGoalsLast5GamesPer90Exp() {
		return goalsLast5GamesPer90Exp;
	}

	public void setGoalsLast5GamesPer90Real(double goalsLast5GamesPer90Exp) {
		this.goalsLast5GamesPer90Exp = goalsLast5GamesPer90Exp;
	}
	
	public double getGoalsAgainstPer90Last5() {
		return goalsAgainstPer90Last5;
	}

	public void setGoalsAgainstPer90Last5(double goalsAgainstPer90Last5) {
		this.goalsAgainstPer90Last5 = goalsAgainstPer90Last5;
	}
	
	
}
