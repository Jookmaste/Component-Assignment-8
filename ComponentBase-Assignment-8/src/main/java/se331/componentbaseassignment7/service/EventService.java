package se331.componentbaseassignment7.service;

import se331.componentbaseassignment7.entity.Event;
import java.util.List;

public interface EventService {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);
}