package com.ChatLogParser;
class IdleChatFilter implements MessageFilter<String> {

    String[] idleWords = {"lol", "brb", "haha"};

    public boolean allow(String message) {
        for (String word : idleWords) {
            if (message.toLowerCase().contains(word))
                return false;
        }
        return true;
    }
}
