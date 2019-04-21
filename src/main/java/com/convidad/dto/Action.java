package com.convidad.dto;

import java.time.LocalDateTime;

public class Action {

    private final LocalDateTime timeStamp;

    private ActionType actionType;

    public Action() {
        this.timeStamp = LocalDateTime.now();
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }
}
