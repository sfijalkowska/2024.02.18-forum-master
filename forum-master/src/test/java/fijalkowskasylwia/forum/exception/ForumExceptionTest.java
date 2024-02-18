package com.github.fijalkowskasylwia.forum.exception;

import static org.junit.Assert.assertEquals;

import com.github.fijalkowskasylwia.forum.UnitsTestCase;
import com.github.fijalkowskasylwia.forum.exception.ForumException.ErrorCode;
import org.junit.Test;

public class ForumExceptionTest extends UnitsTestCase {

    @Test
    public void testShouldGetMessageBasedOnErrorCode() {
        ForumException exception = new ForumException(ErrorCode.INTERNAL_ERROR);
        assertEquals("Internal server error", exception.getMessage());
    }

}
