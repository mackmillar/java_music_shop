import items.DrumKit;
import items.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumkit;
    InstrumentType instrumentType;

    @Before
    public void before() {
        drumkit = new DrumKit("tapity tap tap", 50.00, InstrumentType.PERCUSSION, "Pearl");
    }

    @Test
    public void getSound() {
        assertEquals("tapity tap tap", drumkit.play());
    }
}
