package view;

import java.awt.BorderLayout;
 
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
public class LoginView {
 
	
 // View uses Swing framework to display UI to user
 private JFrame frame;
 private JLabel emailLabel;
 private JLabel passwortLabel;
 private JTextField emailTextfield;
 private JTextField passwortTextfield;
 private JButton verifyLoginButton;
 private JButton end;
 
 public LoginView(String title) {
  frame = new JFrame(title);
  frame.getContentPane().setLayout(new BorderLayout());
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 120);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 
  // Create UI elements
  emailLabel = new JLabel("E-Mail :");
  passwortLabel = new JLabel("Passwort :");
  emailTextfield = new JTextField();
  passwortTextfield = new JTextField();
  verifyLoginButton = new JButton("Einloggen");
  end = new JButton("Beenden!");
 
  // Add UI element to frame
  GroupLayout layout = new GroupLayout(frame.getContentPane());
  layout.setAutoCreateGaps(true);
  layout.setAutoCreateContainerGaps(true);
  layout.setHorizontalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(emailLabel)
    .addComponent(passwortLabel))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(emailTextfield)
    .addComponent(passwortTextfield))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(verifyLoginButton).addComponent(end)));
  layout.setVerticalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(emailLabel)
    .addComponent(emailTextfield).addComponent(verifyLoginButton))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(passwortLabel)
    .addComponent(passwortTextfield).addComponent(end)));
 
  layout.linkSize(SwingConstants.HORIZONTAL, verifyLoginButton);
  layout.linkSize(SwingConstants.HORIZONTAL, end);
  frame.getContentPane().setLayout(layout);
 }
 
 public JFrame getFrame() {
  return frame;
 }
 
 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
 
 public JLabel getEmailLabel() {
  return emailLabel;
 }
 
 public void setEmailLabel(JLabel emailLabel) {
  this.emailLabel = emailLabel;
 }
 
 public JLabel getPasswortLabel() {
  return passwortLabel;
 }
 
 public void setPasswortLabel(JLabel passwortLabel) {
  this.passwortLabel = passwortLabel;
 }
 
 public JTextField getEmailTextfield() {
  return emailTextfield;
 }
 
 public void setEmailTextfield(JTextField emailTextfield) {
  this.emailTextfield = emailTextfield;
 }
 
 public JTextField getPasswortTextfield() {
  return passwortTextfield;
 }
 
 public void setPasswortTextfield(JTextField passwortTextfield) {
  this.passwortTextfield = passwortTextfield;
 }
 
 public JButton getVerifyLoginButton() {
  return verifyLoginButton;
 }
 
 public void setVerifyLoginButton(JButton verifyLoginButton) {
  this.verifyLoginButton = verifyLoginButton;
 }
 
 
 public JButton getEnd() {
  return end;
 }
 
 public void setEnd(JButton end) {
  this.end = end;
 }
 
}