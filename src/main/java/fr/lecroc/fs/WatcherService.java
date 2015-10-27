package fr.lecroc.fs;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Map;

/**
 * Created by Croc on 27/10/2015.
 */
@Service
public class WatcherService implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherService.class);

    private final WatchService watchService;
    private Map<WatchKey, PathMonitor> keys;


    public WatcherService() throws IOException {
        this.watchService = FileSystems.getDefault().newWatchService();
    }

    @Override
    public void run() {

        for(;;) {
            LOGGER.info("Running ...");
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
