package dataAccess;

import entities.ProgrammingLanguage;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageRepository implements IRepository<ProgrammingLanguage> {
    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();

    @Override
    public void add(ProgrammingLanguage entity) {
        programmingLanguages.add(entity);
    }

    @Override
    public void delete(ProgrammingLanguage entity) {
        programmingLanguages.remove(entity);
    }

    @Override
    public void update(ProgrammingLanguage entity) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == entity.getId()) {
                language.setName(entity.getName());
                break;
            }
        }
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }
}