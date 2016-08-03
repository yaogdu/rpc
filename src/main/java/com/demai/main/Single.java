package com.demai.main;

import java.io.Serializable;

/**
 * Created by dear on 16/6/6.
 */
public class Single implements Serializable {

    private Single() {
    }

    private static class Holder {
        private static final Single instance = new Single();
    }

    public static final Single instance() {
        return Holder.instance;
    }

}
