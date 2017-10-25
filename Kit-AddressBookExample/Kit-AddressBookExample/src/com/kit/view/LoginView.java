package com.kit.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.kit.controller.LoginController;
import com.kit.models.User;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JPasswordField;

public class LoginView {

	private JFrame frame;
	private JTextField txt_kullaniciAdi;
	private JPasswordField txt_parola;
	User user = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_kullaniciAdi = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lbl_kullaniciAdi.setFont(new Font("Calibri", Font.BOLD, 20));
		lbl_kullaniciAdi.setBounds(85, 180, 127, 42);
		frame.getContentPane().add(lbl_kullaniciAdi);
		
		JLabel lbl_parola = new JLabel("Parola :");
		lbl_parola.setFont(new Font("Calibri", Font.BOLD, 20));
		lbl_parola.setBounds(85, 251, 127, 42);
		frame.getContentPane().add(lbl_parola);
		
		txt_kullaniciAdi = new JTextField();
		txt_kullaniciAdi.setBounds(224, 184, 148, 34);
		frame.getContentPane().add(txt_kullaniciAdi);
		txt_kullaniciAdi.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kgb20\\Desktop\\karnova.jpg"));
		lblNewLabel.setBounds(148, 52, 184, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_giris = new JButton("Giri\u015F");
		btn_giris.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String kullaniciAdi = txt_kullaniciAdi.getText();
				String parola = String.valueOf(txt_parola.getPassword());
				
				user.setUsername(kullaniciAdi);
				user.setPassword(parola);
				
				try {
//					girisKontrol(kullaniciAdi, parola);
					girisKontrol(user);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btn_giris.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_giris.setBounds(133, 318, 111, 42);
		frame.getContentPane().add(btn_giris);
		
		JButton btn_yeniKayit = new JButton("\u00DCye Ol");
		btn_yeniKayit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new YeniKayitView().main(null);
			}
		});
		btn_yeniKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_yeniKayit.setBounds(261, 318, 111, 42);
		frame.getContentPane().add(btn_yeniKayit);
		
		txt_parola = new JPasswordField();
		txt_parola.setBounds(224, 249, 148, 34);
		frame.getContentPane().add(txt_parola);
	}
	
//	public void girisKontrol(String kullaniciAdi, String parola) throws ClassNotFoundException, SQLException{
	public void girisKontrol(User user) throws ClassNotFoundException, SQLException{

		new LoginController().girisKontrol(user);
		
	}
	
}
