package fpl;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;


import fpl.fplRepositories.HistoryRecordsInterface;
import fpl.fplRepositories.HomeAwayRepository;
import fpl.fplRepositories.TeamStatisticsRepository;

public class MainFrm extends JFrame {
	
	@Autowired
	private HistoryRecordsInterface records;
	@Autowired
	private HomeAwayRepository homeAwayRepo;
	@Autowired
	private TeamStatisticsRepository statistics;
	
	private TeamStatistics teamOne = null;
	private TeamStatistics teamTwo = null;
	private HomeAway homeAway = null;
	Fixtures fixtures = new Fixtures();
	

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JTextField textField14;
	private JTextField textField15;
	private JTextField textField16;
	private JTextField textField17;
	private JTextField textField18;
	private JTextField textField19;
	private JTextField textFieldHomeWins1;
	private JTextField textFieldHomeWinPercentage1;
	private JTextField textFieldHomeDraws1;
	private JTextField textFieldAwayWins1;
	private JTextField textFieldAwayWinsPercentage1;
	private JTextField textFieldAwayDraws1;
	private JTextField textFieldHomeWins2;
	private JTextField textFieldHomeWinsPercentage2;
	private JTextField textFieldHomeDraws2;
	private JTextField textFieldAwayWins2;
	private JTextField textFieldAwayWinPercentage2;
	private JTextField textFieldAwayDraws2;
	private JTextField textFieldNext10_1;
	private JTextField textFieldNext10_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrm() {
		BeanProvider.autowire(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		GridBagLayout gbl_panelNorth = new GridBagLayout();
		gbl_panelNorth.columnWidths = new int[]{89, 177, 200, 543, 154, 77, 133, 0};
		gbl_panelNorth.rowHeights = new int[]{0, 46, 0};
		gbl_panelNorth.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelNorth.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panelNorth.setLayout(gbl_panelNorth);
		
		JComboBox<String> TeamOne = new JComboBox<String>();
		TeamOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TeamOne.setModel(new DefaultComboBoxModel(new String[] {"MCI", "LIV", "CHE", "TOT", "ARS", "MUN", "WHU", "LEI", "WOL", "BHA", "NEW", "CRY", "BRE", "AVL", "SOU", "EVE", "LEE", "FUL", "BOU", "NFO"}));
		GridBagConstraints gbc_TeamOne = new GridBagConstraints();
		gbc_TeamOne.insets = new Insets(0, 0, 0, 5);
		gbc_TeamOne.fill = GridBagConstraints.VERTICAL;
		gbc_TeamOne.gridx = 1;
		gbc_TeamOne.gridy = 1;
		panelNorth.add(TeamOne, gbc_TeamOne);
		
		TeamOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamOneSelected(TeamOne.getSelectedItem().toString());
				if(teamOne!= null && teamTwo!= null) {
					compareTeams(teamOne, teamTwo);
				}
			}
		});
		
		JComboBox<String> TeamTwo = new JComboBox<String>();
		TeamTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamTwoSelected(TeamTwo.getSelectedItem().toString());
				if(teamOne!= null && teamTwo!= null) {
					compareTeams(teamOne, teamTwo);
				}
			}
		});
		
		TeamTwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TeamTwo.setModel(new DefaultComboBoxModel(new String[] {"MCI", "LIV", "CHE", "TOT", "ARS", "MUN", "WHU", "LEI", "WOL", "BHA", "NEW", "CRY", "BRE", "AVL", "SOU", "EVE", "LEE", "FUL", "BOU", "NFO"}));
		GridBagConstraints gbc_TeamTwo = new GridBagConstraints();
		gbc_TeamTwo.insets = new Insets(0, 0, 0, 5);
		gbc_TeamTwo.fill = GridBagConstraints.VERTICAL;
		gbc_TeamTwo.gridx = 5;
		gbc_TeamTwo.gridy = 1;
		panelNorth.add(TeamTwo, gbc_TeamTwo);
		
		JPanel panelWest = new JPanel();
		contentPane.add(panelWest, BorderLayout.WEST);
		GridBagLayout gbl_panelWest = new GridBagLayout();
		gbl_panelWest.columnWidths = new int[]{90, 100, 43, 0};
		gbl_panelWest.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelWest.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelWest.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelWest.setLayout(gbl_panelWest);
		
		JLabel GoalsPer90 = new JLabel("G90");
		GoalsPer90.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_GoalsPer90 = new GridBagConstraints();
		gbc_GoalsPer90.insets = new Insets(0, 0, 5, 5);
		gbc_GoalsPer90.gridx = 0;
		gbc_GoalsPer90.gridy = 1;
		panelWest.add(GoalsPer90, gbc_GoalsPer90);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField1 = new GridBagConstraints();
		gbc_textField1.insets = new Insets(0, 0, 5, 5);
		gbc_textField1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField1.gridx = 1;
		gbc_textField1.gridy = 1;
		panelWest.add(textField1, gbc_textField1);
		textField1.setColumns(10);
		
		JLabel ExpectedGoalsPer90 = new JLabel("xG90");
		ExpectedGoalsPer90.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_ExpectedGoalsPer90 = new GridBagConstraints();
		gbc_ExpectedGoalsPer90.insets = new Insets(0, 0, 5, 5);
		gbc_ExpectedGoalsPer90.gridx = 0;
		gbc_ExpectedGoalsPer90.gridy = 3;
		panelWest.add(ExpectedGoalsPer90, gbc_ExpectedGoalsPer90);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.insets = new Insets(0, 0, 5, 5);
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridx = 1;
		gbc_textField2.gridy = 3;
		panelWest.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		
		JLabel GoalsConcededPer90 = new JLabel("gC90");
		GoalsConcededPer90.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_GoalsConcededPer90 = new GridBagConstraints();
		gbc_GoalsConcededPer90.insets = new Insets(0, 0, 5, 5);
		gbc_GoalsConcededPer90.gridx = 0;
		gbc_GoalsConcededPer90.gridy = 5;
		panelWest.add(GoalsConcededPer90, gbc_GoalsConcededPer90);
		
		textField3 = new JTextField();
		textField3.setEditable(false);
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField3 = new GridBagConstraints();
		gbc_textField3.insets = new Insets(0, 0, 5, 5);
		gbc_textField3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField3.gridx = 1;
		gbc_textField3.gridy = 5;
		panelWest.add(textField3, gbc_textField3);
		textField3.setColumns(10);
		
		JLabel ExpectedGoalsPer90Last5 = new JLabel("xG90L5");
		ExpectedGoalsPer90Last5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_ExpectedGoalsPer90Last5 = new GridBagConstraints();
		gbc_ExpectedGoalsPer90Last5.insets = new Insets(0, 0, 5, 5);
		gbc_ExpectedGoalsPer90Last5.gridx = 0;
		gbc_ExpectedGoalsPer90Last5.gridy = 7;
		panelWest.add(ExpectedGoalsPer90Last5, gbc_ExpectedGoalsPer90Last5);
		
		textField4 = new JTextField();
		textField4.setEditable(false);
		textField4.setHorizontalAlignment(SwingConstants.CENTER);
		textField4.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField4 = new GridBagConstraints();
		gbc_textField4.insets = new Insets(0, 0, 5, 5);
		gbc_textField4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField4.gridx = 1;
		gbc_textField4.gridy = 7;
		panelWest.add(textField4, gbc_textField4);
		textField4.setColumns(10);
		
		JLabel ExpectedGoalsConcededLast5 = new JLabel("xGCL5");
		ExpectedGoalsConcededLast5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_ExpectedGoalsConcededLast5 = new GridBagConstraints();
		gbc_ExpectedGoalsConcededLast5.insets = new Insets(0, 0, 5, 5);
		gbc_ExpectedGoalsConcededLast5.gridx = 0;
		gbc_ExpectedGoalsConcededLast5.gridy = 9;
		panelWest.add(ExpectedGoalsConcededLast5, gbc_ExpectedGoalsConcededLast5);
		
		textField5 = new JTextField();
		textField5.setEditable(false);
		textField5.setHorizontalAlignment(SwingConstants.CENTER);
		textField5.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField5 = new GridBagConstraints();
		gbc_textField5.insets = new Insets(0, 0, 5, 5);
		gbc_textField5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField5.gridx = 1;
		gbc_textField5.gridy = 9;
		panelWest.add(textField5, gbc_textField5);
		textField5.setColumns(10);
		
		JLabel lblHome1 = new JLabel("HOME");
		lblHome1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GridBagConstraints gbc_lblHome1 = new GridBagConstraints();
		gbc_lblHome1.insets = new Insets(0, 0, 5, 0);
		gbc_lblHome1.gridwidth = 3;
		gbc_lblHome1.gridx = 0;
		gbc_lblHome1.gridy = 12;
		panelWest.add(lblHome1, gbc_lblHome1);
		
		JLabel labelHomeWins1 = new JLabel("Wins");
		labelHomeWins1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelHomeWins1 = new GridBagConstraints();
		gbc_labelHomeWins1.insets = new Insets(0, 0, 5, 5);
		gbc_labelHomeWins1.gridx = 0;
		gbc_labelHomeWins1.gridy = 13;
		panelWest.add(labelHomeWins1, gbc_labelHomeWins1);
		
		JLabel labelHomeWinsPercentage1 = new JLabel("Win percentage");
		labelHomeWinsPercentage1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelHomeWinsPercentage1 = new GridBagConstraints();
		gbc_labelHomeWinsPercentage1.insets = new Insets(0, 0, 5, 5);
		gbc_labelHomeWinsPercentage1.gridx = 1;
		gbc_labelHomeWinsPercentage1.gridy = 13;
		panelWest.add(labelHomeWinsPercentage1, gbc_labelHomeWinsPercentage1);
		
		JLabel labelHomeDraws1 = new JLabel("Draws");
		labelHomeDraws1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelHomeDraws1 = new GridBagConstraints();
		gbc_labelHomeDraws1.insets = new Insets(0, 0, 5, 0);
		gbc_labelHomeDraws1.gridx = 2;
		gbc_labelHomeDraws1.gridy = 13;
		panelWest.add(labelHomeDraws1, gbc_labelHomeDraws1);
		
		textFieldHomeWins1 = new JTextField();
		textFieldHomeWins1.setEditable(false);
		textFieldHomeWins1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textFieldHomeWins1 = new GridBagConstraints();
		gbc_textFieldHomeWins1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldHomeWins1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHomeWins1.gridx = 0;
		gbc_textFieldHomeWins1.gridy = 14;
		panelWest.add(textFieldHomeWins1, gbc_textFieldHomeWins1);
		textFieldHomeWins1.setColumns(10);
		
		textFieldHomeWinPercentage1 = new JTextField();
		textFieldHomeWinPercentage1.setEditable(false);
		textFieldHomeWinPercentage1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textFieldHomeWinPercentage1 = new GridBagConstraints();
		gbc_textFieldHomeWinPercentage1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldHomeWinPercentage1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHomeWinPercentage1.gridx = 1;
		gbc_textFieldHomeWinPercentage1.gridy = 14;
		panelWest.add(textFieldHomeWinPercentage1, gbc_textFieldHomeWinPercentage1);
		textFieldHomeWinPercentage1.setColumns(10);
		
		textFieldHomeDraws1 = new JTextField();
		textFieldHomeDraws1.setEditable(false);
		textFieldHomeDraws1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textFieldHomeDraws1 = new GridBagConstraints();
		gbc_textFieldHomeDraws1.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldHomeDraws1.anchor = GridBagConstraints.WEST;
		gbc_textFieldHomeDraws1.gridx = 2;
		gbc_textFieldHomeDraws1.gridy = 14;
		panelWest.add(textFieldHomeDraws1, gbc_textFieldHomeDraws1);
		textFieldHomeDraws1.setColumns(10);
		
		JLabel lblAway = new JLabel("AWAY");
		lblAway.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GridBagConstraints gbc_lblAway = new GridBagConstraints();
		gbc_lblAway.insets = new Insets(0, 0, 5, 5);
		gbc_lblAway.gridx = 1;
		gbc_lblAway.gridy = 16;
		panelWest.add(lblAway, gbc_lblAway);
		
		JLabel labelAwayWins1 = new JLabel("Wins");
		labelAwayWins1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelAwayWins1 = new GridBagConstraints();
		gbc_labelAwayWins1.insets = new Insets(0, 0, 5, 5);
		gbc_labelAwayWins1.gridx = 0;
		gbc_labelAwayWins1.gridy = 17;
		panelWest.add(labelAwayWins1, gbc_labelAwayWins1);
		
		JLabel labelAwayWinsPercentage1 = new JLabel("Win percentage");
		labelAwayWinsPercentage1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelAwayWinsPercentage1 = new GridBagConstraints();
		gbc_labelAwayWinsPercentage1.insets = new Insets(0, 0, 5, 5);
		gbc_labelAwayWinsPercentage1.gridx = 1;
		gbc_labelAwayWinsPercentage1.gridy = 17;
		panelWest.add(labelAwayWinsPercentage1, gbc_labelAwayWinsPercentage1);
		
		JLabel labelAwayDraws1 = new JLabel("Draws");
		labelAwayDraws1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelAwayDraws1 = new GridBagConstraints();
		gbc_labelAwayDraws1.insets = new Insets(0, 0, 5, 0);
		gbc_labelAwayDraws1.gridx = 2;
		gbc_labelAwayDraws1.gridy = 17;
		panelWest.add(labelAwayDraws1, gbc_labelAwayDraws1);
		
		textFieldAwayWins1 = new JTextField();
		textFieldAwayWins1.setEditable(false);
		textFieldAwayWins1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAwayWins1.setColumns(10);
		GridBagConstraints gbc_textFieldAwayWins1 = new GridBagConstraints();
		gbc_textFieldAwayWins1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAwayWins1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAwayWins1.gridx = 0;
		gbc_textFieldAwayWins1.gridy = 18;
		panelWest.add(textFieldAwayWins1, gbc_textFieldAwayWins1);
		
		textFieldAwayWinsPercentage1 = new JTextField();
		textFieldAwayWinsPercentage1.setEditable(false);
		textFieldAwayWinsPercentage1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAwayWinsPercentage1.setColumns(10);
		GridBagConstraints gbc_textFieldAwayWinsPercentage1 = new GridBagConstraints();
		gbc_textFieldAwayWinsPercentage1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAwayWinsPercentage1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAwayWinsPercentage1.gridx = 1;
		gbc_textFieldAwayWinsPercentage1.gridy = 18;
		panelWest.add(textFieldAwayWinsPercentage1, gbc_textFieldAwayWinsPercentage1);
		
		textFieldAwayDraws1 = new JTextField();
		textFieldAwayDraws1.setEditable(false);
		textFieldAwayDraws1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAwayDraws1.setColumns(10);
		GridBagConstraints gbc_textFieldAwayDraws1 = new GridBagConstraints();
		gbc_textFieldAwayDraws1.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAwayDraws1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAwayDraws1.gridx = 2;
		gbc_textFieldAwayDraws1.gridy = 18;
		panelWest.add(textFieldAwayDraws1, gbc_textFieldAwayDraws1);
		
		JLabel lblXgInNext = new JLabel("xG in next 10 Fixtures AVG");
		lblXgInNext.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GridBagConstraints gbc_lblXgInNext = new GridBagConstraints();
		gbc_lblXgInNext.insets = new Insets(0, 0, 5, 0);
		gbc_lblXgInNext.gridwidth = 3;
		gbc_lblXgInNext.gridx = 0;
		gbc_lblXgInNext.gridy = 20;
		panelWest.add(lblXgInNext, gbc_lblXgInNext);
		
		textFieldNext10_1 = new JTextField();
		textFieldNext10_1.setEditable(false);
		textFieldNext10_1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNext10_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_textFieldNext10_1 = new GridBagConstraints();
		gbc_textFieldNext10_1.gridwidth = 3;
		gbc_textFieldNext10_1.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNext10_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNext10_1.gridx = 0;
		gbc_textFieldNext10_1.gridy = 21;
		panelWest.add(textFieldNext10_1, gbc_textFieldNext10_1);
		textFieldNext10_1.setColumns(10);
		
		JPanel panelEast = new JPanel();
		contentPane.add(panelEast, BorderLayout.EAST);
		GridBagLayout gbl_panelEast = new GridBagLayout();
		gbl_panelEast.columnWidths = new int[]{43, 146, 90, 0};
		gbl_panelEast.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelEast.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelEast.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelEast.setLayout(gbl_panelEast);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panelEast.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel GoalsPer902 = new JLabel("G90");
		GoalsPer902.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_GoalsPer902 = new GridBagConstraints();
		gbc_GoalsPer902.insets = new Insets(0, 0, 5, 0);
		gbc_GoalsPer902.gridx = 2;
		gbc_GoalsPer902.gridy = 1;
		panelEast.add(GoalsPer902, gbc_GoalsPer902);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panelEast.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel ExpectedGoalsPer902 = new JLabel("xG90");
		ExpectedGoalsPer902.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_ExpectedGoalsPer902 = new GridBagConstraints();
		gbc_ExpectedGoalsPer902.insets = new Insets(0, 0, 5, 0);
		gbc_ExpectedGoalsPer902.gridx = 2;
		gbc_ExpectedGoalsPer902.gridy = 3;
		panelEast.add(ExpectedGoalsPer902, gbc_ExpectedGoalsPer902);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 5;
		panelEast.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel GoalsConcededPer902 = new JLabel("gC90");
		GoalsConcededPer902.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_GoalsConcededPer902 = new GridBagConstraints();
		gbc_GoalsConcededPer902.insets = new Insets(0, 0, 5, 0);
		gbc_GoalsConcededPer902.gridx = 2;
		gbc_GoalsConcededPer902.gridy = 5;
		panelEast.add(GoalsConcededPer902, gbc_GoalsConcededPer902);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 7;
		panelEast.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel ExpectedGoalsPer90Last52 = new JLabel("xG90L5");
		ExpectedGoalsPer90Last52.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_ExpectedGoalsPer90Last52 = new GridBagConstraints();
		gbc_ExpectedGoalsPer90Last52.insets = new Insets(0, 0, 5, 0);
		gbc_ExpectedGoalsPer90Last52.gridx = 2;
		gbc_ExpectedGoalsPer90Last52.gridy = 7;
		panelEast.add(ExpectedGoalsPer90Last52, gbc_ExpectedGoalsPer90Last52);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 9;
		panelEast.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel ExpectedGoalsConcededLast52 = new JLabel("xGCL5");
		ExpectedGoalsConcededLast52.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_ExpectedGoalsConcededLast52 = new GridBagConstraints();
		gbc_ExpectedGoalsConcededLast52.insets = new Insets(0, 0, 5, 0);
		gbc_ExpectedGoalsConcededLast52.gridx = 2;
		gbc_ExpectedGoalsConcededLast52.gridy = 9;
		panelEast.add(ExpectedGoalsConcededLast52, gbc_ExpectedGoalsConcededLast52);
		
		JLabel lblHome1_1 = new JLabel("HOME");
		lblHome1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GridBagConstraints gbc_lblHome1_1 = new GridBagConstraints();
		gbc_lblHome1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblHome1_1.gridwidth = 3;
		gbc_lblHome1_1.gridx = 0;
		gbc_lblHome1_1.gridy = 12;
		panelEast.add(lblHome1_1, gbc_lblHome1_1);
		
		JLabel labelHomeWins1_1 = new JLabel("Wins");
		labelHomeWins1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelHomeWins1_1 = new GridBagConstraints();
		gbc_labelHomeWins1_1.insets = new Insets(0, 0, 5, 5);
		gbc_labelHomeWins1_1.gridx = 0;
		gbc_labelHomeWins1_1.gridy = 13;
		panelEast.add(labelHomeWins1_1, gbc_labelHomeWins1_1);
		
		JLabel labelHomeWinsPercentage1_1 = new JLabel("Win percentage");
		labelHomeWinsPercentage1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelHomeWinsPercentage1_1 = new GridBagConstraints();
		gbc_labelHomeWinsPercentage1_1.insets = new Insets(0, 0, 5, 5);
		gbc_labelHomeWinsPercentage1_1.gridx = 1;
		gbc_labelHomeWinsPercentage1_1.gridy = 13;
		panelEast.add(labelHomeWinsPercentage1_1, gbc_labelHomeWinsPercentage1_1);
		
		JLabel labelHomeDraws1_1 = new JLabel("Draws");
		labelHomeDraws1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelHomeDraws1_1 = new GridBagConstraints();
		gbc_labelHomeDraws1_1.insets = new Insets(0, 0, 5, 0);
		gbc_labelHomeDraws1_1.gridx = 2;
		gbc_labelHomeDraws1_1.gridy = 13;
		panelEast.add(labelHomeDraws1_1, gbc_labelHomeDraws1_1);
		
		textFieldHomeWins2 = new JTextField();
		textFieldHomeWins2.setEditable(false);
		textFieldHomeWins2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHomeWins2.setColumns(10);
		GridBagConstraints gbc_textFieldHomeWins2 = new GridBagConstraints();
		gbc_textFieldHomeWins2.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldHomeWins2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHomeWins2.gridx = 0;
		gbc_textFieldHomeWins2.gridy = 14;
		panelEast.add(textFieldHomeWins2, gbc_textFieldHomeWins2);
		
		textFieldHomeWinsPercentage2 = new JTextField();
		textFieldHomeWinsPercentage2.setEditable(false);
		textFieldHomeWinsPercentage2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHomeWinsPercentage2.setColumns(10);
		GridBagConstraints gbc_textFieldHomeWinsPercentage2 = new GridBagConstraints();
		gbc_textFieldHomeWinsPercentage2.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldHomeWinsPercentage2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHomeWinsPercentage2.gridx = 1;
		gbc_textFieldHomeWinsPercentage2.gridy = 14;
		panelEast.add(textFieldHomeWinsPercentage2, gbc_textFieldHomeWinsPercentage2);
		
		textFieldHomeDraws2 = new JTextField();
		textFieldHomeDraws2.setEditable(false);
		textFieldHomeDraws2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHomeDraws2.setColumns(10);
		GridBagConstraints gbc_textFieldHomeDraws2 = new GridBagConstraints();
		gbc_textFieldHomeDraws2.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldHomeDraws2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHomeDraws2.gridx = 2;
		gbc_textFieldHomeDraws2.gridy = 14;
		panelEast.add(textFieldHomeDraws2, gbc_textFieldHomeDraws2);
		
		JLabel lblAway_1 = new JLabel("AWAY");
		lblAway_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GridBagConstraints gbc_lblAway_1 = new GridBagConstraints();
		gbc_lblAway_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblAway_1.gridwidth = 3;
		gbc_lblAway_1.gridx = 0;
		gbc_lblAway_1.gridy = 16;
		panelEast.add(lblAway_1, gbc_lblAway_1);
		
		JLabel labelAwayWins1_1 = new JLabel("Wins");
		labelAwayWins1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelAwayWins1_1 = new GridBagConstraints();
		gbc_labelAwayWins1_1.insets = new Insets(0, 0, 5, 5);
		gbc_labelAwayWins1_1.gridx = 0;
		gbc_labelAwayWins1_1.gridy = 17;
		panelEast.add(labelAwayWins1_1, gbc_labelAwayWins1_1);
		
		JLabel labelAwayWinsPercentage1_1 = new JLabel("Win percentage");
		labelAwayWinsPercentage1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelAwayWinsPercentage1_1 = new GridBagConstraints();
		gbc_labelAwayWinsPercentage1_1.insets = new Insets(0, 0, 5, 5);
		gbc_labelAwayWinsPercentage1_1.gridx = 1;
		gbc_labelAwayWinsPercentage1_1.gridy = 17;
		panelEast.add(labelAwayWinsPercentage1_1, gbc_labelAwayWinsPercentage1_1);
		
		JLabel labelAwayDraws1_1 = new JLabel("Draws");
		labelAwayDraws1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_labelAwayDraws1_1 = new GridBagConstraints();
		gbc_labelAwayDraws1_1.insets = new Insets(0, 0, 5, 0);
		gbc_labelAwayDraws1_1.gridx = 2;
		gbc_labelAwayDraws1_1.gridy = 17;
		panelEast.add(labelAwayDraws1_1, gbc_labelAwayDraws1_1);
		
		textFieldAwayWins2 = new JTextField();
		textFieldAwayWins2.setEditable(false);
		textFieldAwayWins2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAwayWins2.setColumns(10);
		GridBagConstraints gbc_textFieldAwayWins2 = new GridBagConstraints();
		gbc_textFieldAwayWins2.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAwayWins2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAwayWins2.gridx = 0;
		gbc_textFieldAwayWins2.gridy = 18;
		panelEast.add(textFieldAwayWins2, gbc_textFieldAwayWins2);
		
		textFieldAwayWinPercentage2 = new JTextField();
		textFieldAwayWinPercentage2.setEditable(false);
		textFieldAwayWinPercentage2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAwayWinPercentage2.setColumns(10);
		GridBagConstraints gbc_textFieldAwayWinPercentage2 = new GridBagConstraints();
		gbc_textFieldAwayWinPercentage2.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAwayWinPercentage2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAwayWinPercentage2.gridx = 1;
		gbc_textFieldAwayWinPercentage2.gridy = 18;
		panelEast.add(textFieldAwayWinPercentage2, gbc_textFieldAwayWinPercentage2);
		
		textFieldAwayDraws2 = new JTextField();
		textFieldAwayDraws2.setEditable(false);
		textFieldAwayDraws2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAwayDraws2.setColumns(10);
		GridBagConstraints gbc_textFieldAwayDraws2 = new GridBagConstraints();
		gbc_textFieldAwayDraws2.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAwayDraws2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAwayDraws2.gridx = 2;
		gbc_textFieldAwayDraws2.gridy = 18;
		panelEast.add(textFieldAwayDraws2, gbc_textFieldAwayDraws2);
		
		JLabel lblXgInNext_1 = new JLabel("xG in next 10 Fixtures AVG");
		lblXgInNext_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GridBagConstraints gbc_lblXgInNext_1 = new GridBagConstraints();
		gbc_lblXgInNext_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblXgInNext_1.gridwidth = 3;
		gbc_lblXgInNext_1.gridx = 0;
		gbc_lblXgInNext_1.gridy = 20;
		panelEast.add(lblXgInNext_1, gbc_lblXgInNext_1);
		
		textFieldNext10_2 = new JTextField();
		textFieldNext10_2.setEditable(false);
		textFieldNext10_2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNext10_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNext10_2.setColumns(10);
		GridBagConstraints gbc_textFieldNext10_2 = new GridBagConstraints();
		gbc_textFieldNext10_2.gridwidth = 3;
		gbc_textFieldNext10_2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNext10_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNext10_2.gridx = 0;
		gbc_textFieldNext10_2.gridy = 21;
		panelEast.add(textFieldNext10_2, gbc_textFieldNext10_2);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{103, 121, 101, 0};
		gbl_panelCenter.rowHeights = new int[]{39, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel Label1 = new JLabel("Team 1 Goals average vs Goals conceded of Team 2");
		Label1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		GridBagConstraints gbc_Label1 = new GridBagConstraints();
		gbc_Label1.gridwidth = 3;
		gbc_Label1.insets = new Insets(0, 0, 5, 0);
		gbc_Label1.gridx = 0;
		gbc_Label1.gridy = 0;
		panelCenter.add(Label1, gbc_Label1);
		
		textField11 = new JTextField();
		textField11.setEditable(false);
		textField11.setHorizontalAlignment(SwingConstants.CENTER);
		textField11.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField11 = new GridBagConstraints();
		gbc_textField11.insets = new Insets(0, 0, 5, 5);
		gbc_textField11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField11.gridx = 1;
		gbc_textField11.gridy = 1;
		panelCenter.add(textField11, gbc_textField11);
		textField11.setColumns(10);
		
		JLabel label2 = new JLabel("Team 2 Goals average vs Goals conceded of Team 1");
		label2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		GridBagConstraints gbc_label2 = new GridBagConstraints();
		gbc_label2.insets = new Insets(0, 0, 5, 0);
		gbc_label2.gridwidth = 3;
		gbc_label2.gridx = 0;
		gbc_label2.gridy = 2;
		panelCenter.add(label2, gbc_label2);
		
		textField12 = new JTextField();
		textField12.setEditable(false);
		textField12.setHorizontalAlignment(SwingConstants.CENTER);
		textField12.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		GridBagConstraints gbc_textField12 = new GridBagConstraints();
		gbc_textField12.insets = new Insets(0, 0, 5, 5);
		gbc_textField12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField12.gridx = 1;
		gbc_textField12.gridy = 3;
		panelCenter.add(textField12, gbc_textField12);
		textField12.setColumns(10);
		
		JLabel label3 = new JLabel("Team 1 Goals expected vs Goals conceded of Team 2");
		label3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		GridBagConstraints gbc_label3 = new GridBagConstraints();
		gbc_label3.insets = new Insets(0, 0, 5, 0);
		gbc_label3.gridwidth = 3;
		gbc_label3.gridx = 0;
		gbc_label3.gridy = 4;
		panelCenter.add(label3, gbc_label3);
		
		textField13 = new JTextField();
		textField13.setEditable(false);
		textField13.setHorizontalAlignment(SwingConstants.CENTER);
		textField13.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		textField13.setColumns(10);
		GridBagConstraints gbc_textField13 = new GridBagConstraints();
		gbc_textField13.insets = new Insets(0, 0, 5, 5);
		gbc_textField13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField13.gridx = 1;
		gbc_textField13.gridy = 5;
		panelCenter.add(textField13, gbc_textField13);
		
		JLabel label4 = new JLabel("Team 2 Goals expected vs Goals conceded of Team 1");
		label4.setFont(new Font("Sitka Text", Font.BOLD, 13));
		GridBagConstraints gbc_label4 = new GridBagConstraints();
		gbc_label4.insets = new Insets(0, 0, 5, 0);
		gbc_label4.gridwidth = 3;
		gbc_label4.gridx = 0;
		gbc_label4.gridy = 6;
		panelCenter.add(label4, gbc_label4);
		
		textField14 = new JTextField();
		textField14.setEditable(false);
		textField14.setHorizontalAlignment(SwingConstants.CENTER);
		textField14.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		textField14.setColumns(10);
		GridBagConstraints gbc_textField14 = new GridBagConstraints();
		gbc_textField14.insets = new Insets(0, 0, 5, 5);
		gbc_textField14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField14.gridx = 1;
		gbc_textField14.gridy = 7;
		panelCenter.add(textField14, gbc_textField14);
		
		JLabel label5 = new JLabel("Last 5 Matches last season");
		label5.setFont(new Font("Sitka Text", Font.BOLD, 17));
		GridBagConstraints gbc_label5 = new GridBagConstraints();
		gbc_label5.insets = new Insets(0, 0, 5, 0);
		gbc_label5.gridwidth = 3;
		gbc_label5.gridx = 0;
		gbc_label5.gridy = 8;
		panelCenter.add(label5, gbc_label5);
		
		JLabel label6 = new JLabel("Team 1 Goals expected vs Goals conceded of Team 2");
		label6.setFont(new Font("Sitka Text", Font.BOLD, 13));
		GridBagConstraints gbc_label6 = new GridBagConstraints();
		gbc_label6.insets = new Insets(0, 0, 5, 0);
		gbc_label6.gridwidth = 3;
		gbc_label6.gridx = 0;
		gbc_label6.gridy = 9;
		panelCenter.add(label6, gbc_label6);
		
		textField15 = new JTextField();
		textField15.setEditable(false);
		textField15.setHorizontalAlignment(SwingConstants.CENTER);
		textField15.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		textField15.setColumns(10);
		GridBagConstraints gbc_textField15 = new GridBagConstraints();
		gbc_textField15.insets = new Insets(0, 0, 5, 5);
		gbc_textField15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField15.gridx = 1;
		gbc_textField15.gridy = 10;
		panelCenter.add(textField15, gbc_textField15);
		
		JLabel label7 = new JLabel("Team 2 Goals expected vs Goals conceded of Team 1");
		label7.setFont(new Font("Sitka Text", Font.BOLD, 13));
		GridBagConstraints gbc_label7 = new GridBagConstraints();
		gbc_label7.insets = new Insets(0, 0, 5, 0);
		gbc_label7.gridwidth = 3;
		gbc_label7.gridx = 0;
		gbc_label7.gridy = 11;
		panelCenter.add(label7, gbc_label7);
		
		textField16 = new JTextField();
		textField16.setEditable(false);
		textField16.setHorizontalAlignment(SwingConstants.CENTER);
		textField16.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		textField16.setColumns(10);
		GridBagConstraints gbc_textField16 = new GridBagConstraints();
		gbc_textField16.insets = new Insets(0, 0, 5, 5);
		gbc_textField16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField16.gridx = 1;
		gbc_textField16.gridy = 12;
		panelCenter.add(textField16, gbc_textField16);
		
		JLabel label8 = new JLabel("Historic score in last 3 years");
		label8.setFont(new Font("Sitka Text", Font.BOLD, 17));
		GridBagConstraints gbc_label8 = new GridBagConstraints();
		gbc_label8.insets = new Insets(0, 0, 5, 0);
		gbc_label8.gridwidth = 3;
		gbc_label8.gridx = 0;
		gbc_label8.gridy = 14;
		panelCenter.add(label8, gbc_label8);
		
		JLabel labelWins1 = new JLabel("Wins");
		GridBagConstraints gbc_labelWins1 = new GridBagConstraints();
		gbc_labelWins1.insets = new Insets(0, 0, 5, 5);
		gbc_labelWins1.gridx = 0;
		gbc_labelWins1.gridy = 15;
		panelCenter.add(labelWins1, gbc_labelWins1);
		
		JLabel labelDraws = new JLabel("Draws");
		GridBagConstraints gbc_labelDraws = new GridBagConstraints();
		gbc_labelDraws.insets = new Insets(0, 0, 5, 5);
		gbc_labelDraws.gridx = 1;
		gbc_labelDraws.gridy = 15;
		panelCenter.add(labelDraws, gbc_labelDraws);
		
		JLabel labelWins2 = new JLabel("Wins");
		GridBagConstraints gbc_labelWins2 = new GridBagConstraints();
		gbc_labelWins2.insets = new Insets(0, 0, 5, 0);
		gbc_labelWins2.gridx = 2;
		gbc_labelWins2.gridy = 15;
		panelCenter.add(labelWins2, gbc_labelWins2);
		
		textField17 = new JTextField();
		textField17.setHorizontalAlignment(SwingConstants.CENTER);
		textField17.setEditable(false);
		GridBagConstraints gbc_textField17 = new GridBagConstraints();
		gbc_textField17.insets = new Insets(0, 0, 0, 5);
		gbc_textField17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField17.gridx = 0;
		gbc_textField17.gridy = 16;
		panelCenter.add(textField17, gbc_textField17);
		textField17.setColumns(10);
		
		textField18 = new JTextField();
		textField18.setEditable(false);
		textField18.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField18 = new GridBagConstraints();
		gbc_textField18.insets = new Insets(0, 0, 0, 5);
		gbc_textField18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField18.gridx = 1;
		gbc_textField18.gridy = 16;
		panelCenter.add(textField18, gbc_textField18);
		textField18.setColumns(10);
		
		textField19 = new JTextField();
		textField19.setHorizontalAlignment(SwingConstants.CENTER);
		textField19.setEditable(false);
		GridBagConstraints gbc_textField19 = new GridBagConstraints();
		gbc_textField19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField19.gridx = 2;
		gbc_textField19.gridy = 16;
		panelCenter.add(textField19, gbc_textField19);
		textField19.setColumns(10);
	
	}
	
	public void teamOneSelected(String name) {
		teamOne = statistics.getByName(name);
		homeAway = homeAwayRepo.getByName(name);
		getTextField1().setText(String.format("%.2f",teamOne.getGoalsPer90Real()));
		getTextField2().setText(String.format("%.2f",teamOne.getGoalsPer90Exp()));
		getTextField3().setText(String.format("%.2f",teamOne.getGoalsAgainstPer90()));
		getTextField4().setText(String.format("%.2f",teamOne.getGoalsLast5GamesPer90Exp()));
		getTextField5().setText(String.format("%.2f",teamOne.getGoalsAgainstPer90Last5()));
		getTextFieldHomeWins1().setText(Integer.toString(homeAway.getHomeWins()));
		getTextFieldHomeDraws1().setText(Integer.toString(homeAway.getHomeDraws()));
		getTextFieldHomeWinPercentage1().setText(String.format("%.2f",calculateHomeWinPercentage(homeAway)));
		getTextFieldAwayWins1().setText(Integer.toString(homeAway.getAwayWins()));
		getTextFieldAwayDraws1().setText(Integer.toString(homeAway.getAwayDraws()));
		getTextFieldAwayWinsPercentage1().setText(String.format("%.2f",calculateAwayWinPercentage(homeAway)));
		getTextFieldNext10_1().setText(String.format("%.2f", calculateNextTen(teamOne)));
	}
	
	public void teamTwoSelected(String name) {
		teamTwo = statistics.getByName(name);
		homeAway = homeAwayRepo.getByName(name);
		getTextField_1().setText(String.format("%.2f",teamTwo.getGoalsPer90Real()));
		getTextField_2().setText(String.format("%.2f",teamTwo.getGoalsPer90Exp()));
		getTextField_3().setText(String.format("%.2f",teamTwo.getGoalsAgainstPer90()));
		getTextField_4().setText(String.format("%.2f",teamTwo.getGoalsLast5GamesPer90Exp()));
		getTextField_5().setText(String.format("%.2f",teamTwo.getGoalsAgainstPer90Last5()));
		getTextFieldHomeWins2().setText(Integer.toString(homeAway.getHomeWins()));
		getTextFieldHomeDraws2().setText(Integer.toString(homeAway.getHomeDraws()));
		getTextFieldHomeWinsPercentage2().setText(String.format("%.2f",calculateHomeWinPercentage(homeAway)));
		getTextFieldAwayWins2().setText(Integer.toString(homeAway.getAwayWins()));
		getTextFieldAwayDraws2().setText(Integer.toString(homeAway.getAwayDraws()));
		getTextFieldAwayWinPercentage2().setText(String.format("%.2f",calculateAwayWinPercentage(homeAway)));
		getTextFieldNext10_2().setText(String.format("%.2f", calculateNextTen(teamTwo)));
	}
	
	public double calculateNextTen(TeamStatistics team) {
		String[] teamFixtures = fixtures.selectTeamFixtures(team.getName());
		double aggregateXG = team.getGoalsPer90Exp();
		double aggregateXGC = 0;
		for(int i = 0; i < 10; i++) {
			aggregateXGC += statistics.getByName(teamFixtures[i]).getGoalsAgainstPer90();
		}
		aggregateXG = (aggregateXG + aggregateXGC/10)/2;
		return aggregateXG;
		
	}
	
	public void compareTeams(TeamStatistics teamOne, TeamStatistics teamTwo) {
		getTextField11().setText(String.format("%.2f", (teamOne.getGoalsPer90Real()+teamTwo.getGoalsAgainstPer90())/2));
		getTextField12().setText(String.format("%.2f", (teamTwo.getGoalsPer90Real()+teamOne.getGoalsAgainstPer90())/2));
		getTextField13().setText(String.format("%.2f", (teamOne.getGoalsPer90Exp()+teamTwo.getGoalsAgainstPer90())/2));
		getTextField14().setText(String.format("%.2f", (teamTwo.getGoalsPer90Exp()+teamOne.getGoalsAgainstPer90())/2));
		getTextField15().setText(String.format("%.2f", (teamOne.getGoalsLast5GamesPer90Exp()+teamTwo.getGoalsAgainstPer90Last5())/2));
		getTextField16().setText(String.format("%.2f", (teamTwo.getGoalsLast5GamesPer90Exp()+teamOne.getGoalsAgainstPer90Last5())/2));
	}
	
	public double calculateHomeWinPercentage(HomeAway var) {
		int homeWins = var.getHomeWins();
		return (double)homeWins/19;
	}
	
	public double calculateAwayWinPercentage(HomeAway var) {
		int awayWins = var.getAwayWins();
		return (double)awayWins/19;
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public JTextField getTextField3() {
		return textField3;
	}

	public JTextField getTextField4() {
		return textField4;
	}

	public JTextField getTextField5() {
		return textField5;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public JTextField getTextField11() {
		return textField11;
	}

	public JTextField getTextField12() {
		return textField12;
	}

	public JTextField getTextField13() {
		return textField13;
	}

	public JTextField getTextField14() {
		return textField14;
	}

	public JTextField getTextField15() {
		return textField15;
	}

	public JTextField getTextField16() {
		return textField16;
	}

	public JTextField getTextField17() {
		return textField17;
	}

	public JTextField getTextField18() {
		return textField18;
	}

	public JTextField getTextField19() {
		return textField19;
	}

	public JTextField getTextFieldHomeWins1() {
		return textFieldHomeWins1;
	}

	public JTextField getTextFieldHomeWinPercentage1() {
		return textFieldHomeWinPercentage1;
	}

	public JTextField getTextFieldHomeDraws1() {
		return textFieldHomeDraws1;
	}

	public JTextField getTextFieldAwayWins1() {
		return textFieldAwayWins1;
	}

	public JTextField getTextFieldAwayWinsPercentage1() {
		return textFieldAwayWinsPercentage1;
	}

	public JTextField getTextFieldAwayDraws1() {
		return textFieldAwayDraws1;
	}

	public JTextField getTextFieldHomeWins2() {
		return textFieldHomeWins2;
	}

	public JTextField getTextFieldHomeWinsPercentage2() {
		return textFieldHomeWinsPercentage2;
	}

	public JTextField getTextFieldHomeDraws2() {
		return textFieldHomeDraws2;
	}

	public JTextField getTextFieldAwayWins2() {
		return textFieldAwayWins2;
	}

	public JTextField getTextFieldAwayWinPercentage2() {
		return textFieldAwayWinPercentage2;
	}

	public JTextField getTextFieldAwayDraws2() {
		return textFieldAwayDraws2;
	}

	public JTextField getTextFieldNext10_1() {
		return textFieldNext10_1;
	}

	public JTextField getTextFieldNext10_2() {
		return textFieldNext10_2;
	}
	
	
}
