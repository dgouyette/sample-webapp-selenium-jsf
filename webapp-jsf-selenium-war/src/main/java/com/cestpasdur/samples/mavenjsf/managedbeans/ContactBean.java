package com.cestpasdur.samples.mavenjsf.managedbeans;

import com.cestpasdur.samples.mavenjsf.domain.Contact;


/**
 * Managed bean de gestion des contacts
 * @author dgouyette
 *
 */
public class ContactBean {

    private Contact contact=new Contact();


    public String doAddContact(){
        System.out.println("doAddContact : "+contact.toString());
            return "doAddContact-success";
    }

    public Contact getContact() {
           return contact;
       }

       public void setContact(Contact contact) {
           this.contact = contact;
       }
    
}
