//18
//Coding question explanation

import processing.core.*;
import java.util.*;



public class codeExp implements Scene
{
    public codeExp(Game p)
    {
        this.p = p;
    }

    public void display()
    {
       p.background(p.getColor1(), p.getColor2(), p.getColor3());
      p.textAlign(PApplet.CENTER);
      p.fill(0);
      p.textSize(45);
      p.text("This game wouldn't really be about making a game if I didn't force you to ", p.width/2, 120);
      p.text("learn something about coding, would it?", p.width/2, 175);
      p.text("This is an if statement that checks if a given number is equal to 7 or 12.", p.width/2, 240);
      p.text("if(number == 7 || number == 12)", p.width/2, 295);
      p.text("This is an if statement that checks if a given number is even and equal to 10.", p.width/2, 360);
      p.text("if(number %2 == 0 && number == 10)", p.width/2, 415);
      p.text("The symbol '||' means 'or', and the symbol '&&' means 'and'.", p.width/2, 480);
      p.text("They symbol '!' means 'not'.", p.width/2, 535);
      
      p.text("Do you understand this information?", p.width/2, 640);
        
      
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
        
        
        p.changeScene(19);
        
        }
    }
    
    

    private Game p;
}
