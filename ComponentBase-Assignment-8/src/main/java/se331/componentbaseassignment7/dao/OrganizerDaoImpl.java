package se331.componentbaseassignment7.dao;

import org.springframework.stereotype.Repository;
import se331.componentbaseassignment7.entity.Organizer;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrganizerDaoImpl implements OrganizerDao {
    List<Organizer> organizerList;

    @PostConstruct
    public void init() {
        organizerList = new ArrayList<>();
        organizerList.add(Organizer.builder()
            .id(1L)
            .name("Organizer 1")
            .address("Address 1")
            .build());

        organizerList.add(Organizer.builder()
            .id(2L)
            .name("Organizer 2")
            .address("Address 2")
            .build());

        organizerList.add(Organizer.builder()
            .id(3L)
            .name("Organizer 3")
            .address("Address 3")
            .build());

        organizerList.add(Organizer.builder()
            .id(4L)
            .name("Organizer 4")
            .address("Address 4")
            .build());

        organizerList.add(Organizer.builder()
            .id(5L)
            .name("Organizer 5")
            .address("Address 5")
            .build());
            
        organizerList.add(Organizer.builder()
            .id(6L)
            .name("Organizer 6")
            .address("Address 6")
            .build());
    }

    @Override
    public Integer getOrganizerSize() {
        return organizerList.size();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? organizerList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return organizerList.subList(firstIndex, Math.min(firstIndex + pageSize, organizerList.size()));
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream()
                .filter(organizer -> organizer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}