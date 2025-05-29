package javaapplication3;
import java.awt.*;
import java.awt.event.*;

 class JavaAWTProgram extends Frame implements ActionListener {

    Button btn;
        JavaAWTProgram () {
        btn = new Button("Click Me");
        btn.setBounds(100, 100, 80, 30);
        btn.addActionListener(this); // Step 4: register listener

        add(btn); // Add button to frame
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    // Step 5: override actionPerformed
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }
}
public class JavaApplication3 {


    public static void main(String[] args) {
        
       new JavaAWTProgram (); // Run the program


        
    }
    
}
