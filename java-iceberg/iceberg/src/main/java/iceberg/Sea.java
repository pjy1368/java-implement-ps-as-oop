package iceberg;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sea {

    private final List<Icebergs> seaInfo;

    public Sea(final List<Icebergs> seaInfo) {
        this.seaInfo = seaInfo;
    }

    public static Sea from(final List<Integer[]> seaInfo) {
        return new Sea(seaInfo.stream()
            .map(Icebergs::new)
            .collect(Collectors.toList()));
    }

    public List<Icebergs> getSeaInfo() {
        return Collections.unmodifiableList(seaInfo);
    }

}
