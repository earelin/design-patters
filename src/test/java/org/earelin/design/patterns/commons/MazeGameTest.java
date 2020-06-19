package org.earelin.design.patterns.commons;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MazeGameTest {
  @Test
  void create_maze() {
    Maze maze = MazeGame.createMaze();

    assertThat(maze.getRoomById(1))
        .isNotNull();
    assertThat(maze.getRoomById(2))
        .isNotNull();
  }
}
