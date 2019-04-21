package com.convidad.controller;

import com.convidad.dto.Action;
import com.convidad.dto.Transaction;
import com.convidad.service.ActionTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ActionTrackerService actionTrackerService;

    @PostMapping(value = "/registerTransaction")
    public void registerTransaction(@RequestBody Transaction transaction) {
        actionTrackerService.registerTransaction(transaction);
    }

    @PostMapping(value = "/registerTransactionRequestPerAccount")
    public void registerTransaction(@RequestBody String account) {
        actionTrackerService.registerTransactionRequestPerAccount(account);
    }

    @PostMapping(value = "/registerFailedTransactionsRequest")
    public void registerTransaction() {
        actionTrackerService.registerFailedTransationsRequest();
    }

    @GetMapping(value = "/getActions")
    public List<Action> getActions() {
        return actionTrackerService.getActions();
    }

}
