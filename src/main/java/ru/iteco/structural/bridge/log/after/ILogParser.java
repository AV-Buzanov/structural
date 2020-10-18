package ru.iteco.structural.bridge.log.after;

/**
 * ILogParser.
 *
 * @author Ilya_Sukhachev
 */
public interface ILogParser {

    Iterable<LogEntry> parse(String text);
}
