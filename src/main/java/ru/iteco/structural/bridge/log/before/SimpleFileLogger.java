package ru.iteco.structural.bridge.log.before;

import static java.util.stream.Collectors.toList;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * SimpleFileLogger.
 *
 * @author Ilya_Sukhachev
 */
public class SimpleFileLogger extends FileLogger {

    public SimpleFileLogger(String fileName) {
        super(fileName);
    }

    @Override
    protected Iterable<LogEntry> parse(String text) {
        return Arrays.stream(text.split("\n"))
                .map(s -> new LogEntry(LocalDateTime.now(), s))
                .collect(toList());
    }
}
