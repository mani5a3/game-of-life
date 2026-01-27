package com.wakaleo.gameoflife.webtests.controllers;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameControllerCoverageTest {

    @Test
    public void shouldCreateController() {
        GameController controller = new GameController();
        assertNotNull(controller);
    }
}
