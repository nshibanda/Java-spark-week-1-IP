package ceaser.cipher.cc;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ceaser.cipher.cc.Decoding;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {

    @Test
    @DisplayName("Testing Decoding Program")
    void decode() {
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", Decoding.decode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
        assertEquals("B@#", Decoding.decode("A@#", -1));
    }
}