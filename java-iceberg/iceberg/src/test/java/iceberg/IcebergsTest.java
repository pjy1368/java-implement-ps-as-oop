package iceberg;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IcebergsTest {

    @Test
    @DisplayName("Icebergs 객체의 정보가 잘 저장되었는지 확인")
    void create() {
        final Icebergs icebergs = new Icebergs(1, 2, 3);
        final List<Iceberg> icebergGroup = icebergs.getIcebergGroup();
        assertThat(icebergGroup).hasSize(3)
            .contains(new Iceberg(1), new Iceberg(2), new Iceberg(3));
    }
}
