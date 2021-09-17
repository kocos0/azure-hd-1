package com.ms.brmtrading.azurehdtradeentry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@Slf4j
@RequestMapping("trade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TradeEntryController {

    @GetMapping("/status")
    public String getStatus() {
        log.info("Requested status");
        return "{'Healthy'}";
    }

    @PostMapping("/create")
    public String createTrade(Trade trade) {
        log.info("Creating new trade");
        return null;
    }
}
