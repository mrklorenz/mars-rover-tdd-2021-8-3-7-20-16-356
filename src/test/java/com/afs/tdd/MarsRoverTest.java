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
        RoverStatus expectedStatus = new RoverStatus(0, 0, "W");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionE_when_execute_command_given_x0_y0_directionN_commandR() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "E");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_yNegative1_directionS_when_execute_command_given_x0_y0_directionS_commandM() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedStatus = new RoverStatus(0, -1, "S");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionE_when_execute_command_given_x0_y0_directionS_commandL() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "E");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionW_when_execute_command_given_x0_y0_directionS_commandR() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "W");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x1_y0_directionE_when_execute_command_given_x0_y0_directionE_commandM() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedStatus = new RoverStatus(1, 0, "E");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionN_when_execute_command_given_x0_y0_directionE_commandL() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "N");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionS_when_execute_command_given_x0_y0_directionE_commandR() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "S");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_xNegative1_y0_directionW_when_execute_command_given_x0_y0_directionW_commandM() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedStatus = new RoverStatus(-1, 0, "W");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionS_when_execute_command_given_x0_y0_directionW_commandL() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "S");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_x0_y0_directionN_when_execute_command_given_x0_y0_directionW_commandR() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedStatus = new RoverStatus(0, 0, "N");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(expectedStatus.getLocationX()).isEqualTo(marsRover.getRoverStatus().getLocationX());
        assertThat(expectedStatus.getLocationY()).isEqualTo(marsRover.getRoverStatus().getLocationY());
        assertThat(expectedStatus.getDirection()).isEqualTo(marsRover.getRoverStatus().getDirection());
    }












}
