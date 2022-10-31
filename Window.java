package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Window extends JFrame implements ActionListener {
  JButton button;
  JPanel panel;
  Window() {

    button = new JButton("select image");
    button.setBounds(200,300,150,30);
    button.addActionListener(this);

    this.setTitle("Niblock suk");
    this.setLayout(null);
    this.setSize(420,420);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(button);
    this.add(panel);

  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button){
          JFileChooser fileChooser = new JFileChooser();
          int ret = fileChooser.showOpenDialog(null);
           if (ret == JFileChooser.APPROVE_OPTION) {
             File file = fileChooser.getSelectedFile();

             BufferedImage image = ImageIO.read(file);
           }


    }

  }


}

