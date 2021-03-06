package iceberg;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IcebergTest {

    private Iceberg iceberg;
    private List<Iceberg> adjacentIcebergs;

    @BeforeEach
    void setUp() {
        adjacentIcebergs = Arrays.asList(new Iceberg(2), new Iceberg(0),
            new Iceberg(0), new Iceberg(0));
    }

    @Test
    @DisplayName("동서남북 방향에 붙어 있는 바닷면의 개수를 구하는지 확인")
    void getSeaSideCount() {
        iceberg = new Iceberg(2);
        assertThat(iceberg.getSeaSideCount(adjacentIcebergs)).isEqualTo(3);
    }

    @Test
    @DisplayName("바닷면의 개수만큼 빙하의 높이가 줄어드는지 확인")
    void minusHeight() {
        iceberg = new Iceberg(4);
        assertThat(iceberg.minusHeight(adjacentIcebergs)).isEqualTo(1);
    }

    @Test
    @DisplayName("빙산이 다 녹아서 바닷면이 되었는지 확인")
    void isSeaSide() {
        iceberg = new Iceberg(3);
        iceberg.minusHeight(adjacentIcebergs);
        assertThat(iceberg.isSeaSide()).isTrue();
    }

}