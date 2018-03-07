
public void alarm(){

  boolean on = checkAlarm();

  while(on){
  
    beep();
    
    on = checkAlarm();
  }

}
  /**
   *@return true if alarm is on, false if off
   */
   
  public boolean checkAlarm()
    
