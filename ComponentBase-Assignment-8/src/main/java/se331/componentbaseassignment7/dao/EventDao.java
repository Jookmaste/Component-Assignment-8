package se331.componentbaseassignment7.dao;

import se331.componentbaseassignment7.entity.Event;
import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);
}