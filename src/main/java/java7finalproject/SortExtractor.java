package java7finalproject;


import java7finalproject.Holder.Sortable;
import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class SortExtractor {
    public Set<Sortable> gettingAllSorts() throws IllegalAccessException, InstantiationException {
        Set<Sortable> instanceOfClasses = new HashSet<>();
        Reflections reflections = new Reflections("java7finalproject");
        Set<Class<? extends Sortable>> allClasses = reflections.getSubTypesOf(Sortable.class);
        for (Class<? extends Sortable> s :
                allClasses) {
            Sortable sortable = s.newInstance();
            instanceOfClasses.add(sortable);
        }
        return instanceOfClasses;
    }
}