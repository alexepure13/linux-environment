package ro.unitbv.linux.mapper;

import org.springframework.stereotype.Component;
import ro.unitbv.linux.dto.CommandDto;
import ro.unitbv.linux.entity.Command;

@Component
public class CommandMapper {

    public CommandDto mapCommandDto(Command command){

        return CommandDto.builder()
                .id(command.getId())
                .name(command.getName())
                .description(command.getDescription())
                .build();
    }

    public Command mapCommand(CommandDto commandDto){
        return Command.builder()
                .id(commandDto.getId())
                .name(commandDto.getName())
                .description(commandDto.getDescription())
                .build();
    }

}
