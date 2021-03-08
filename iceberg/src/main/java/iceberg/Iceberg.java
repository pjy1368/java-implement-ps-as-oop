package iceberg;

import java.util.List;

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
}
