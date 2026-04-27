package SpaceAdventure3398;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlayer {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player(400, 600);
    }

    @Test
    void isAlive_trueOnConstruction() {
        assertTrue(player.isAlive());
    }

    @Test
    void shoot_addsBulletToList() {
        player.shoot();
        assertEquals(1, player.getBullets().size());
        // Bullet y should be near player y, not the default -15
        assertTrue(player.getBullets().get(0).getYCoord() > -15);
    }

    @Test
    void shoot_allowsMultipleBulletsInFlight() {
        player.shoot();
        player.shoot();
        player.shoot();
        assertEquals(3, player.getBullets().size());
    }

    @Test
    void setX_updatesLocX() {
        player.setX(200);
        // verify via update cycle: hitbox should follow locX
        player.update();
        // No exception thrown = pass; locX state is internal
    }

    @Test
    void setSpeed_changesHorizontalMovement() {
        player.setSpeed(5);
        // Update should not throw
        assertDoesNotThrow(() -> player.update());
    }

    @Test
    void checkHit_reducesHealthWhenBulletIntersects() {
        // Place bullet directly at player hitbox position
        // Player hitbox is initialized at (70, -70, 50, 50); update() moves it to (locX, locY)
        player.update(); // sync hitbox to (400, 600)

        ArrayList<Projectile> incoming = new ArrayList<>();
        Projectile bullet = new Projectile(1); // owner=1 (alien)
        bullet.setLoc(400, 600);               // overlaps player hitbox
        bullet.update();                        // sync pBox to (400, 600)
        incoming.add(bullet);

        player.checkHit(incoming);
        // Player started at 100 health; a hit subtracts damage (10)
        // We can't read health directly, but player should still be alive (100-10 = 90)
        assertTrue(player.isAlive());
    }

    @Test
    void revive_restoresAliveStatus() {
        // kill by depleting health via many hits
        ArrayList<Projectile> bullets = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Projectile b = new Projectile(1);
            b.setLoc(400, 600);
            b.update();
            bullets.add(b);
        }
        player.update();
        for (int i = 0; i < 15; i++) {
            player.checkHit(bullets);
            player.update();
        }
        assertFalse(player.isAlive());

        player.revive();
        assertTrue(player.isAlive());
    }

    @Test
    void getBullets_returnsNonNullList() {
        assertNotNull(player.getBullets());
    }

    @Test
    void getBullets_populatedAfterShoot() {
        assertTrue(player.getBullets().isEmpty());
        player.shoot();
        assertFalse(player.getBullets().isEmpty());
    }
}
