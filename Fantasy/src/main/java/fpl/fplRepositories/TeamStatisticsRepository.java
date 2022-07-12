package fpl.fplRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fpl.TeamStatistics;

public interface TeamStatisticsRepository extends JpaRepository<TeamStatistics,Long> {

	TeamStatistics getByName(String name);
}
