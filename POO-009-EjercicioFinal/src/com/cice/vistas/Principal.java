package com.cice.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cice.logica.Logica;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	Logica logica;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 442);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		logica = new Logica (this);
		
		JPanel panel = new JPanel();
		panel.setName("0");
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				logica.analizarBotonPulsado(botonPulsado);
				//String aux = botonPulsado.getName();
				//System.out.println("El botón pulsado es: " +aux);
				
			}
		});
		panel.setBackground(new Color(192, 192, 192));
		
		JPanel panel_1 = new JPanel();
		panel_1.setName("1");
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_1.setBackground(new Color(192, 192, 192));
		
		JPanel panel_2 = new JPanel();
		panel_2.setName("2");
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_2.setBackground(Color.LIGHT_GRAY);
		
		JLabel label = new JLabel("2");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setName(",");
		panel_3.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_2 = new JLabel(",");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(label_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setName("3");
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_4.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_1 = new JLabel("3");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(label_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(label_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setName("4");
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_5.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_6 = new JLabel("4");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setName("7");
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_6.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_7 = new JLabel("7");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setName("AC");
		panel_7.setBackground(new Color(128, 128, 128));
		
		JPanel panel_8 = new JPanel();
		panel_8.setName("5");
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_8.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_5 = new JLabel("5");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addComponent(label_5, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_8.setLayout(gl_panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setName("8");
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_9.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_8 = new JLabel("8");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addComponent(label_8, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addComponent(label_8, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setName("+-");
		panel_10.setBackground(new Color(128, 128, 128));
		
		JLabel label_12 = new JLabel("+-");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addComponent(label_12, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addComponent(label_12, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_10.setLayout(gl_panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setName("%");
		panel_11.setBackground(new Color(128, 128, 128));
		
		JLabel label_14 = new JLabel("%");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addComponent(label_14, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addComponent(label_14, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_11.setLayout(gl_panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setName("9");
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_12.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_9 = new JLabel("9");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel_12.setLayout(gl_panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setName("6");
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel botonPulsado = (JPanel) e.getSource();
				String aux = botonPulsado.getName();
				System.out.println("El botón pulsado es: " +aux);
			}
		});
		panel_13.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_4 = new JLabel("6");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addComponent(label_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addComponent(label_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setName("=");
		panel_14.setBackground(new Color(255, 165, 0));
		
		JLabel label_3 = new JLabel("=");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addComponent(label_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel_14.setLayout(gl_panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setName("+");
		panel_15.setBackground(new Color(255, 165, 0));
		
		JLabel label_10 = new JLabel("+");
		label_10.setForeground(new Color(255, 255, 255));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addComponent(label_10, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addComponent(label_10, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_15.setLayout(gl_panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setName("-");
		panel_16.setBackground(new Color(255, 165, 0));
		
		JLabel label_11 = new JLabel("-");
		label_11.setForeground(new Color(255, 255, 255));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_16 = new GroupLayout(panel_16);
		gl_panel_16.setHorizontalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_16.setVerticalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addComponent(label_11, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_16.setLayout(gl_panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setName("x");
		panel_17.setBackground(new Color(255, 165, 0));
		
		JLabel lblX = new JLabel("x");
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addComponent(lblX, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addComponent(lblX, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_17.setLayout(gl_panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setName("/");
		panel_18.setBackground(new Color(255, 165, 0));
		
		JLabel label_13 = new JLabel("/");
		label_13.setForeground(new Color(255, 255, 255));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Verdana", Font.BOLD, 30));
		GroupLayout gl_panel_18 = new GroupLayout(panel_18);
		gl_panel_18.setHorizontalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addComponent(label_13, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
		);
		gl_panel_18.setVerticalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addComponent(label_13, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		panel_18.setLayout(gl_panel_18);
		
		JLabel lblNewLabel_2 = new JLabel("AC");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel_7.setLayout(gl_panel_7);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setName("0");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JLabel txtPantalla = new JLabel("");
		txtPantalla.setFont(new Font("Verdana", Font.PLAIN, 35));
		txtPantalla.setName("txtPantalla");
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setForeground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtPantalla, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtPantalla, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	
	}
}
