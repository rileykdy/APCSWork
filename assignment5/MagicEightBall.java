public class MagicEightBall{

public String ask(){

double n = Math.random();

if (n>=0 && n < .1)
  return "Yes";

else if (n>=.1 && n < .2)
  return "No";

else if (n>=.1 && n < .2)
  return "Better not tell you now";

else if (n>=.2 && n < .3)
  return "Most likely";

else if (n>=.3 && n < .4)
  return "It is certain";

else if (n>=.4 && n < .5)
  return "Concentrate and ask again";

else if (n>=.5 && n < .6)
  return "Very doubtful";

else if (n>=.6 && n < .7)
  return "Signs point to yes";

else if (n>=.7 && n < .8)
  return "My sources say no";

else if (n>=.8 && n < .9)
  return "Outlook not so good";

else
  return "It is decidedly so";

}

}
