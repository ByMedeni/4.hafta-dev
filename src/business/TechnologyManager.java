package business;

import dataAccess.IRepository;
import entities.Technology;

import java.util.List;

public class TechnologyManager {
    private IRepository<Technology> repository;

    public TechnologyManager(IRepository<Technology> repository) {
        this.repository = repository;
    }

    public void add(Technology technology) {
        repository.add(technology);
    }

    public void delete(Technology technology) {
        repository.delete(technology);
    }

    public void update(Technology technology) {
        repository.update(technology);
    }

    public Technology getById(int id) {
        return repository.getById(id);
    }

    public List<Technology> getAll() {
        return repository.getAll();
    }
}