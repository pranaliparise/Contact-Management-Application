//package com.example.ContactManager.service;
//
//import com.example.ContactManager.model.Contact;
//
//import java.util.List;
//
//public interface ContactService {
//    Contact createContact(Contact contact);
//    Contact updateContact(Long id, Contact contact);
//    Contact getContact(Long id);
//    List<Contact> getAllContacts();
//    void deleteContact(Long id);
//}

package com.example.ContactManager.service;

import com.example.ContactManager.model.Contact;

import java.util.List;

public interface ContactService {
    Contact createContact(Contact contact);
    Contact updateContact(Long id, Contact contact);
    Contact getContact(Long id);
    List<Contact> getAllContacts();
    void deleteContact(Long id);
}
