package dk.itu.spcl.eyedroid.sdk.impl;

import dk.itu.spcl.eyedroid.sdk.core.pipes.BlockingPipe;

/**
 * Created by centos on 10/13/14.
 */
public class PipeImplementation extends BlockingPipe {

    public int getPipeSize(){
        return mInternalQueue.size();
    }
}