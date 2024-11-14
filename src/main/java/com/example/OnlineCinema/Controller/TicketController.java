package com.example.OnlineCinema.Controller;

import com.example.OnlineCinema.domain.Tickets;
import com.example.OnlineCinema.dto.TicketsDTO;
import com.example.OnlineCinema.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;
    private final ModelMapper modelMapper;

    @Autowired
    public TicketController(TicketService ticketService, ModelMapper modelMapper) {
        this.ticketService = ticketService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public void sellTicket(@RequestBody TicketsDTO ticketsDTO) {
        ticketService.sellTicket(modelMapper.map(ticketsDTO, Tickets.class));
    }

    @GetMapping("/{id}")
    public TicketsDTO getTicketById(@PathVariable int id) {
        return modelMapper.map(ticketService.getTicketById(id), TicketsDTO.class);
    }

    @GetMapping
    public List<TicketsDTO> getAllTickets() {
        return ticketService.getAllTickets().stream()
                .map(ticket -> modelMapper.map(ticket, TicketsDTO.class))
                .collect(Collectors.toList());
    }
}
