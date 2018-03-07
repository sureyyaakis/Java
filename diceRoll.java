/**
 * Return a random integer simulating a dice roll.
 * @param sides Number of sides on the virtual die begin rolled.
 * @return random number in the range of 1 to sides. 
 */
 public int diceRoll(int sides) {
   
    // This expression generates a random double in the interval 
    // [0, sides]. That is, a double greater than or equal to 0 and less than sides.
    
    double randomNumber = Math.random() * sides;
  
    // Our random number is now in the interval [1, sides + 1)
    
    randomNumber += 1;
    
    //Casting the random number to an integer will round it down to an
    // integer in the 1 to sides range.
  
   return (int) randomNumber;
   
 }
 
 public int monoplyRoll() {
   
   int roll1 = diceRoll(6);
   int roll2 = diceRoll(6);
   int total = roll1 + roll2;
   
   if (roll1 == roll2){
     int roll3 = diceRoll(6);
     int roll4 = diceRoll(6);
     total = total + roll3 + roll4; 
   }
   return total;
   
  }
   
   
