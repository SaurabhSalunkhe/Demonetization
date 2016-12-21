/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GovernmentData;

import java.util.ArrayList;

/**
 *
 * @author keval
 */
public class PeopleBankRelationDirectory {
    ArrayList<PeopleBankRelation> peopleBankRelationList;

    public PeopleBankRelationDirectory() {
        this.peopleBankRelationList = new ArrayList<PeopleBankRelation>();
    }

    public ArrayList<PeopleBankRelation> getPeopleBankRelationList() {
        return peopleBankRelationList;
    }
    
    public void addSSN(int SSN){
        PeopleBankRelation peopleBankRelation = new PeopleBankRelation(SSN);
        this.peopleBankRelationList.add(peopleBankRelation);
    }
    
    public PeopleBankRelation getRelation(int SSN){
        int i = 0;
        int c = 0;
        for(PeopleBankRelation peopleBankRelation : this.peopleBankRelationList){
            if(peopleBankRelation.getSsn() == SSN){
                c=i;
            }
            i++;
        }
        return peopleBankRelationList.get(c);
    }
}
