package business;

import dataAccess.IRepository;
import entities.ProgrammingLanguage;

import java.util.List;

public class ProgrammingLanguageManager {
    private IRepository<ProgrammingLanguage> repository;

    public ProgrammingLanguageManager(IRepository<ProgrammingLanguage> repository) {
        this.repository = repository;
    }

    public void add(ProgrammingLanguage programmingLanguage) {
        repository.add(programmingLanguage);
    }

    public void delete(ProgrammingLanguage programmingLanguage) {
        repository.delete(programmingLanguage);
    }

    public void update(ProgrammingLanguage programmingLanguage) {
        repository.update(programmingLanguage);
    }

    public ProgrammingLanguage getById(int id) {
        return repository.getById(id);
    }

    public List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }
}