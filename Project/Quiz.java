//21


import processing.core.*;
import java.util.*;



public class Quiz implements Scene
{
    public Quiz(Game p)
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
      p.rect(p.width/4 - 150, p.height*3/4 -40, 300, 50);
      p.rect(p.width/2 - 150, p.height*3/4 -40, 300, 50);
      p.rect(p.width*3/4 - 150, p.height*3/4 -40, 300, 50);

      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(40);
      p.text("What if statement would check for a number (x)", p.width/2, 150);
      p.text("divisible by 3 and greater than 6?", p.width/2, 200);
      p.textSize(27);
      p.fill(0);
      p.text("x %3 == 0 && x == 6", p.width/4, p.height*3/4 );
      p.text("x >=6 || x %3 == 0", p.width/2, p.height*3/4 );
      p.text("x %3 == 0 && x > 6", p.width*3/4, p.height*3/4 );

    }
    
    

    public void handleKeyPressed()
    {


        }
        
        
        //incorrect
        public void handleMousePressed(){
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 150 && p.mouseX < p.width/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeScene(22);
        
        }
        
        //incorrect
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 150 && p.mouseX < p.width/2 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeScene(22);
        
        }
      
      //correct
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 150 && p.mouseX < p.width*3/4 + 150
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
        p.changeScene(23);
        
        }
        
      
      
    }
    
        
    private Game p;
   
}


