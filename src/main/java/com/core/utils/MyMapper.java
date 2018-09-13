package com.core.utils;

import java.io.Serializable;

public interface MyMapper<T, ID extends Serializable> {

    T insert(T t);
}
