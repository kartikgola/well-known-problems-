package ood.bitcask;

import javafx.util.Pair;

import java.io.IOException;
import java.io.RandomAccessFile;

public interface BitcaskReader {

    Pair<String, String> read(RandomAccessFile file, long seekOffset) throws IOException;

}
