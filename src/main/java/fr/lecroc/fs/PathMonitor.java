package fr.lecroc.fs;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.nio.file.Path;

/**
 * Created by Croc on 27/10/2015.
 */
public class PathMonitor {

    private final LoadingCache<Path, PathEntry> entries;

    public PathMonitor() {
        this.entries = CacheBuilder.newBuilder().build(new CacheLoader<Path, PathEntry>() {
            @Override
            public PathEntry load(Path key) throws Exception {
                return new PathEntry(key);
            }
        });
    }
}
