import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;

public class ShowIt extends Basic
{
  private static double total = 0;

  public static void main(String[] args)
  {
    // do a bunch of work starting from here
    // (simulated by a very costly loop)
    for( long k=1; k<1000000000; k++ )
      total += k*k;

    // construct a ShowIt instance using a window that
    // is 600 pixels wide by 600 pixels high
    ShowIt a = new ShowIt("ShowIt Camera", 0, 0, 600, 600);
  }

  public ShowIt( String title, int ulx, int uly, int pw, int ph )
  {
    super(title,ulx,uly,pw,ph);

    // make the background color in the window
    // light blue
    setBackgroundColor( new Color( 128, 128, 200 ) );

    // create a camera in the 600 by 600 window that
    // has a drawing area shifted to the right 25 pixels,
    // down 25 pixels, and is 550 pixels wide by 550 pixels high,
    // with the virtual graph paper in which drawing is done
    // having its left bound 0, its right bound 100,
    // its bottom bound 0, and its top bound set (at 100, actually)
    // so that the drawing area will have the same proportions
    // as the pixel rectangle (square, in this case)
    // with background color of the drawing area set to white
    cameras.add( new Camera( 25, 25, 550, 550,
                             0, 100, 0,
                             Color.white ) );

    //------------------------------------------------------------------
    // start up the animation:
    super.start();
  }

  public synchronized void step()
  {
    System.out.println( getStepNumber() );

      Camera cam = cameras.get(0);
      // change background color to be gray
      cam.setBackgroundColor( new Color( 200, 200, 200 ) );
      cam.activate();

      // for sake of this example, print the total:
      cam.setColor( Color.black );
      // draw the string with lower left corner at (10,70)
      // on the virtual graph paper
      cam.drawText( "Total: " + total, 10, 70 );

      cam.setColor( Color.red );
      // draw a filled rectangle with lower left corner at (0,0)
      // with width 10 and height 20
      cam.fillRect( 0, 0, 10, 20 );

      cam.setColor( Color.blue );
      cam.fillRect( 50, 50, 20, 10 );

      cam.setColor( new Color( 255, 128, 0 ) );
      cam.fillRect( 80, 20, 10, 10 );
      cam.fillRect( 20, 80, 10, 10 );

  }

}
