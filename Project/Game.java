//Here is the document for my APCS coding project
import processing.core.*;
import java.util.*;


public class Game extends PApplet{

//String gameState;
int current = 0;

  public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        scenes = new ArrayList<Scene>();
        scenes.add(new Menu(this));
        scenes.add(new Choice(this));
        scenes.add(new Gameover(this));
        scenes.add(new TripleChoice(this));
        scenes.add(new Test(this));
    }
    
     public void draw()
    {
         
        scenes.get(current).display();
            
    }
    
    

  /*  public void draw()
    {
        //clearBackground();

        if(gameState == "START") {
          startGame();
        }  else if(gameState == "CHOICE"){
          chooseGame();
        } else if (gameState == "TEST"){
          gameTest();
        } else if(gameState == "GAMEOVER"){
          gameOver();
        }

        }

*/
/*
void startGame(){
      background(180);
      textAlign(CENTER);
      fill(0);
      textSize(200);
      text("THE GAME", width/2, 200);
      textSize(25);
      text("Welcome to THE GAME! Press tab to begin.", width/2, 275);
      if(key == TAB){
        key = ENTER;
        gameState = "CHOICE";
      }
}

void chooseGame(){
      background(180);
      textAlign(CENTER);
      fill(255);
      stroke(13, 168, 42);
      rect(width/4 - 55, height*3/4 -40, 110, 50);
      stroke(181, 20, 14);
      rect(width*3/4 - 55, height*3/4 -40, 110, 50);

      fill(0);
      textSize(100);
      text("Ready to play?", width/2, 200);
      textSize(50);
      text("YES!", width/4, height*3/4 );
      text("NO!", width*3/4, height*3/4 );

      if(mousePressed==true
      && mouseX > width/4 - 55 && mouseX < width/4 + 55
      && mouseY > height*3/4 -40 && mouseY < height*3/4 +40){
        key = ENTER;
        gameState = "TEST";
      }
      else if(mousePressed==true
      && mouseX > width*3/4 - 55 && mouseX < width*3/4 + 55
      && mouseY > height*3/4 -40 && mouseY < height*3/4 +40){
        key = ENTER;
        gameState = "GAMEOVER";
      }

}

void gameTest(){
      background(180);
      textAlign(CENTER);
      fill(0);
      textSize(100);
      text("Under Construction", width/2, 130);
      textSize(25);
      text("Press shift to restart.", width/2, 275);
      if(keyCode == SHIFT){
        key = ENTER;
        gameState = "START";
      }
}

void gameOver(){
      background(180);
      textAlign(CENTER);
      fill(0);
      textSize(150);
      text("GAME OVER", width/2, 200);
      textSize(40);
      text("Why did you do that??", width/2, 275);
      textSize(15);
      text("Press shift to restart.", width/2, 475);
      if(keyCode == SHIFT){
        key = ENTER;
        gameState = "START";
      }
    }
*/

     public void keyPressed()
    {
        scenes.get(current).handleKeyPressed();
    }
    
    public void mousePressed()
    {
        scenes.get(current).handleMousePressed();
    }
    
    public void changeScene(int n)
    {
        current = n;
        
    }
    
    private ArrayList<Scene> scenes;
 
    
    public static void main(String[] args)
    {
      PApplet.main("Game");
    }
}
