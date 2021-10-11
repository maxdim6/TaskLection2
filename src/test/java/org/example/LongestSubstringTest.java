package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void LongestSubstring(){
        LongestSubstring longestSubstring = new LongestSubstring();

        assertEquals(0, longestSubstring.getLengthOfLongestSubstring(""));
        assertEquals(1, longestSubstring.getLengthOfLongestSubstring("a"));
        assertEquals(1, longestSubstring.getLengthOfLongestSubstring("aa"));
        assertEquals(1, longestSubstring.getLengthOfLongestSubstring("bbbb"));
        assertEquals(3, longestSubstring.getLengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, longestSubstring.getLengthOfLongestSubstring("pwwkew"));
        assertEquals(3, longestSubstring.getLengthOfLongestSubstring("babad"));
        assertEquals(4, longestSubstring.getLengthOfLongestSubstring("wkewl"));
        assertEquals(2, longestSubstring.getLengthOfLongestSubstring("pww"));
        assertEquals(4, longestSubstring.getLengthOfLongestSubstring("eabcb"));
        assertEquals(2, longestSubstring.getLengthOfLongestSubstring("abba"));
    }
}