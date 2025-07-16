//package com.example.ContactManager.repository;
//
//import com.example.ContactManager.model.Contact;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface ContactRepository extends JpaRepository<Contact, Long> {
//    Optional<Contact> findByEmail(String email);
//}
package com.example.ContactManager.repository;

import com.example.ContactManager.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findByEmail(String email);
}