package darena13.snoodtime;

import darena13.snoodtime.stitches.Stitch;

/**
 * Узор. Состоит из какого-то количества {@link Stitch}
 */
public class KnittingPattern {
    private Stitch[][] stitches;

    public KnittingPattern(Stitch[][] stitches) {
        this.stitches = stitches;
    }

    int getWidth() {
        return stitches[0].length;
    }

    int getHeight() {
        return stitches.length;
    }
}
