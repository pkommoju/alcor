package com.futurewei.alioth.controller.comm.serialization;

import com.futurewei.alioth.controller.schema.Goalstate.GoalState;
import org.apache.kafka.common.serialization.Serializer;

public class GoalStateSerializer implements Serializer<GoalState> {

    public GoalStateSerializer() {
    }

    public byte[] serialize(String topic, GoalState data) {
        return data == null ? null : data.toByteArray();
    }
}