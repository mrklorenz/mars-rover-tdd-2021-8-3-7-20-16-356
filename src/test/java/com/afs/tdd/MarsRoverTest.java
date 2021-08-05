package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @Test
    void should_return_x0_y1_directionN_when_execute_command_given_x0_y0_directionN_commandM() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedStatus = new RoverStatus(0, 1, "N");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionW_when_execute_command_given_x0_y0_directionN_commandL() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedStatus = new RoverStatus(0, 1, "N");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }






}
