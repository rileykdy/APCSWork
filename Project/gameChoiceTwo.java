//23
//MINIGAME choice TWO


import processing.core.*;
import java.util.*;



public class gameChoiceTwo implements Scene
{
    public gameChoiceTwo(Game p)
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
      p.fill(255);
      p.stroke(82, 140, 222);
      p.rect(p.width/2 - 325, 550 -40, 650, 60);
     
      p.rect(p.width/2 - 325, 750 -40, 650, 60);

      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(35);
      p.text("Nice job on the coding question! Would you like to play a minigame?", p.width/2, 200);
      p.textSize(27);
      p.text("No, I want to keep working on the game.", p.width/2, 550 );
      
      p.text("No, it'll probably suck like the last one.", p.width/2, 750 );

    }
    
    

    public void handleKeyPressed()
    {


        }
        
        
        //no polite
        public void handleMousePressed(){
    if(p.mousePressed==true
      && p.mouseX > p.width/2 - 325 && p.mouseX < p.width/2 + 325
      && p.mouseY > 550 -40 && p.mouseY < 550 +40){
        
        
        p.changeScene(25);
        
        }
        
        
      
      //no mean
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 325 && p.mouseX < p.width/2 + 325
      && p.mouseY > 750 -40 && p.mouseY < 750 +40){
        
        
        p.changeScene(24);
        
        }
        
      
      
    }
    
        
    private Game p;
   
}
