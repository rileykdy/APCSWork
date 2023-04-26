//20
//failed 2nd code explanation

import processing.core.*;
import java.util.*;
  


public class Gameover6 implements Scene
{
    public Gameover6(Game p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      p.textAlign(PApplet.CENTER);
      p.fill(0);
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 200);
      p.textSize(40);
      p.text("I give up. You can skip this part I guess.", p.width/2, 300);
      p.textSize(15);
      p.text("Press shift to restart, tab to return to the last choice, or control to skip the question.", p.width/2, 500);
      
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
      }
      
      
if(p.keyCode == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(19);
      }
      
if(p.keyCode == PApplet.CONTROL){
        p.key = PApplet.ENTER;
        p.changeScene(23);
      }
    }
    
    public void handleMousePressed(){
    
    }
    

    private Game p;
}

