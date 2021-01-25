package com.online.taxi.dto.map;


/**
 * 距离测量结果
 *
 */
public class Route {

    /**
     * 行驶距离（米）
     */
    private Double distance;

    /**
     * 行驶时间（秒）
     */
    private Double duration;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
