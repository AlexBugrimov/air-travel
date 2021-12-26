package dev.bug.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoutePoint {

    private String name;
    private double x;
    private double y;
}
