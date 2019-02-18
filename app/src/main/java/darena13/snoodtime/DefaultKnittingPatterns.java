package darena13.snoodtime;

import java.util.HashMap;

import darena13.snoodtime.stitches.Stitch;
import darena13.snoodtime.stitches.Stitches;

/**
 * Коллекция узоров для вязания
 */
public class DefaultKnittingPatterns extends HashMap<Integer, KnittingPattern> {
    public static final DefaultKnittingPatterns INSTANCE = new DefaultKnittingPatterns();

    private DefaultKnittingPatterns() {
        put(0, new KnittingPattern(patternStitches_0));
        put(1, new KnittingPattern(patternStitches_1));
    }

    private Stitch[][] patternStitches_0 = {
            {Stitches.KNIT_STITCH, Stitches.PURL_STITCH},
    };

    private Stitch[][] patternStitches_1 = {
            {Stitches.KNIT_STITCH, Stitches.PURL_STITCH},
            {Stitches.PURL_STITCH, Stitches.KNIT_STITCH}
    };

    private Stitch[][] patternStitches_2 = {
            {Stitches.KNIT_STITCH, Stitches.PURL_STITCH},
            {Stitches.PURL_STITCH, Stitches.KNIT_STITCH}
    };

}
