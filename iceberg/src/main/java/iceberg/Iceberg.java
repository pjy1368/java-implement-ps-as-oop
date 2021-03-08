package iceberg;

import java.util.List;

public class Iceberg {
    private final int height;

    public Iceberg(final int height) {
        this.height = height;
    }

    public int getSeaSideCount(final List<Iceberg> adjacentIcebergs) {
        return (int) adjacentIcebergs.stream()
            .filter(Iceberg::isSeaSide)
            .count();
    }

    public boolean isSeaSide() {
        return height == 0;
    }
}
