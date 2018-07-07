package com.neo.expandedrecylerview.utility;

public final class Utility {
    private Utility() {
    }

    public static int updatedIndex(int expandedPosition, int currentIndex) {
        if (expandedPosition != -1 && currentIndex > expandedPosition) {
            return --currentIndex;
        }
        return currentIndex;
    }
}
