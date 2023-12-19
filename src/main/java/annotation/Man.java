package annotation;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Man {
    @Autowired
    private Dog dog;

    @Resource(name = "someDog")
    private Dog dog1;

    private Bird bird;

    private Cat cat;

    @Autowired
    private Set<Pet> pets;

    @Autowired
    private List<Pet<Dog>> dogs;

    @Autowired
    private Map<String, Pet> mapDogs;

    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public void print() {
        /* ранее написанный код без изменений */
        System.out.println("pets:");
        pets.forEach(s -> System.out.println(s.print()));
        System.out.println("dogs:");
        dogs.forEach(s -> System.out.println(s.print()));
        System.out.println("mapDogs:");
        mapDogs.forEach((key, value) -> System.out.printf("%s - %s%n", key, value.print()));
    }
}