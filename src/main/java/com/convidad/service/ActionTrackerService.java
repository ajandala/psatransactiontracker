package com.convidad.service;

import com.convidad.dto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActionTrackerService {

    private List<Action> actionList = new ArrayList<>();

    public void registerTransaction(Transaction transaction) {

        TransactionAction action = new TransactionAction();
        action.setActionType(ActionType.TRANSACTION);
        action.setTransaction(transaction);

        actionList.add(action);
    }

    public void registerTransactionRequestPerAccount(String account) {

        TransactionRequestAction action = new TransactionRequestAction();
        action.setActionType(ActionType.REQUEST_TRANSACTIONS_PER_ACCOUNT);
        action.setAccountNumber(account);

        actionList.add(action);
    }

    public void registerFailedTransationsRequest() {

        Action action = new Action();
        action.setActionType(ActionType.REQUEST_FAILED_TRANSACTIONS);

        actionList.add(action);
    }

    public List<Action> getActions() {
        return actionList;
    }

}
