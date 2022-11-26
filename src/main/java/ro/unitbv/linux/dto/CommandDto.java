package ro.unitbv.linux.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandDto {

    private int id;
    private String name;
    private String description;
}
