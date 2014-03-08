/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class ContactCard {
    private String id;
    private String cellNumber;
    private String telNo;
    private String emailAdress;
    private String website;
    private String addressId;;

    private ContactCard() {
    }

    private ContactCard(Builder build) {
       this.id=build.id;
       this.emailAdress=build.emailAdress;
       this.cellNumber=build.cellNumber;
       this.telNo=build.telNo;
       this.website=build.website;
       this.addressId =build.addressId;
    }

    public String getId() {
        return id;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getTelNo() {
        return telNo;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getWebsite() {
        return website;
    }

    public String getAddressId() {
        return addressId;
    }

   
    
    public static class Builder{
        private String id;
        private String cellNumber;
        private String telNo;
        private String emailAdress;
        private String website;
        private String addressId;

        public Builder(String email) {
            this.emailAdress=email;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder cellNumber(String cell){
            this.cellNumber=cell;
            return this;
        }
        public Builder telNo(String tel){
            this.telNo=tel;
            return this;
        }
        public Builder website(String website){
            this.website=website;
            return this;
        }
        public Builder address(String ad){
            this.addressId =ad;
            return  this;
        }
        public ContactCard build(){
            return new ContactCard(this);
        }
        public Builder copier(ContactCard bc){
               this.id=bc.id;
               this.emailAdress=bc.emailAdress;
               this.cellNumber=bc.cellNumber;
               this.telNo=bc.telNo;
               this.website=bc.website;
               this.addressId =bc.addressId;
              return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final ContactCard other = (ContactCard) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
