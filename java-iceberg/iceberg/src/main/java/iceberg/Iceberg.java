package iceberg;

import java.util.List;
import java.util.Objects;

public class Iceberg {

    private int height;

    public Iceberg(int height) {
        this.height = height;
    }

    public int minusHeight(final List<Iceberg> adjacentIcebergs) {
        height -= getSeaSideCount(adjacentIcebergs);
        return height;
    }

    public int getSeaSideCount(final List<Iceberg> adjacentIcebergs) {
        return (int) adjacentIcebergs.stream()
            .filter(Iceberg::isSeaSide)
            .count();
    }

    public boolean isSeaSide() {
        return height == 0;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Iceberg iceberg = (Iceberg) o;
        return height == iceberg.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }
}
