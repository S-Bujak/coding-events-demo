package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity{

    @Size(max=500, message="Description too long!")
    private String description;

    @NotBlank(message="Email is required.")
    @Email(message="Invalid email. Try again.")
    private String contactEmail;

    public EventDetails(String description) {
        this.description = description;
    }

    public EventDetails() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
