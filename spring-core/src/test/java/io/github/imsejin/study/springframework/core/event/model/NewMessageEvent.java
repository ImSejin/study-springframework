package io.github.imsejin.study.springframework.core.event.model;

import lombok.Getter;
import org.springframework.context.ApplicationListener;

/**
 * Spring framework 4.2부터 {@link ApplicationListener}를 구현하지 않아도 된다.
 */
@Getter
public class NewMessageEvent {

    private final Object source;

    private final String message;

    public NewMessageEvent(Object source, String message) {
        this.source = source;
        this.message = message;
    }

}
