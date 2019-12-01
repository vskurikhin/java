package com.javarush.task.task01.task0132;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        Solution.main(null);
    }
}