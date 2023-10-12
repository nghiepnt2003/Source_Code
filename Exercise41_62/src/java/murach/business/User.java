package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String birthDay;
    private String by;
    private String like;
    private String send;
    private String contact;
    private String heardFrom;
    private String wantsUpdates;
    private String contactVia;
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birthDay = "";
        by = "";
        like = "";
        send = "";
        contact = "";
    }
    
    public User(String firstName, String lastName, String email,String birthDay,String by, 
        String like, String send, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDay = birthDay;
        this.by = by;
        this.like = like;
        this.send = send;
        this.contact = contact;
    }
    public String getLike()
    {
        return like;
    }
    public String getSend()
    {
        return send;
    }
    public String getContact()
    {
        return contact;
    }
    public void SetLike(String like)
    {
        this.like = like;
    }
    
    public void Setsend(String send)
    {
        this.send = send;
    }

    public void SetContact(String contact)
    {
        this.contact = contact;
    }    
    
    public String getBirthDay()
    {
        return birthDay;
    }

    public void SetBirthDay(String birthDay)
    {
        this.birthDay = birthDay;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getBy()
    {
        return by;
    }

    public void setJob(String by) {
        this.by = by;
    }    
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public String getWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }    
    
}