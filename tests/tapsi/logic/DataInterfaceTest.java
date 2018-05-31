package tapsi.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class DataInterfaceTest {

    @Nested
    @DisplayName("If DB doesn't exist or is empty")
    class ifDBDoesNotExist {
        @Test
        @DisplayName("getLocalPaths should be NULL")
        void getLocalPathsIfDBIsEmpty() {
            assertNull(DataInterface.getLocalPaths());
        }

        @Test
        @DisplayName("getFeedPath should be NULL")
        void getFeedPathIfDBIsEmpty() {
            assertNull(DataInterface.getLocalPaths());
        }
    }
}