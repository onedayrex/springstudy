package com.git.onedayrex.bean.javaproblems;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by onedayrex on 2017/6/25.
 */
public class P01Test {
    @Test
    public void last() throws Exception {
        List<String> list = Arrays.asList(new String[]{"i","f","s"});
        assertEquals("s",P01.last(list));
    }

    @Test
    public void last1() throws Exception {
    }

    @Test
    public void lastRecurSive() throws Exception {

    }

}