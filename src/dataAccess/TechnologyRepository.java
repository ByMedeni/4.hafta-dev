package dataAccess;

import entities.Technology;
import java.util.ArrayList;
import java.util.List;

public class TechnologyRepository implements IRepository<Technology> {
    private List<Technology> technologies = new ArrayList<>();

    @Override
    public void add(Technology entity) {
        technologies.add(entity);
    }

    @Override
    public void delete(Technology entity) {
        technologies.remove(entity);
    }

    @Override
    public void update(Technology entity) {
        for (Technology technology : technologies) {
            if (technology.getId() == entity.getId()) {
                technology.setName(entity.getName());
                technology.setProgrammingLanguageId(entity.getProgrammingLanguageId());
                break;
            }
        }
    }

    @Override
    public Technology getById(int id) {
        for (Technology technology : technologies) {
            if (technology.getId() == id) {
                return technology;
            }
        }
        return null;
    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }
}