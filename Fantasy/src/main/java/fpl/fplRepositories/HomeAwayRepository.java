package fpl.fplRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fpl.HomeAway;

public interface HomeAwayRepository extends JpaRepository<HomeAway,Long> {

	HomeAway getByName(String name);
}
