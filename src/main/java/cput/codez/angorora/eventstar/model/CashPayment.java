/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;



/**
 *
 * @author allen
 */
public final class CashPayment {
    private String id;
    private String payeeId;
    private double amount;
    private String eventId;
    private String date;

    private CashPayment() {
    }
    
    private CashPayment(Builder build){
         this.id=build.id;
         this.payeeId=build.payeeId;
         this.amount=build.amount;
         this.eventId=build.eventId;
         this.date=build.date;
    }

    public String getId() {
        return id;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public double getAmount() {
        return amount;
    }

    public String getEventId() {
        return eventId;
    }

    public String getDate() {
        return date;
    }
    public static class Builder{
        private String id;
        private String payeeId;
        private double amount;
        private String eventId;
        private String date;

        public Builder(String id) {
            this.id=id;
        }
        
        public Builder payeeId(String payeeId){
            this.payeeId=payeeId;
            return this;
        }
        public Builder amount(double amnt){
            this.amount=amnt;
            return this;
        }
        public Builder eventId(String evId){
            this.eventId=evId;
            return this;
        }
        public Builder date(String date){
            this.date=date;
            return this;
        }
        public CashPayment build(){
            return new CashPayment(this);
        }
        public Builder copier(CashPayment pay){
             this.id=pay.id;
             this.payeeId=pay.payeeId;
             this.amount=pay.amount;;
             this.eventId=pay.eventId;
             this.date=pay.date;
             return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final CashPayment other = (CashPayment) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

   
}
