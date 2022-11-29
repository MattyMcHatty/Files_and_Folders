package com.codeclan.FilesAndFoldersService.repositories;

import com.codeclan.FilesAndFoldersService.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
