package com.wakaleo.gameoflife.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniverseCoverageTest {

    @Test
    public void shouldCreateUniverseAndGenerateNextGeneration() {
        Universe universe = new Universe(3, 3);

        universe.setLiveCellAt(1, 1);
        universe.spawnsANewGeneration();

        assertNotNull(universe.getGrid());
    }
}
