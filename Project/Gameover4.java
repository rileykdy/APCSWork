//12
//failed minigame ONE

import processing.core.*;
import java.util.*;
  


public class Gameover4 implements Scene
{
    public Gameover4(Game p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      p.textAlign(PApplet.CENTER);
    if (p.getF() > 0){
    p.textFont(p.getFont(), 1);
    p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
    }
    else;
      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 150);
      p.textSize(40);
      p.text("I don't expect anyone to see this screen.", p.width/2, 300);
      p.text("I made the minigame easy on purpose.", p.width/2, 350);
      p.textSize(15);
      p.text("Press shift to restart or tab to return to the game", p.width/2, 500);
      
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
      }
      
      
if(p.keyCode == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(11);
      }
    }
    
    public void handleMousePressed(){
    
    }
    

    private Game p;
}

