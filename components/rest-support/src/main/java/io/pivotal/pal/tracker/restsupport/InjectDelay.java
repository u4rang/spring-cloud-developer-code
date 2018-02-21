package io.pivotal.pal.tracker.restsupport;

// TODO: review where this lives
public class InjectDelay {
    public static void injectDelay(Long maxDelaySec) {
        try {
            Thread.sleep(((Double)(maxDelaySec * 1000L * Math.random())).longValue());
        } catch (InterruptedException e) {
            //
        }
    }
}
