package de.plushnikov.intellij.lombok.processor.clazz.log;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Plushnikov Michail
 */
public class Slf4jProcessor extends AbstractLogProcessor {

  private static final String CLASS_NAME = Slf4j.class.getName();

  private static final String LOGGER_TYPE = "org.slf4j.Logger";
  private static final String LOGGER_INITIALIZER = "org.slf4j.LoggerFactory.getLogger(LogExample.class);";

  public Slf4jProcessor() {
    super(CLASS_NAME, LOGGER_TYPE, LOGGER_INITIALIZER);
  }
}