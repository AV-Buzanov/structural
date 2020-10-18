package ru.iteco.structural.bridge.log.after;

import java.util.Collections;

/**
 * MultiLineLogParser.
 *
 * @author Ilya_Sukhachev
 */
public class MultiLineLogParser implements ILogParser {
    @Override
    public Iterable<LogEntry> parse(String text) {
        return Collections.EMPTY_LIST;
    }
}
