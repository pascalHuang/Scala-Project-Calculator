package simpleGUI

import scala.swing.Panel
import java.awt.{ Graphics2D, Color }

class FunctionCanvas extends Panel {

  var function: Int => Int = (i : Int) => i*i

  override def paintComponent(g: Graphics2D): Unit = {

    // Start by erasing this Canvas
    g.clearRect(0, 0, size.width, size.height)

    // Draw background here
    g.setColor(Color.black)

    g.drawLine(0, 100, 200, 100)
    g.drawLine(100, 0, 100, 200)

    g.setColor(Color.blue)

    var old = function(-100)

    for (i <- -100 to 200){
      g.drawLine((i-1)+100, 100-old, i+100, 100-function(i))
      old = function(i)

    }
  }
}