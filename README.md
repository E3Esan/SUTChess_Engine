# SUTChess
This is a project by Birth But With Me team from  SUT (3rd class of computer science), in this 2nd semester of 2026 we are making a software using Java langauage by requirement that must contain 'Inheritance' and 'more than 15 classes' and 'more than 12 method' and 'Polymorphism' and 'Aggregation/Composition' and Database and so on.

Instead of making management software we decide to do something that is a little more fun and in some way, challenging (we never write Java before). We decide to do chess.

A Java Swing chess game, developed for **1101093 Project in Object-Oriented Programming and Data Structures** (Semester 2/2569, Suranaree University of Technology). The current version opens a desktop window and draws an 8 × 8 checkerboard. Pieces, player input, legal moves, and game rules are not implemented yet.

## Team

| Name | Student ID | Role |
|------|------------|------|
| TODO | TODO | TODO |

Advisor: TODO

## Requirements

- JDK 17 or later
- A desktop environment capable of displaying Swing windows

## Run

```sh
mkdir -p bin
javac -d bin src/*.java
java -cp bin Main
```

In VS Code, you can also open the project folder and run `Main.java` as a Java application.

## Project structure

```text
src/
  Main.java       Creates and displays the application window
  GamePanel.java  Runs the game loop and paints the panel
  Board.java      Draws the checkerboard
bin/              Compiled Java classes (generated)
```

All source classes currently use Java's default package.

## Current status

- Non-resizable 900 × 900 Swing window
- 8 × 8 board with alternating light and dark squares
- Simple game loop that repaints the panel

## Planned features

**Gameplay**
- Draw pieces and handle mouse input to select and move them
- Legal-move validation, turns, check, and checkmate

**Data structures (course requirement)**
- File input: load and save games from/to a text file
- Sorting: sort saved games and move history (e.g., by date, player, or move count)
- Searching: search saved games by player name or date

**Creativity and impact**
- TODO: describe what makes the project useful or different (e.g., a beginner mode that highlights legal moves)

## OOP design (course requirement)

| Concept | Planned use |
|---------|-------------|
| Inheritance | Abstract `Piece` extended by `King`, `Queen`, `Rook`, `Bishop`, `Knight`, `Pawn` |
| Polymorphism | Each piece overrides `getValidMoves()` / `canMoveTo()` |
| Composition / Aggregation | `Game` has a `Board`; `Board` has `Square`s that hold `Piece`s; `Game` has `Player`s |

Target scope: 10+ classes and 12+ methods covering all major features.

## Project timeline

| Date | Milestone |
|------|-----------|
| 19 Nov 2026 | Progress 2: system and UI design (30%) |
| 26 Nov 2026 | Progress 3: system and UI design (100%) |
| 17 Dec 2026 | Progress 5: program 70% |
| 24 Dec 2026 | Progress 6: program 100% and testing |
| 11–15 Jan 2027 | Final submission and presentation |
