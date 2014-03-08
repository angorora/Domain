/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;



/**
 *
 * @author allen
 */
public final class CardPayment {
    private String Id;
    private String payeeId;
    private String cardNum;
    private double amount;
    private String eventId;
    private String date;

   private CardPayment() {
    }

   private CardPayment(Builder build) {
       this.Id=build.Id;
       this.payeeId=build.payeeId;
       this.cardNum=build.cardNum;
       this.amount=build.amount;
       this.eventId=build.eventId;
       this.date=build.date;
    }

    public String getId() {
        return Id;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.Id != null ? this.Id.hashCode() : 0);
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
        final CardPayment other = (CardPayment) obj;
        if ((this.Id == null) ? (other.Id != null) : !this.Id.equals(other.Id)) {
            return false;
        }
        return true;
    }

    public String getEventId() {
        return eventId;
    }

    public String getDate() {
        return date;
    }
    public static class Builder{
        private String Id;
        private String payeeId;
        private String cardNum;
        private double amount;
        private String eventId;
        private String date;
        public Builder(String cardNum){
            this.cardNum = cardNum;
            
        }
        public Builder payeeId(String payeeId){
            this.payeeId=payeeId;
            return this;
        }
        public Builder amount(double  amt){
            this.amount=amt;
            return this;
        }
         public Builder eventId(String evId){
            this.eventId=evId;
            return this;
        }
         public Builder date(String  dt){
            this.date=dt;
            return this;
        }
        public Builder id(String id){
            this.Id=id;
            return this;
        }
          public CardPayment build(){
            
            return new CardPayment(this);
        }
        public Builder copier(CardPayment card){
             this.Id=card.Id;
             this.cardNum = card.cardNum;
             this.payeeId=card.payeeId;
             this.amount=card.amount;
             this.eventId=card.eventId;
             this.date=card.date;
             return this;
        }
    }
       
}
