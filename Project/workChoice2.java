//25
//return to font/background change or change text color

import processing.core.*;
import java.util.*;



public class workChoice2 implements Scene
{
    public workChoice2(Game p)
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
      p.text("What part of the game do you want to work on?", p.width/2, 200);
      p.textSize(35);
      p.fill(0);
      p.text("Font/Background", p.width/4, p.height*3/4 );
      p.text("Text Color", p.width*3/4, p.height*3/4 );

 
    }
     public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
         
    //if Font/background
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 150 && p.mouseX < p.width/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        

        p.changeScene(16);
        
        }
      
      //if text color
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 150 && p.mouseX < p.width*3/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeScene(27);
        
        }
    }
    
        
    private Game p;
   
}

