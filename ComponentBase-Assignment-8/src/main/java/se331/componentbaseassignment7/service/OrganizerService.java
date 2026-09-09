package se331.componentbaseassignment7.service;

import se331.componentbaseassignment7.entity.Organizer;
import java.util.List;

public interface OrganizerService {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);
}