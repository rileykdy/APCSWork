//16
//Change font or change background color?

import processing.core.*;
import java.util.*;



public class workChoice implements Scene
{
    public workChoice(Game p)
    {
        this.p = p;
    }

    public void display()
    {
     p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(255);
      p.stroke(51, 119, 196);
      p.rect(p.width/4 - 150, p.height*3/4 -40, 300, 50);
      p.stroke(171, 51, 163);
      p.rect(p.width*3/4 - 150, p.height*3/4 -40, 300, 50);

      p.fill(0);
      p.textSize(45);
      p.text("What part of the game do you want to improve?", p.width/2, 200);
      p.textSize(40);
      p.text("Font", p.width/4, p.height*3/4 );
      p.text("Background color", p.width*3/4, p.height*3/4 );


    }
    
    

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
         
    //if Font
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 150 && p.mouseX < p.width/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        

        p.changeScene(4);
        
        }
      
      //if Background color
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 150 && p.mouseX < p.width*3/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeScene(17);
        
        }
    }
    
        
    private Game p;
   
}

