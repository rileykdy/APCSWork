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
      p.fill(255);
      p.stroke(82, 140, 222);
      p.rect(p.width/2 - 325, 550 -40, 650, 60);
      p.rect(p.width/2 - 325, 650 -40, 650, 60);
      p.rect(p.width/2 - 325, 750 -40, 650, 60);

      p.fill(0);
      p.textSize(40);
      p.text("Nice job on the coding question! Would you like to play a minigame?", p.width/2, 200);
      p.textSize(35);
      p.text("No, I want to keep working on the game.", p.width/2, 550 );
      p.text("Yes, that sounds fun!", p.width/2, 650 );
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
        
        
        p.changeScene(4);
        
        }
        
        //yes
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 325 && p.mouseX < p.width/2 + 325
      && p.mouseY > 650 -40 && p.mouseY < 650 +40){
        
        
        p.changeScene(4);
        
        }
      
      //no mean
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 325 && p.mouseX < p.width/2 + 325
      && p.mouseY > 750 -40 && p.mouseY < 750 +40){
        
        
        p.changeScene(4);
        
        }
        
      
      
    }
    
        
    private Game p;
   
}
