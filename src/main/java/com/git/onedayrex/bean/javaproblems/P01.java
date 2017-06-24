package com.git.onedayrex.bean.javaproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by onedayrex on 2017/6/25.
 * 获取列表最后一个元素
 */
public class P01 {

    public static<T> T last(List<T> elements){
        if (elements == null || elements.size() == 0) {
            throw new NoSuchElementException();
        }
        return elements.get(elements.size()-1);
    }

    public static <T> T last(LinkedList<T> elements) {
        if (elements == null || elements.size() == 0) {
            throw new NoSuchElementException();
        }
        return elements.getLast();
    }

    public static <T> T lastRecurSive(List<T> elements) {
        if (elements == null || elements.size() == 0) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 1) {
            return elements.get(0);
        }
        return lastRecurSive(elements.subList(1, elements.size()));
    }

}
