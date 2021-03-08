package iceberg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Icebergs {

    private final List<Iceberg> icebergGroup;

    public Icebergs(final List<Iceberg> icebergGroup) {
        this.icebergGroup = icebergGroup;
    }

    public Icebergs(final Integer... args) {
        this.icebergGroup = Arrays.stream(args)
            .map(Iceberg::new)
            .collect(Collectors.toList());
    }

    public List<Iceberg> getIcebergGroup() {
        return Collections.unmodifiableList(icebergGroup);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Icebergs icebergs = (Icebergs) o;
        return icebergGroup.containsAll(icebergs.icebergGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icebergGroup);
    }
}
