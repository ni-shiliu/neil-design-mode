package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/30
 */
public interface Command {
    void execute();
    void undo();
}
