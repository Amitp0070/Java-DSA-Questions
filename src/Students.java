import org.jetbrains.annotations.NotNull;

import java.lang.String;

public interface Students extends Comparable {
    @Override
    String toString();

    void setAge(int age);

    void setName(String name);

    void setWeight(int weight);

    int getAge();

    String getName();

    int getWeight();

    int compareTo(@NotNull Student that);
}
