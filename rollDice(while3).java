
public int keepRolling(){
  int dice1 = rollDice();
  int dice2 = rollDice();
  int dice3 = rollDice();
  int count = 1;
  
  while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){
    // we need to re-roll
    dice1 = rollDice();
    dice2 = rollDice();
    dice3 = rollDice();
    count += 1;
   }
  return count;
}
