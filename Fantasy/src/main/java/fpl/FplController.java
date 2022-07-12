package fpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fpl.fplRepositories.TeamStatisticsRepository;

@RestController
public class FplController {
	
	@Autowired
	private TeamStatisticsRepository statistics;
	
	@GetMapping("/test")
	public void returnHello() {
		MainFrm frame = new MainFrm();
		frame.setVisible(true);
	}

}
