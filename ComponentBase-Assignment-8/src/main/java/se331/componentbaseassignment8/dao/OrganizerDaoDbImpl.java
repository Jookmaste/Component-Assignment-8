package se331.componentbaseassignment8.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import se331.componentbaseassignment8.entity.Organizer;
import se331.componentbaseassignment8.repository.OrganizerRepository;

import java.util.List;

@Repository
@Profile("db")
@RequiredArgsConstructor
public class OrganizerDaoDbImpl implements OrganizerDao {

    final OrganizerRepository organizerRepository;

    @Override
    public Integer getOrganizerSize() {
        return (int) organizerRepository.count();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerRepository.findAll();
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }
}