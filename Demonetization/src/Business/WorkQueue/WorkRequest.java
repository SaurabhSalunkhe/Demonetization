/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.time.LocalDate;
import java.util.Date;

/**
*
* @author Saurabh Salunkhe
*/
public abstract class WorkRequest {

   private UserAccount sender;
   private UserAccount receiver;
   private boolean deposit;
   private LocalDate requestDate;
   private int amount;
   private String status;
   private TimeSlot timeSlot;
   
   

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }
   
   public boolean isDeposit() {
       return deposit;
   }

   public String getStatus() {
       return status;
   }

   public void setStatus(String status) {
       this.status = status;
   }

   
   
   public void setDeposit(boolean deposit) {
       this.deposit = deposit;
   }

   public int getAmount() {
       return amount;
   }

   public void setAmount(int amount) {
       this.amount = amount;
   }
   
   public enum TimeSlot{
       TimeSlot_1("8-9"),
       TimeSlot_2("9-10"),
       TimeSlot_3("10-11"),
       TimeSlot_4("11-12"),
       TimeSlot_5("12-1"),
       TimeSlot_6("1-2"),
       TimeSlot_7("2-3"),
       TimeSlot_8("3-4");
       
       private String value;
       private TimeSlot(String value){
           this.value = value;
       }

       public String getValue() {
           return value;
       }

       @Override
       public String toString() {
           return value;
       }
   }
   
   public TimeSlot getTimeSlot(){
       return timeSlot;
   }

    public WorkRequest() {
        
        this.setStatus("initiated"); 

        
    }
  

   public UserAccount getSender() {
       return sender;
   }

   public void setSender(UserAccount sender) {
       this.sender = sender;
   }

   public UserAccount getReceiver() {
       return receiver;
   }

   public void setReceiver(UserAccount receiver) {
       this.receiver = receiver;
   }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

   

   
   @Override
   public String toString(){
       return this.sender.toString();
   }
}