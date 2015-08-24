/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

import java.text.DateFormat;

/**
 *
 * @author Joy
 */
public class Flight{

    String to;
    String from;
    DateFormat departTime;
    DateFormat departDate;
    DateFormat returnDate;
    DateFormat returnTime;
    Boolean destination;
    Boolean directFight;
    int travellers;

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setDepartTime(DateFormat departTime) {
        this.departTime = departTime;
    }

    public void setDepartDate(DateFormat departDate) {
        this.departDate = departDate;
    }

    public void setReturnDate(DateFormat returnDate) {
        this.returnDate = returnDate;
    }

    public void setReturnTime(DateFormat returnTime) {
        this.returnTime = returnTime;
    }

    public void setDestination(Boolean destination) {
        this.destination = destination;
    }

    public void setDirectFight(Boolean directFight) {
        this.directFight = directFight;
    }

    public void setTravellers(int travellers) {
        this.travellers = travellers;
    }
    
}
