package com.ms.brmtrading.azurehdtradeentry;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@Slf4j
@RequestMapping("trade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "", description = "Trade Entry Controller")
public class TradeEntryController {

    @GetMapping("/status")
    public String getStatus() {
        log.info("Requested status");
        return "{'Healthy'}";
    }

    @PostMapping("/create")
    public String createTrade(@RequestBody() Trade trade) {
        log.info("Creating new trade");
        return null;
    }
}
