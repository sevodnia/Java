package com.doschechko.matylionak.wcguide.base;

/**
 * Base interface for all the View Models in MVP
 */

public interface BaseActivityViewModel {
    void init();
    void release();
    void resume();
    void pause();
}
