//
//
//package com.example.ContactManager.service;
//
//import com.example.ContactManager.exception.ResourceNotFoundException;
//import com.example.ContactManager.model.Contact;
//import com.example.ContactManager.repository.ContactRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ContactServiceImpl implements ContactService {
//
//    @Autowired
//    private ContactRepository repo;
//
//    @Override
//    public Contact createContact(Contact contact) {
//        if (repo.findByEmail(contact.getEmail()).isPresent()) {
//            throw new IllegalArgumentException("Email already exists");
//        }
//        return repo.save(contact);
//    }
//
//    @Override
//    public Contact updateContact(Long id, Contact contact) {
//        Contact existing = repo.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));
//
//        existing.setFirstName(contact.getFirstName());
//        existing.setLastName(contact.getLastName());
//        existing.setAddress(contact.getAddress());
//        existing.setEmail(contact.getEmail());
//        existing.setPhoneNumber(contact.getPhoneNumber());
//
//        return repo.save(existing);
//    }
//
//    @Override
//    public Contact getContact(Long id) {
//        return repo.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));
//    }
//
//    @Override
//    public List<Contact> getAllContacts() {
//        return repo.findAll();
//    }
//
//    @Override
//    public void deleteContact(Long id) {
//        Contact contact = repo.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));
//        repo.delete(contact);
//    }
//}

package com.example.ContactManager.service;

import com.example.ContactManager.exception.ResourceNotFoundException;
import com.example.ContactManager.model.Contact;
import com.example.ContactManager.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repo;

    @Override
    public Contact createContact(Contact contact) {
        if (repo.findByEmail(contact.getEmail()).isPresent()) {
            throw new IllegalArgumentException("This contact already exists");
        }
        return repo.save(contact);
    }

    @Override
    public Contact updateContact(Long id, Contact contact) {
        Contact existing = repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));

        existing.setFirstName(contact.getFirstName());
        existing.setLastName(contact.getLastName());
        existing.setAddress(contact.getAddress());
        existing.setEmail(contact.getEmail());
        existing.setPhoneNumber(contact.getPhoneNumber());

        return repo.save(existing);
    }

    @Override
    public Contact getContact(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));
    }

    @Override
    public List<Contact> getAllContacts() {
        return repo.findAll();
    }

    @Override
    public void deleteContact(Long id) {
        Contact contact = repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));
        repo.delete(contact);
    }
}
