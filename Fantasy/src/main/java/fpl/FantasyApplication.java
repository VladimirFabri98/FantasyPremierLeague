package fpl;

import javax.swing.SwingUtilities;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FantasyApplication implements CommandLineRunner{

	public static void main(String[] args) {
        new SpringApplicationBuilder(FantasyApplication.class)
                .headless(false).bannerMode(Banner.Mode.OFF).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            MainFrm frame = new MainFrm();
            frame.setVisible(true);
        });
    }
}
