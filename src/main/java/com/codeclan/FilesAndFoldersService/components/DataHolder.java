package com.codeclan.FilesAndFoldersService.components;

import com.codeclan.FilesAndFoldersService.models.File;
import com.codeclan.FilesAndFoldersService.models.Folder;
import com.codeclan.FilesAndFoldersService.models.Person;
import com.codeclan.FilesAndFoldersService.repositories.FileRepository;
import com.codeclan.FilesAndFoldersService.repositories.FolderRepository;
import com.codeclan.FilesAndFoldersService.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile(("!test"))
@Component
public class DataHolder implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person mack = new Person("Ronald MacDonald");
        personRepository.save(mack);

        Person charlie = new Person("Charlie Kelly");
        personRepository.save(charlie);

        Person dennis = new Person("Dennis Reynolds");
        personRepository.save(dennis);

        Person dee = new Person("Deandra Reynolds");
        personRepository.save(dee);

        Person frank = new Person("Frank Reynolds");
        personRepository.save(frank);

        Folder paddys = new Folder("Paddys Business", frank);
        folderRepository.save(paddys);

        Folder wolfcola = new Folder("Wolf Cola Business", frank);
        folderRepository.save(wolfcola);

        Folder tapes = new Folder("Tapes", dennis);
        folderRepository.save(tapes);

        File egg = new File("Can I offer you a nice egg in this trying time", "jpegg", 300, paddys);
        fileRepository.save(egg);

        File trashman = new File("I'm the trash man", "trsh", 413, paddys);
        fileRepository.save(trashman);

        File nightman = new File("the night man cometh", "ngm", 567, paddys);
        fileRepository.save(nightman);



    }
}
