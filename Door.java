public class Door{

private String inscription;
private boolean locked;
private boolean closed;

   public Door(String c){
      inscription = c;
      closed = true;
      locked = true;
   }

public boolean isClosed(){
   return closed;
}

public boolean isLocked(){
   return locked;
}

public void open(){
   if (closed == true && locked == false){
      System.out.println("...Door Opens...\n");
      closed = false;
   } else if(closed == true && locked == true){
      System.out.println("Door is locked"); 
     } else
      System.out.println("Door is already opened!");
}

public void close(){
   if (locked == false && closed == false){
      System.out.println("...Door Closes...\n");
      closed = true;
   } else if(locked == true && closed == false){
      System.out.println("Unlock Door Before Closing");
     }else
      System.out.println("Door is already closed!");
}

public void lock(){
   if (locked == false && closed == true){
      System.out.println("...Door locks...\n");
      locked = true;
   } else if (locked == false && closed == false){
      System.out.println("Close Door First");
   } else
      System.out.println("Door is already locked!");
}

public void unlock(){
   if(locked==true && closed == true){
      System.out.println("...Door unlock...\n");
      locked = false;
   } else if (locked == true && closed == false){
      System.out.println("Door is opened, but is already locked");
   } else
         System.out.println("Door is already unlocked. Try again\n");
   }

public void setOpen(){
   closed = false;
}
public void setUnlock(){
   locked = false;
}

}