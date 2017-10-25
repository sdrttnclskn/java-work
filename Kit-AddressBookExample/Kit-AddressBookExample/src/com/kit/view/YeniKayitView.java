package com.kit.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;

import com.kit.controller.KayitController;
import com.kit.models.User;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class YeniKayitView {

	private JFrame frame;
	private JTextField txt_kullaniciAdi;
	private JPasswordField txt_password;
	private JPasswordField txt_password2;
	User user = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YeniKayitView window = new YeniKayitView();
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
	public YeniKayitView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_YeniKaytEkran = new JLabel("Yeni Kay\u0131t Ekran\u0131");
		lbl_YeniKaytEkran.setBackground(Color.ORANGE);
		lbl_YeniKaytEkran.setFont(new Font("Calibri", Font.BOLD, 20));
		lbl_YeniKaytEkran.setBounds(73, 30, 153, 32);
		frame.getContentPane().add(lbl_YeniKaytEkran);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblKullancAd.setFont(new Font("Calibri", Font.BOLD, 16));
		lblKullancAd.setBounds(13, 106, 103, 32);
		frame.getContentPane().add(lblKullancAd);
		
		JLabel lblParola = new JLabel("Parola :");
		lblParola.setFont(new Font("Calibri", Font.BOLD, 16));
		lblParola.setBounds(13, 165, 103, 32);
		frame.getContentPane().add(lblParola);
		
		txt_kullaniciAdi = new JTextField();
		txt_kullaniciAdi.setBounds(128, 106, 130, 28);
		frame.getContentPane().add(txt_kullaniciAdi);
		txt_kullaniciAdi.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(127, 161, 131, 32);
		frame.getContentPane().add(txt_password);
		
		JLabel lblParolatekrar = new JLabel("Parola (Tekrar):");
		lblParolatekrar.setFont(new Font("Calibri", Font.BOLD, 16));
		lblParolatekrar.setBounds(13, 226, 114, 32);
		frame.getContentPane().add(lblParolatekrar);
		
		txt_password2 = new JPasswordField();
		txt_password2.setBounds(127, 222, 131, 32);
		frame.getContentPane().add(txt_password2);
		
		JButton btn_kaydet = new JButton("Kaydet");
		btn_kaydet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String kullaniciAdi = txt_kullaniciAdi.getText();
				char[] password1 = txt_password.getPassword();
				char[] password2 = txt_password2.getPassword();
				
				try {
					kayitKontrol(kullaniciAdi, password1, password2);
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btn_kaydet.setBounds(56, 283, 97, 25);
		frame.getContentPane().add(btn_kaydet);
		
		JButton btn_iptal = new JButton("\u0130ptal");
		btn_iptal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				kayitIptal();
			}

		});
		btn_iptal.setBounds(161, 283, 97, 25);
		frame.getContentPane().add(btn_iptal);
	}
	

	public void kayitKontrol(String kullaniciAdi, char[] password1, char[] password2) throws ClassNotFoundException, SQLException {
		
		boolean result = new KayitController().kayitKontrol(kullaniciAdi,password1,password2);
		
		if(result){
			frame.dispose();
			JOptionPane.showMessageDialog(null, kullaniciAdi+ " kaydý baþarýlý!");
		}else {
			JOptionPane.showMessageDialog(null, "Parolalar uyumsuz!");
		}
		
	}
	
	private void kayitIptal() {
		this.frame.dispose();
	}
}
