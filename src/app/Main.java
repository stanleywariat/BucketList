package app;

import data.Place;
import utils.DataReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String appName = "BucketList v0.2";
        BucketControl bc = new BucketControl();
        bc.controlLoop();

    }
}
