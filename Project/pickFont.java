//26
//Font change 

import processing.core.*;
import java.util.*;



public class pickFont implements Scene
{
    public pickFont(Game p)
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
      p.stroke(51, 119, 196);
      p.rect(p.width/4 - 150, p.height*3/4 -40, 300, 50);
      p.stroke(171, 51, 163);
      p.rect(p.width*3/4 - 150, p.height*3/4 -40, 300, 50);

      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(45);
      
      p.text("What do you think of this font?", p.width/2, 200);
      p.textSize(25);
      p.fill(0);
      p.text("I love it!", p.width/4, p.height*3/4 );
      p.text("Return to the old font.", p.width*3/4, p.height*3/4 );
     
      


    }
    
     public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
         
    //if keep
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 150 && p.mouseX < p.width/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        

        p.changeF(1);
        p.changeScene(18);
        }
      
      //if return
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 150 && p.mouseX < p.width*3/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeF(1);
        p.changeScene(29);
        
        }
    }
    
        
    private Game p;
   
}


    
    
    