package com.rick.eruekaprovider.controller;


import com.rick.eruekaprovider.service.TicketServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketServiece ticketServiece;


    @GetMapping({"/ticket"})
    public String GetTicket() {
        return ticketServiece.getTicket();
    }
}
