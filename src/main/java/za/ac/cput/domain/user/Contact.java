package za.ac.cput.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
    @Id
    private long contactId;
    private String email;
    private String phone;

    protected Contact(){}

    private Contact(Builder builder){
        this.contactId = builder.contactId;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public long getContactId() { return contactId; }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        private long contactId;
        private String email;
        private String phone;

        public Builder setContactId(long contactId){
            this.contactId = contactId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder copy(Contact contact){
            this.contactId = contact.getContactId();
            this.email = contact.email;
            this.phone = contact.phone;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
