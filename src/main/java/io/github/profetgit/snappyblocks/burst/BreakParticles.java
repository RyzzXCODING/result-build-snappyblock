package io.github.profetgit.snappyblocks.burst;

public final class BreakParticles {
    private static boolean handling;

    private BreakParticles() {}

    public static boolean handling() {
        return handling;
    }

    public static void begin() {
        handling = true;
    }

    public static void end() {
        handling = false;
    }
}
