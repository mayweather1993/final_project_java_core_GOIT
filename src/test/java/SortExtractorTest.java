
import java7finalproject.Holder.Sortable;
import java7finalproject.SortExtractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;


public class SortExtractorTest {
    @Test
    public void gettingAllSorts() throws Exception {
        SortExtractor sortExtractor = new SortExtractor();

        Set<Sortable> sortables = sortExtractor.gettingAllSorts();
        int size = sortables.size();
        Assert.assertEquals(4, size);

    }
}