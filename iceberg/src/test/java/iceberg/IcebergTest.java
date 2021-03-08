package iceberg;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IcebergTest {

    @Test
    @DisplayName("동서남북 방향에 붙어 있는 바닷면의 개수를 구하는지 확인")
    void getSeaSideCount() {
        final List<Iceberg> adjacentIcebergs = Arrays.asList(new Iceberg(2),
            new Iceberg(0), new Iceberg(0), new Iceberg(0));

        final Iceberg iceberg = new Iceberg(2);
        assertThat(iceberg.getSeaSideCount(adjacentIcebergs)).isEqualTo(3);
    }
}