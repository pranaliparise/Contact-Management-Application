//package com.example.ContactManager.controller;
//
//import com.example.ContactManager.model.Contact;
//import com.example.ContactManager.service.ContactService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("/contacts")
//public class ContactController {
//
//    @Autowired
//    private ContactService service;
//
//    @GetMapping
//    public String listContacts(Model model) {
//        model.addAttribute("contacts", service.getAllContacts());
//        return "list";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("contact", new Contact());
//        return "form";
//    }
//
//    @PostMapping("/save")
//    public String saveContact(@Valid @ModelAttribute Contact contact, BindingResult result) {
//        if (result.hasErrors()) {
//        	return "form";
//        }
//        service.createContact(contact);
//        return "redirect:/contacts";
//    }
//
//   
//    
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable Long id, Model model) {
//        Contact contact = service.getContact(id);
//        model.addAttribute("contact", contact);
//        return "form";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateContact(@PathVariable Long id,
//                                @Valid @ModelAttribute Contact contact,
//                                BindingResult result) {
//        if (result.hasErrors()) {
//            return "form";
//        }
//        service.updateContact(id, contact);
//        return "redirect:/contacts";
//    }
//
//
//    @GetMapping("/delete/{id}")
//    public String deleteContact(@PathVariable Long id) {
//        service.deleteContact(id);
//        return "redirect:/contacts";
//    }
//}

package com.example.ContactManager.controller;

import com.example.ContactManager.model.Contact;
import com.example.ContactManager.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping
    public String listContacts(Model model) {
        model.addAttribute("contacts", service.getAllContacts());
        return "list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "form";
    }

    @PostMapping("/save")
    public String saveContact(@Valid @ModelAttribute Contact contact, BindingResult result) {
        if (result.hasErrors()) {
        	return "form";
        }
        service.createContact(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Contact contact = service.getContact(id);
        model.addAttribute("contact", service.getContact(id));
        return "form";
    }

    @PostMapping("/update/{id}")
    public String updateContact(@PathVariable Long id, @Valid @ModelAttribute Contact contact, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        service.updateContact(id, contact);
        return "redirect:/contacts";
    }

    @GetMapping("/delete/{id}")
    public String deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
        return "redirect:/contacts";
    }
}
