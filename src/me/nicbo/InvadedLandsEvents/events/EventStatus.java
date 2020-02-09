package me.nicbo.InvadedLandsEvents.events;

public enum EventStatus {
    NONE("There is no event active right now"),
    STARTED("You cannot join the event as it has already started!"),
    ENDING("The event is ending"),
    INEVENT("You are already in the event");

    final String description;

    EventStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}