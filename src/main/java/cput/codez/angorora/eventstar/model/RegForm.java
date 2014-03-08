/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class RegForm {
    private String id;
    private long frmNum;
    private String attendeeId;

    private RegForm() {
    }

    private RegForm(Builder build) {
          this.id =build.id;
          this.frmNum=build.frmNum;
          this.attendeeId=build.attendeeId;
    }

    public String getId() {
        return id;
    }

    public long getFrmNum() {
        return frmNum;
    }

    public String getAttendeeId() {
        return attendeeId;
    }
    
    public static class Builder{
        private String id;
        private long frmNum;
        private String attendeeId;

        public Builder(long frmNum) {
            this.frmNum=frmNum;
        }
        public Builder id(String id){
            this.id =id;
            return this;
        }
        public Builder attendeeId(String attId){
            this.attendeeId=attId;
            return this;
        }
        public RegForm build(){
            return new RegForm(this);
            
        }
        public Builder copier(RegForm reg){
              this.id =reg.id;
              this.frmNum=reg.frmNum;
              this.attendeeId=reg.attendeeId;
              return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final RegForm other = (RegForm) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
