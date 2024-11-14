package com.example.OnlineCinema.service;

import com.example.OnlineCinema.domain.Tickets;
import com.example.OnlineCinema.repository.TicketsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketsRepository ticketsRepository;

    @Autowired
    public TicketService(TicketsRepository ticketsRepository) {
        this.ticketsRepository = ticketsRepository;
    }

    @Transactional
    public void sellTicket(Tickets ticket) {
        ticketsRepository.save(ticket);
    }

    public Tickets getTicketById(int id) {
        return ticketsRepository.findById(id);
    }

    public List<Tickets> getAllTickets() {
        return ticketsRepository.findAll();
    }

    @Transactional
    public void cancelTicket(int id) {
        ticketsRepository.deleteById(id);
    }
}
