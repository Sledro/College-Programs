/**
 * Title: BasicFrame.java
 * Description: My first basic AWT (Windows Programming) frame.
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class BasicFrame extends Frame{
  public BasicFrame(){
         setSize(200, 150);
         setTitle("This is My Frame");
         setBackground(Color.lightGray);
         addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
           System.exit(0);}});
  }
}
