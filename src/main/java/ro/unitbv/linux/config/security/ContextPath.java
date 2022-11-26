package ro.unitbv.linux.config.security;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ContextPath {

    CSS("/css/**"),
    JS("/js/**"),
    IMG("/img/**"),

    BOOTSTRAP("/bootstrap/**"),

    BOOSTRAP_CSS("/bootstrap/css/**"),
    BOOTSTRAP_JS("/bootstrap/js/**"),
    FONTS("/fonts/**");


    private String contextString;

}
