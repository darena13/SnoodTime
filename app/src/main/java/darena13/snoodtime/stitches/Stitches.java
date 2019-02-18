package darena13.snoodtime.stitches;

/**
 * Базовые элементы, из которых состоят узоры - {@link darena13.snoodtime.KnittingPattern}
 */
public class Stitches {
    public final static NoStitch NO_STITCH = new NoStitch();
    public final static Stitch KNIT_STITCH = new KnitStitch();
    public final static Stitch PURL_STITCH = new PurlStitch();
}
