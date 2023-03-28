/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supplierinformation;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.RIGHT_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author 27672
 */
public class SupplierGUI extends JFrame implements ActionListener{
    
    private JPanel panelTop,panelCentre,panelBottom;
    private ImageIcon icon;
    private JLabel lblImage;
    private JLabel lblImageHeader;
    
    private JLabel lblSupplierId;
    private JTextField txtSupplierId;
    
    private JLabel lblCompanyName;
    private JTextField txtCompanyName;
    
    private JLabel lblContactName;
    private JTextField txtContactName;
    
    private JLabel lblContactTitle;
    private JTextField txtContactTitle;
    
    private JLabel lblAddress;
    private JTextField txtAddress;
    
    private JLabel lblCity;
    private JTextField txtCity;
    
    private JLabel lblRegion;
    private JTextField txtRegion;
    
    private JLabel lblPostalCode;
    private JTextField txtPostalCode;
    
    private JLabel lblCountry;
    private JTextField txtCountry;
    
    private JLabel lblPhone;
    private JTextField txtPhone;
    
    private JLabel lblFax;
    private JTextField txtFax;
    
    private JLabel lblHomepage;
    private JTextField txtHomepage; 
    
    
    private JButton btnUpdate;
    private JButton btnReset;
    private JButton btnDelete;
    private JButton btnExit;
  
    private Font ft1,ft2;
    
    final String imageUrl = "supplier.png";
    
    public SupplierGUI(){
    super("Supplier");
    
    
    ft1 = new Font("Arial", Font.BOLD, 18);
    ft2 = new Font("Arial", Font.PLAIN, 12);
    panelTop = new JPanel();
    panelCentre = new JPanel();
    panelBottom = new JPanel();
    
    icon = new ImageIcon(imageUrl);
    lblImage = new JLabel(icon);
    lblImage.setHorizontalAlignment(SwingConstants.RIGHT);
    lblImageHeader = new JLabel("Supplier Information");
    lblImageHeader.setFont(ft1);
    lblImageHeader.setForeground(Color.yellow);
      
    lblSupplierId = new JLabel("Supplier Id: ");
    txtSupplierId = new JTextField(15);
    lblSupplierId.setFont(ft2);
    
    lblCompanyName = new JLabel("Company Name: ");
    txtCompanyName = new JTextField(15);
    lblCompanyName.setFont(ft2);
    
    lblContactName = new JLabel("Contact Name: ");
    txtContactName = new JTextField(15);
    lblContactName.setFont(ft2);
    
    lblContactTitle = new JLabel("Contact Title: ");
    txtContactTitle = new JTextField(15);
    lblContactTitle.setFont(ft2);
    
    lblAddress = new JLabel("Address: ");
    txtAddress = new JTextField(15);
    lblAddress.setFont(ft2);
    
    lblCity = new JLabel("City: ");
    txtCity = new JTextField(15);
    lblCity.setFont(ft2);
    
    lblRegion = new JLabel("Region: ");
    txtRegion = new JTextField(15);
    lblRegion.setFont(ft2);
    
    lblPostalCode = new JLabel("Postal code: ");
    txtPostalCode = new JTextField(15);
    lblPostalCode.setFont(ft2);
    
    lblCountry = new JLabel("Country: ");
    txtCountry = new JTextField(15);
    lblCountry.setFont(ft2);
    
    lblPhone = new JLabel("Phone: ");
    txtPhone = new JTextField(15);
    lblPhone.setFont(ft2);
    
    lblFax = new JLabel("Fax: ");
    txtFax = new JTextField(15);
    lblFax.setFont(ft2);
    
    lblHomepage = new JLabel("Homepage: ");
    txtHomepage = new JTextField(15);
    lblHomepage.setFont(ft2);
    
    
    btnUpdate = new JButton("Update");
    btnUpdate.setEnabled(false);
    btnReset = new JButton("Reset");
    btnReset.setEnabled(false);
    btnDelete = new JButton("Delete");
    btnDelete.setEnabled(false);
    btnExit = new JButton("Exit");
}   
    
    public void setGUI(){
        panelTop.setLayout(new GridLayout(1, 2));
        panelCentre.setLayout(new GridLayout(12, 2));
        panelBottom.setLayout(new GridLayout(1, 4));
        
        panelTop.add(lblImage);
        panelTop.add(lblImageHeader);
        
        panelCentre.add(lblSupplierId);
        panelCentre.add(txtSupplierId);
        
        panelCentre.add(lblCompanyName);
        panelCentre.add(txtCompanyName);
        
        panelCentre.add(lblContactName);
        panelCentre.add(txtContactName);
        
        panelCentre.add(lblContactTitle);
        panelCentre.add(txtContactTitle);
        
        panelCentre.add(lblAddress);
        panelCentre.add(txtAddress);
        
        panelCentre.add(lblCity);
        panelCentre.add(txtCity);
        
        panelCentre.add(lblRegion);
        panelCentre.add(txtRegion);
        
        panelCentre.add(lblPostalCode);
        panelCentre.add(txtPostalCode);
        
        panelCentre.add(lblCountry);
        panelCentre.add(txtCountry);
        
        panelCentre.add(lblPhone);
        panelCentre.add(txtPhone);
        
        panelCentre.add(lblFax);
        panelCentre.add(txtFax);
        
        panelCentre.add(lblHomepage);
        panelCentre.add(txtHomepage);
        
        panelBottom.add(btnUpdate);
        panelBottom.add(btnReset);
        panelBottom.add(btnDelete);
        panelBottom.add(btnExit);
        
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnDelete.addActionListener(this);
        btnExit.addActionListener(this);
        txtSupplierId.addActionListener(this);
        
        this.panelTop.setBackground(Color.blue);
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelCentre, BorderLayout.CENTER);
        this.add(panelBottom, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(600, 400));
        panelTop.setPreferredSize(new Dimension(300, 100));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);     
    }
    
    public void resetForm(){
        txtSupplierId.setText(null);
        txtCompanyName.setText(null);
        txtContactName.setText(null);
        txtContactTitle.setText(null);
        txtAddress.setText(null);
        txtCity.setText(null);
        txtRegion.setText(null);
        txtPostalCode.setText(null);
        txtCountry.setText(null);
        txtPhone.setText(null);
        txtFax.setText(null);
        txtHomepage.setText(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnUpdate){
            SupplierPOJO s = new SupplierPOJO(txtSupplierId.getText(),txtCompanyName.getText(),txtContactName.getText(),txtContactTitle.getText(),txtAddress.getText()
                             , txtCity.getText(), txtRegion.getText(), txtPostalCode.getText(),
                             txtCountry.getText(),txtPhone.getText(),txtFax.getText(), txtHomepage.getText());
    
                
               
        }else if(e.getSource() ==  btnDelete){
            SupplierPOJO s = new SupplierPOJO(txtSupplierId.getText(),txtCompanyName.getText(),txtContactName.getText(),txtContactTitle.getText(),txtAddress.getText()
                             , txtCity.getText(), txtRegion.getText(), txtPostalCode.getText(),
                             txtCountry.getText(),txtPhone.getText(),txtFax.getText(), txtHomepage.getText());
            SupplierDAO.delete(s);
        }else if(e.getSource() == btnReset){
            resetForm();
        }else if(e.getSource() == btnExit){
            System.exit(0);
            }
        else if(e.getSource() == txtSupplierId && txtSupplierId != null){
            SupplierPOJO s = new SupplierPOJO(txtSupplierId.getText(),txtCompanyName.getText(),txtContactName.getText(),txtContactTitle.getText(),txtAddress.getText()
                             , txtCity.getText(), txtRegion.getText(), txtPostalCode.getText(),
                             txtCountry.getText(),txtPhone.getText(),txtFax.getText(), txtHomepage.getText());
            SupplierDAO.populateSupplier(s);
            
        }
    
    }

}

    

