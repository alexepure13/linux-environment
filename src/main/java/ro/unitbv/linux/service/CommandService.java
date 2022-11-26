package ro.unitbv.linux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unitbv.linux.dto.CommandDto;
import ro.unitbv.linux.dto.UserAccountRegDto;
import ro.unitbv.linux.entity.Command;
import ro.unitbv.linux.entity.UserAccount;
import ro.unitbv.linux.mapper.CommandMapper;
import ro.unitbv.linux.repository.CommandRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CommandService {

    @Autowired
    CommandRepository commandRepository;

    @Autowired
    CommandMapper commandMapper;

    public List<CommandDto> getCommands(){
        return commandRepository.findAll().stream()
                .map(e -> commandMapper.mapCommandDto(e))
                .collect(Collectors.toList());
    }

    public Command getCommandById(int id) throws Exception{
        Optional<Command> command = commandRepository.findById(id);

        if(command.isPresent())
            return command.get();
        else
            throw new Exception("Exceptie");
    }

    public void saveCommand(CommandDto commandDto){
        Command command = commandMapper.mapCommand(commandDto);
        commandRepository.save(command);
    }

    public void deleteCommandById(int id){
        commandRepository.deleteById(id);
    }
}
