/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class OwnerStaff {
    private String id;
    private String  ownerId;
    private String staffName;
    private String staffId;
    private String contId;

    private OwnerStaff() {
    }

    private OwnerStaff(Builder build) {
          this.id=build.id;
          this.staffId= build.staffId;
          this.ownerId=build.ownerId;
          this.staffName= build.staffName;
          this.contId=build.contId;
    }

    public String getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getCont() {
        return contId;
    }
    
    public static class Builder{
        private String id;
        private String staffName;
        private String staffId;
        private String ownerId;
        private String contId;

        public Builder(String staffId) {
            this.staffId= staffId;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder owner(String ownerId){
            this.ownerId=ownerId;
            return  this;
        }
        public Builder staffName(String staffName){
            this.staffName= staffName;
            return this;
        }
        public Builder staffContactCard( String contactCard){
            this.contId=contactCard;
            return this;
        }
        public OwnerStaff build(){
            return  new OwnerStaff(this);
        }
        public Builder copier(OwnerStaff staff){
              this.id=staff.id;
              this.staffId= staff.staffId;
              this.ownerId=staff.ownerId;
              this.staffName= staff.staffName;
              this.contId=staff.contId;
              return this;
              
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final OwnerStaff other = (OwnerStaff) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
