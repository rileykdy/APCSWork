//14
//Thanks for liking the game

import processing.core.*;
import java.util.*;



public class minigameThanks implements Scene
{
    public minigameThanks(Game p)
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
      p.text("Thanks! I'm glad you enjoyed the minigame.", p.width/2, 130);
      p.text("The code for that took longer than I'd care to admit." , p.width/2, 180);
      p.textSize(25);
      p.text("Press shift to continue.", p.width/2, 700);
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(18);
       
      }
      }
      
      public void handleMousePressed(){
    
    }
    

    private Game p;
}
