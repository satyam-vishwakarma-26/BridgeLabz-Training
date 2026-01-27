package com.ChatLogParser;
interface MessageFilter<T> {
    boolean allow(T message);
}
