/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

import java.util.Calendar;

/**
 *
 * @author allen
 */
public final class Ticket {
   private String id;
   private String ticketNum;
   private double cost;
   private Calendar dateOfPurchase;
   private String eventId;

    private Ticket() {
    }

    private Ticket(Builder build) {
        this.id= build.id;
        this.ticketNum= build.ticketNum;
        this.cost=build.cost;
        this.dateOfPurchase=build.dateOfPurchase;
        this.eventId=build.eventId;
    }

    public String getId() {
        return id;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public double getCost() {
        return cost;
    }

    public Calendar getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getEventId() {
        return eventId;
    }
    
    public static class Builder{
        private String id;
        private String ticketNum;
        private double cost;
        private Calendar dateOfPurchase;
        private String eventId;

        public Builder(String ticketNum) {
            this.ticketNum= ticketNum;
        }
        public Builder id(String id){
            this.id= id;
            return this;
        }
        public Builder cost(double cost){
            this.cost=cost;
            return this;
        }
        public Builder dateOfPurchase(Calendar dateofPurchase){
            this.dateOfPurchase=dateofPurchase;
            return this;
        }
        public Builder eventId(String evId){
            this.eventId=evId;
            return this;
        }
        public Ticket build(){
            return new Ticket(this);
        }
        public Builder copier(Ticket ticket){
             this.id= ticket.id;
             this.ticketNum= ticket.ticketNum;
             this.cost=ticket.cost;
             this.dateOfPurchase=ticket.dateOfPurchase;
             this.eventId=ticket.eventId;
             return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
   
}
