import static org.junit.jupiter.api.Assertions.*;

class CISQueueLinkedListTest {

    CISQueueLinkedList queue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         queue = new CISQueueLinkedList(1);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        queue = null;
    }

    @org.junit.jupiter.api.Test
    void size() {

        assertEquals(1, queue.size());
        queue.enqueue(2);
        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());

    }

    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void enqueue() {

        assertEquals(1, queue.size());
        assertEquals("1 -> null", queue.toString());
        queue.enqueue(2);
        assertEquals(2, queue.size());
        assertEquals("1 -> 2 -> null", queue.toString());
        queue.enqueue(3);
        assertEquals(3, queue.size());
        assertEquals("1 -> 2 -> 3 -> null", queue.toString());

    }

    @org.junit.jupiter.api.Test
    void dequeue() {

        assertEquals(1, queue.size());
        assertEquals("1 -> null", queue.toString());
        queue.dequeue();
        assertEquals(0, queue.size());
        assertEquals("null", queue.toString());

        assertThrows(RuntimeException.class, ()->{queue.dequeue();});

        queue.enqueue(2);
        assertEquals(1, queue.size());
        assertEquals("2 -> null", queue.toString());
        queue.enqueue(3);
        assertEquals(2, queue.size());
        assertEquals("2 -> 3 -> null", queue.toString());

    }

    @org.junit.jupiter.api.Test
    void contains() {

        assertFalse(queue.contains(0));
        assertTrue(queue.contains(1));
        assertFalse(queue.contains(2));
        queue.enqueue(2);
        assertTrue(queue.contains(2));
        assertFalse(queue.contains(3));
        queue.enqueue(3);
        assertTrue(queue.contains(3));
        assertTrue(queue.contains(1));
        queue.dequeue();
        assertFalse(queue.contains(1));
        assertTrue(queue.contains(2));
        queue.dequeue();
        assertFalse(queue.contains(2));
        assertTrue(queue.contains(3));

    }

    @org.junit.jupiter.api.Test
    void testToString() {

        assertEquals("1 -> null", queue.toString());
        queue.enqueue(21);
        assertEquals("1 -> 21 -> null", queue.toString());
        queue.enqueue(33);
        assertEquals("1 -> 21 -> 33 -> null", queue.toString());
        queue.dequeue();
        assertEquals("21 -> 33 -> null", queue.toString());

    }

}