/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class Attendee {
    private String id;
    private String firstName;
    private String lastName;
    private String idNum;
    private int age;
    private String ticketNum;
    private String contId;

    private Attendee() {
    }

    private Attendee(Builder build) {
         this.id=build.id;
         this.idNum=build.idNum;
         this.firstName=build.firstName;
         this.lastName=build.lastName;
         this.age=build.age;
         this.ticketNum=build.ticketNum;
         this.contId=build.contId;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public String getCont() {
        return contId;
    }
    
    public static  class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private String idNum;
        private int age;
        private String ticketNum;
        private String contId;

        public Builder(String idNum) {
            this.idNum=idNum;
        }
         public  Builder id(String id){
            this.id=id;
            return this;
        }
        public  Builder firstName(String fname){
            this.firstName=fname;
            return this;
        }
        public  Builder lastName(String lName){
            this.lastName=lName;
            return this;
        }
        public  Builder age(int age){
            this.age=age;
            return this;
        }
         public  Builder ticket(String ticketNum){
            this.ticketNum=ticketNum;
            return this;
        }
         public  Builder contact(String contId){
            this.contId=contId;
            return this;
        }
         public Attendee build(){
             return  new Attendee(this);
         }
         public  Builder copier(Attendee att){
             this.id=att.id;
             this.idNum=att.idNum;
             this.firstName=att.firstName;
             this.lastName=att.lastName;
             this.age=att.age;
             this.ticketNum=att.ticketNum;
             this.contId=att.contId;
             return this;
         }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Attendee other = (Attendee) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
