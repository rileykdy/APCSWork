//13
//Post minigame win did you have fun?

import processing.core.*;
import java.util.*;



public class funChoice implements Scene
{
    public funChoice(Game p)
    {
        this.p = p;
    }

    public void display()
    {
     p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(255);
      p.stroke(13, 168, 42);
      p.rect(p.width/4 - 150, p.height*3/4 -40, 300, 50);
      p.stroke(181, 20, 14);
      p.rect(p.width*3/4 - 150, p.height*3/4 -40, 300, 50);

      p.fill(0);
      p.textSize(45);
      p.text("Nice job! Did you like the minigame?", p.width/2, 200);
      p.textSize(40);
      p.text("Yes, I loved it!", p.width/4, p.height*3/4 );
      p.text("No, it sucked.", p.width*3/4, p.height*3/4 );


    }
    
    

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
         
    //if yes
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 150 && p.mouseX < p.width/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        

        p.changeScene(14);
        
        }
      
      //if no
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 150 && p.mouseX < p.width*3/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeScene(15);
        
        }
    }
    
        
    private Game p;
   
}

