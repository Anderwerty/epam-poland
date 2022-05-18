package com.epam.poland.module2.lesson1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

import static java.nio.file.StandardWatchEventKinds.*;

public class Example9 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/file.txt");
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());

        System.out.println(path.getFileName());

        System.out.println(path.getParent().getParent());
        System.out.println(path.subpath(0, 2));

        String name = "Andrii";
        String name1 ="Alex";
        if(name1.equals(name)){

        }


        Path dir = Paths.get("src/main/resources/");
        WatchService watcher = new WatchService() {
            @Override
            public void close() throws IOException {
                System.out.println("close");
            }

            @Override
            public WatchKey poll() {
                return null;
            }

            @Override
            public WatchKey poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public WatchKey take() throws InterruptedException {
                return null;
            }
        };

        //Listener, Observer
        WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
    }
}
