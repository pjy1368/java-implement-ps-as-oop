package iceberg;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeaTest {

    private Sea sea;
    private final Integer[][] inputs = {{0, 0, 0, 0, 0, 0, 0},
        {0, 2, 4, 5, 3, 0, 0},
        {0, 3, 0, 2, 5, 2, 0},
        {0, 7, 6, 2, 4, 0, 0},
        {0, 0, 0, 0, 0, 0, 0}};

    @BeforeEach
    void setUp() {
        final List<Integer[]> inputInfo = Arrays.asList(inputs);
        sea = Sea.from(inputInfo);
    }

    @Test
    @DisplayName("Sea 객체의 정보가 잘 저장되었는지 확인")
    void create() {
        final List<Icebergs> icebergInfo = sea.getSeaInfo();
        assertThat(icebergInfo).hasSize(5)
            .contains(new Icebergs(0, 0, 0, 0, 0, 0, 0),
                new Icebergs(0, 2, 4, 5, 3, 0, 0),
                new Icebergs(0, 3, 0, 2, 5, 2, 0),
                new Icebergs(0, 7, 6, 2, 4, 0, 0),
                new Icebergs(0, 0, 0, 0, 0, 0));
    }

}

