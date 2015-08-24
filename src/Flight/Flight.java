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

    private String to;
    private String from;
    private DateFormat departTime;
    private DateFormat departDate;
    private DateFormat returnDate;
    private DateFormat returnTime;
    private Boolean destination;
    private Boolean directFight;
    private int travellers;

    public Flight(String to, String from, DateFormat departTime, DateFormat departDate, DateFormat returnDate, DateFormat returnTime, Boolean destination, Boolean directFight, int travellers) {
        this.to = to;
        this.from = from;
        this.departTime = departTime;
        this.departDate = departDate;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.destination = destination;
        this.directFight = directFight;
        this.travellers = travellers;
    }

    
    
    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public DateFormat getDepartTime() {
        return departTime;
    }

    public DateFormat getDepartDate() {
        return departDate;
    }

    public DateFormat getReturnDate() {
        return returnDate;
    }

    public DateFormat getReturnTime() {
        return returnTime;
    }

    public Boolean getDestination() {
        return destination;
    }

    public Boolean getDirectFight() {
        return directFight;
    }

    public int getTravellers() {
        return travellers;
    }

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
