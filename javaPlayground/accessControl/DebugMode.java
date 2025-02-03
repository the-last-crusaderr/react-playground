

import static edu.sumit.debug.Debug.*;
import static edu.sumit.debug.DebugOff.*;

enum DebugStatus {OFF, ON};


public class DebugMode{

 DebugStatus prevStatus = DebugStatus.ON;
 
 public static void main(String[] args){
    
    DebugStatus currentStatus = DebugStatus.OFF; 

    //System.out.println(DebugStatus.ON);

    if(currentStatus.ordinal() == 1){	 
        //Debug d1 = new Debug();
       // Debug.debugStatus();
       edu.sumit.debug.Debug.debugStatus();
    }
    else{
      //DebugOff d2 = new DebugOff();
      //DebugOff.debugStatus();
      edu.sumit.debug.DebugOff.debugStatus();
    }
	 }
        }
