package SpaceAdventure3398;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class TestScoreboard {

    private Scoreboard scoreboard;

    @BeforeEach
    void setUp() {
        scoreboard = new Scoreboard();
    }

    // ---- updateCurrentScore ----

    @Test
    void updateCurrentScore_addsPoints() {
        scoreboard.updateCurrentScore(50);
        assertEquals(50, scoreboard.getCurrentScore());
    }

    @Test
    void updateCurrentScore_doesNotGoBelowZero() {
        scoreboard.updateCurrentScore(-9999);
        assertEquals(0, scoreboard.getCurrentScore());
    }

    @Test
    void updateCurrentScore_accumulatesMultipleCalls() {
        scoreboard.updateCurrentScore(10);
        scoreboard.updateCurrentScore(20);
        assertEquals(30, scoreboard.getCurrentScore());
    }

    // ---- resetScore ----

    @Test
    void resetScore_setsCurrentScoreToZero() {
        scoreboard.updateCurrentScore(100);
        scoreboard.resetScore();
        assertEquals(0, scoreboard.getCurrentScore());
    }

    // ---- getScoreAt / getNameAt bounds ----

    @Test
    void getScoreAt_outOfBoundsReturnsMinusOne() {
        assertEquals(-1, scoreboard.getScoreAt(-1));
        assertEquals(-1, scoreboard.getScoreAt(100));
    }

    @Test
    void getNameAt_outOfBoundsReturnsEmpty() {
        assertEquals("", scoreboard.getNameAt(-1));
        assertEquals("", scoreboard.getNameAt(100));
    }

    // ---- save / readFile with temp file ----

    @Test
    void save_writesScoreToFile(@TempDir Path tempDir) throws Exception {
        File tempFile = tempDir.resolve("scores.txt").toFile();
        setFilePath(scoreboard, tempFile.getAbsolutePath());

        scoreboard.updateCurrentScore(999);
        scoreboard.save("Alice");

        Scoreboard reader = new Scoreboard();
        setFilePath(reader, tempFile.getAbsolutePath());
        reader.readFile();

        assertEquals(999, reader.getScoreAt(0));
        assertEquals("Alice", reader.getNameAt(0));
    }

    @Test
    void save_doesNotFailOnNullName(@TempDir Path tempDir) throws Exception {
        File tempFile = tempDir.resolve("scores.txt").toFile();
        setFilePath(scoreboard, tempFile.getAbsolutePath());

        scoreboard.updateCurrentScore(10);
        assertDoesNotThrow(() -> scoreboard.save(null));
    }

    // ---- readFile with malformed input ----

    @Test
    void readFile_skipsMalformedLines(@TempDir Path tempDir) throws Exception {
        File tempFile = tempDir.resolve("scores.txt").toFile();
        try (PrintWriter pw = new PrintWriter(tempFile)) {
            pw.println("100\tAlice");
            pw.println("notanumber\tBob");   // malformed score
            pw.println("50\tCarol");
            pw.println("justonetoken");       // missing name token
        }

        Scoreboard reader = new Scoreboard();
        setFilePath(reader, tempFile.getAbsolutePath());
        reader.readFile();

        // Valid lines are parsed; malformed lines are skipped without exception
        assertEquals(100, reader.getScoreAt(0));
        assertEquals("Alice", reader.getNameAt(0));
        assertEquals(50, reader.getScoreAt(1));
        assertEquals("Carol", reader.getNameAt(1));
    }

    @Test
    void readFile_missingFileReturnsFilledPlaceholders(@TempDir Path tempDir) throws Exception {
        File nonExistent = tempDir.resolve("does_not_exist.txt").toFile();
        Scoreboard reader = new Scoreboard();
        setFilePath(reader, nonExistent.getAbsolutePath());
        reader.readFile();

        // Should be filled with placeholder entries, not null
        assertEquals("------", reader.getNameAt(0));
        assertEquals(0, reader.getScoreAt(0));
    }

    // ---- getScores (smoke test) ----

    @Test
    void getScores_returnsNonNullString() {
        assertNotNull(scoreboard.getScores());
    }

    // ---- helper: use reflection to override the static file path for isolation ----

    private static void setFilePath(Scoreboard sb, String path) throws Exception {
        Field f = Scoreboard.class.getDeclaredField("filePath");
        f.setAccessible(true);
        f.set(null, path);
    }
}
