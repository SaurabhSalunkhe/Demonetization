/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Saurabh Salunkhe
 */
public class Denomination {
   
    private CurrencyType currencyType;
    private int numberOfNotes;
    
    private int fiveHundredNote;
        private int thousandNote;

        public int getFiveHundredNote() {
            return fiveHundredNote;
        }

        public void setFiveHundredNote(int fiveHundredNote) {
            this.fiveHundredNote = fiveHundredNote;
        }

        public int getThousandNote() {
            return thousandNote;
        }

        public void setThousandNote(int thousandNote) {
            this.thousandNote = thousandNote;
        }

    public int getNumberOfNotes() {
        return numberOfNotes;
    }

    public void setNumberOfNotes(int numberOfNotes) {
        this.numberOfNotes = numberOfNotes;
    }
    
    public enum CurrencyType{
        FiveHundred("500"),
        OneThousand("1000");
        
        
        
                
        private String value;
        private CurrencyType(String value){
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
}