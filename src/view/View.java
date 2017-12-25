package view;

import java.awt.BorderLayout;
 
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
public class View {
 
	
 // View uses Swing framework to display UI to user
 private JFrame frame;
 private JLabel emailLabel;
 private JLabel passwortLabel;
 private JTextField emailTextfield;
 private JTextField passwortTextfield;
 private JButton verifyLoginButton;
 private JButton end;
 
 public View(String title) {
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
 
 public JLabel getemailLabel() {
  return emailLabel;
 }
 
 public void setemailLabel(JLabel emailLabel) {
  this.emailLabel = emailLabel;
 }
 
 public JLabel getpasswortLabel() {
  return passwortLabel;
 }
 
 public void setpasswortLabel(JLabel passwortLabel) {
  this.passwortLabel = passwortLabel;
 }
 
 public JTextField getemailTextfield() {
  return emailTextfield;
 }
 
 public void setemailTextfield(JTextField emailTextfield) {
  this.emailTextfield = emailTextfield;
 }
 
 public JTextField getpasswortTextfield() {
  return passwortTextfield;
 }
 
 public void setpasswortTextfield(JTextField passwortTextfield) {
  this.passwortTextfield = passwortTextfield;
 }
 
 public JButton getverifyLoginButton() {
  return verifyLoginButton;
 }
 
 public void setverifyLoginButton(JButton verifyLoginButton) {
  this.verifyLoginButton = verifyLoginButton;
 }
 
 
 public JButton getend() {
  return end;
 }
 
 public void setend(JButton end) {
  this.end = end;
 }
 
}