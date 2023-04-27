//24
//Return to minigame 1

import processing.core.*;
import java.util.*;



public class miniReturn implements Scene
{
    public miniReturn(Game p)
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
      p.textSize(40);
      p.text("Well if you hated the minigame that much maybe", p.width/2, 130);
      p.text("you should play again and reconsider." , p.width/2, 180);
      p.textSize(25);
      p.text("Press shift to return to the minigame.", p.width/2, 700);
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(11);
       
      }
      }
      
      public void handleMousePressed(){
    
    }
    

    private Game p;
}
