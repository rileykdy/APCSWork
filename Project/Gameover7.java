//22
//incorrect coding question answer

import processing.core.*;
import java.util.*;
  


public class Gameover7 implements Scene
{
    public Gameover7(Game p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(0);
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 150);
      p.textSize(40);
      p.text("Oh come on. I explained it twice.", p.width/2, 300);
      p.textSize(15);
      p.text("Press shift to restart or tab to return to the last choice", p.width/2, 700);
      
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
      }
      
      
if(p.keyCode == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(21);
      }
    }
    
    public void handleMousePressed(){
    
    }
    

    private Game p;
}

