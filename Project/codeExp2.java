//19
//Coding explanation TWO

import processing.core.*;
import java.util.*;



public class codeExp2 implements Scene
{
    public codeExp2(Game p)
    {
        this.p = p;
    }

    public void display()
    {
       p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(0);
      p.textSize(40);
      p.text("An if statement can be broken down into different conditions, for example, 'x == 10';", p.width/2, 120);
      p.text("These different conditions are connected by symbols to add criteria to an if statement.", p.width/2, 175);
      p.text("Such symbols include '||' which means 'or' and '&&' which means 'and'.", p.width/2, 240);
      p.text("if(x == 7 || x == 12) means that in order to fulfill the if statement x must be 7 or 12.", p.width/2, 295);
      p.text("if(x %3 == 0 && x %5 == 0) means that in order to fulfill the if statement.", p.width/2, 360);
      p.text("x must be divisible by both 3 and 5", p.width/2, 415);
      p.text("The symbol '!' means 'not'.", p.width/2, 480);
      p.text("Always use two equals signs when noting equality in if statements.", p.width/2, 535);
      
      p.text("Do you understand this explanation?", p.width/2, 640);
        
      
      p.fill(255);
      p.stroke(13, 168, 42);
      p.rect(p.width/4 - 55, 750 -40, 110, 50);
      p.stroke(181, 20, 14);
      p.rect(p.width*3/4 - 55, 750 -40, 110, 50);
      
      
      
      p.textSize(50);
      p.fill(0);
      p.text("YES!", p.width/4, 750 );
      p.text("NO!", p.width*3/4, 750 );
      
      
    }

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
        
    //if yes
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 55 && p.mouseX < p.width/4 + 55
      && p.mouseY > 750 -40 && p.mouseY < 750 +40){
        
        
        p.changeScene(21);
        
        }
      
      //if no
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 55 && p.mouseX < p.width*3/4 + 55
      && p.mouseY > 750 -40 && p.mouseY < 750 +40){
        
        
        p.changeScene(20);
        
        }
    }
    
    

    private Game p;
}
