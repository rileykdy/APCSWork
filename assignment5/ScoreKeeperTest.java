public class ScoreKeeperTest{

public static void main(String[] args){

ScoreKeeper a = new ScoreKeeper();

a.scoreNormal();
a.scoreNormal();
a.scoreNormal();
a.scoreNormal();
a.scoreNormal();

a.scoreBonus();
a.scoreBonus();

System.out.println("Score A: " + a.score());

ScoreKeeper b = new ScoreKeeper();

b.scoreNormal();

System.out.println("Score B: " + b.score());

ScoreKeeper c = new ScoreKeeper();

c.scoreNormal();
c.scoreNormal();

c.scoreBonus();
c.scoreBonus();
c.scoreBonus();
c.scoreBonus();

System.out.println("Score C: " + c.score());


ScoreKeeper d = new ScoreKeeper();


System.out.println("Score D: " + d.score());


}
}
