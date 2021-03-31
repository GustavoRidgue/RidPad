package br.com.ridgue.ridpad.controller.notes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("notes/my_notes")
public class NotesController {
    @GetMapping
    public String myNotes() {
        return "notes/mynotes";
    }

    @GetMapping("details")
    public String details() {
        return "notes/details";
    }

    @GetMapping("alter")
    public String alter() {
        return "notes/alter";
    }

    @PostMapping("altered")
    public String altered() {
        return "redirect:/notes/my_notes";
    }
}
