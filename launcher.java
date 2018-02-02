package zahlenspiel;

import java.awt.*;

import javax.swing.*;

public class launcher extends javax.swing.JFrame {
	// Menüleiste
	static JMenuBar menuBar;
	// Menu
	// JMenu name;
	// JMenu editMenu;
	JMenu scoreMenu;
	JMenu gameMenu;
	JMenu settingsMenu;

	// Menüpunkt erzeugen
	// JMenuItem name;
	JMenuItem gameStart;
	JMenuItem gameEnd;
	JMenuItem gameClose;
	JMenuItem scoreboard;
	JMenuItem scoreupload;
	JMenuItem modussettings;
	JMenuItem settings;

	// Buttons erzeugen / JButton Array erzeugen - subroutine?
	// JButton one,two,three,four;

	// separate panels for each function e.g. MenuBar, GameContent, GameValues
	JPanel menupanel = new JPanel();
	JPanel panel = new JPanel();

	// create labels
	JLabel moves = new JLabel("Moves: ");

	public launcher() {
		// normal constructor.. define window here

		this.setTitle("Zahlenschieberei by Schrotti & CaptainStein");
		this.setSize(600, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create menubar
		menuBar = new JMenuBar();
		// create menus
		gameMenu = new JMenu("Spielmenü");
		scoreMenu = new JMenu("Scoreboard");
		settingsMenu = new JMenu("Einstellungen");

		// create menuitem
		gameStart = new JMenuItem("Spiel starten");
		gameEnd = new JMenuItem("Spiel beenden");
		gameClose = new JMenuItem("Fenster schließen w/o saving");
		scoreboard = new JMenuItem("Scoreboard");
		scoreupload = new JMenuItem("upload Score");
		modussettings = new JMenuItem("Spielmodus");
		settings = new JMenuItem("Einstellungen");

		// add menuitems
		gameMenu.add(gameStart);
		gameMenu.add(gameEnd);
		gameMenu.add(gameClose);
		scoreMenu.add(scoreboard);
		scoreMenu.add(scoreupload);
		settingsMenu.add(modussettings);
		settingsMenu.add(settings);

		// add menus
		menuBar.add(gameMenu);
		menuBar.add(scoreMenu);
		menuBar.add(settingsMenu);

		// JButtons werden initialisiert
		// one = new JButton("test");
		// this.setLayout(new GridLayout(4, 1));
		menupanel.add(menuBar, BorderLayout.NORTH);
		// methods to scale GUI / pack content / add the rest
		// this.add(moves);
		// this.pack();

		// panel.add(one);

		// this.add(menupanel, BorderLayout.NORTH);
		// this.add(panel);

		// this.getContentPane().add(one);

		// JButton array
		JButton[] buttons = new JButton[27];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("" + (i + 1));
			panel.add(buttons[i]);
		}

		for (int i = 0; i < buttons.length; i++) {
			// Action Listener wird als anonyme Klasse eingebunden
			buttons[i].addActionListener(new java.awt.event.ActionListener() {
				// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("ssss");
					// do anything
				}
			});
		}

		// Action Listener wird als anonyme Klasse eingebunden
		gameStart.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// hier soll das Spiel gestartet werden

			}
		});

		// Action Listener wird als anonyme Klasse eingebunden
		gameEnd.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// hier sollte das Spiel beendet werden
				// derzeit -> Programm schließen
				System.exit(0);
			}
		});

		// Action Listener wird als anonyme Klasse eingebunden
		gameClose.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {

				// Programm schließen
				System.exit(0);
			}
		});
		// Action Listener wird als anonyme Klasse eingebunden
		scoreboard.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {

				// Programm schließen
				System.exit(0);
			}
		});
		// Action Listener wird als anonyme Klasse eingebunden
		scoreupload.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {

				// Programm schließen
				System.exit(0);
			}
		});
		// Action Listener wird als anonyme Klasse eingebunden
		modussettings.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {

				// Programm schließen
				System.exit(0);
			}
		});
		// Action Listener wird als anonyme Klasse eingebunden
		settings.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {

				// Programm schließen
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {

		launcher test = new launcher();
		// Fenster sichtbar machen
		// test.setLayout(new GridLayout(9,5));
		// test.setJMenuBar(menuBar);
		test.setVisible(true);

	}

}
