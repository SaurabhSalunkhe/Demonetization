/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Saurabh Salunkhe
 */ 
public class TokenTestWorkRequest extends WorkRequest{
                                                                                    
    private String testResult;
    private int amount;
    private int fiveHunderdNotes;
    private int thousandNotes;
   private Denomination denomination;

    public TokenTestWorkRequest() {
        denomination= new Denomination();
    }

    public int getFiveHunderdNotes() {
        return fiveHunderdNotes;
    }

    public void setFiveHunderdNotes(int fiveHunderdNotes) {
        this.fiveHunderdNotes = fiveHunderdNotes;
    }

    public int getThousandNotes() {
        return thousandNotes;
    }

    public void setThousandNotes(int thousandNotes) {
        this.thousandNotes = thousandNotes;
    }
   
    public Denomination getDenomination() {
        return denomination;
    }

    public void setDenomination(Denomination denomination) {
        this.denomination = denomination;
    }

  
   
   
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
