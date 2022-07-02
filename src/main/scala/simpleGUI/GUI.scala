package simpleGUI

import scala.swing.BorderPanel.Position._
import scala.swing._

object GUI extends SimpleSwingApplication {

  def top: MainFrame = new MainFrame {

    val grid_panel2: GridPanel = new GridPanel(1,3){

      contents += new ToggleButton { text = "Draw" }
      contents += new ToggleButton { text = "Simplify" }
      contents += new ToggleButton { text = "Derivate" }

    }

    val flow_panel: FlowPanel = new FlowPanel(){

      contents += new Label {
        text = "f(x) = "
      }

      contents += new TextField {
        text = "Write your equation here"
      }

    }
    val grid_panel: GridPanel = new GridPanel(2,1){
      contents += flow_panel
      contents += grid_panel2
    }

    contents = new BorderPanel{
      layout(new FunctionCanvas {
        preferredSize = new Dimension(200, 200)
      }) = Center
      layout(grid_panel) = South
    }

    menuBar = new MenuBar {
      contents += new Menu("File") {
        contents += new MenuItem(Action("Exit") {
          sys.exit(0)
        })
      }
    }
  }
}