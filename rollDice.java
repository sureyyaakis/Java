
public int rollDice(int sides){
        
        // random num between 0 and (almost) 1
        double randomNumber = Math.random();
        
        // change range 0 to (almost)6
        randomNumber = randomNumber * sides;
        
        // shift range up one
        randomNumber = randomNumber + 1;
        
        //cast to integer (ignor decimal part)
        // exp: 1.342 becomes 1
        int randomInt = (int)randomNumber;
        
        return randomInt;
}
        
