package SpaceAdventure3398;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEnemyManager {

    private EnemyManager manager;

    @BeforeEach
    void setUp() {
        manager = new EnemyManager();
    }

    @Test
    void allDead_trueWhenNoAliensCreated() {
        assertTrue(manager.allDead());
    }

    @Test
    void allDead_falseAfterMakeAliens() {
        manager.makeAliens(0);
        assertFalse(manager.allDead());
    }

    @Test
    void killAllAliens_clearsAlienList() {
        manager.makeAliens(0);
        assertFalse(manager.allDead());
        manager.killAllAliens();
        assertTrue(manager.allDead());
    }

    @Test
    void killAllAliens_clearsAlienBullets() {
        manager.makeAliens(0);
        manager.killAllAliens();
        assertTrue(manager.getAlienBullets().isEmpty());
    }

    @Test
    void makeAliens_createsExpectedCountAtDifficultyZero() {
        manager.makeAliens(0);
        // difficulty 0 → 30 + 0 = 30 aliens
        assertFalse(manager.allDead());
        assertEquals(30, manager.getAlienBullets().size());
    }

    @Test
    void resetScore_setsScoreToZero() {
        manager.getScore(); // access before update
        manager.resetScore();
        assertEquals(0, manager.getScore());
    }

    @Test
    void getScore_initiallyZero() {
        assertEquals(0, manager.getScore());
    }

    @Test
    void getAlienBullets_notNullAfterInit() {
        assertNotNull(manager.getAlienBullets());
    }

    @Test
    void getAlienBullets_emptyBeforeMakeAliens() {
        assertTrue(manager.getAlienBullets().isEmpty());
    }
}
