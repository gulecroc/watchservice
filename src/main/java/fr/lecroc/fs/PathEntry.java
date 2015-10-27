package fr.lecroc.fs;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Croc on 27/10/2015.
 */
public class PathEntry {

    private static final Logger LOGGER = LoggerFactory.getLogger(PathEntry.class);

    private final Path path;

    public PathEntry(Path path) {
        this.path = Preconditions.checkNotNull(path);
    }

    public Path getPath() {
        return path;
    }

    /**
     * Refresh the path entry attributes and returns the path event kind.
     * @return @PathEventKind.Created
     */
    public PathEventKind refresh() {

        return null;

    }

}
