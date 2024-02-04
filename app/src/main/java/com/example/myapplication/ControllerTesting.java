package com.example.myapplication;

public class ControllerTesting {
}

//Add checks for:
/*
1. Button PRESS, not release, not hold (click)
    this should not be the same function as hold
2. Button hold (while held)
3. Button release (after held)
4. ABXY vs. D pad
5. D pad
6. ABXY
7. Joystick axis
8. Output for joystick angle calculation
9. Triggers and shoulder buttons
10. Add konami code (god mode? secret mode? secret class? doomsday/sudden death?)
    Up, Up, Down, Down, Left, Right, Left, Right, B, A, start(?)
 */

//Check1:
/*
        onKeyDown. Switch case-contains ABXY and D-pad.
        code specification uses "handled". Failure to update variable will
        result in double pings of the action
 */

//Checks2+3:
/*
        onKeyLongPress opens operation. Same switch case.
        "handled" is returned as true and summons function.
        Global boolean variables mapped to each button (starting false).
        onkey changes value to true. Called function runs a loop while
        global variable is true. onKeyUp checks the button and changes
        value of boolean variable to false.
        Functions for button release - reversed process.
 */

//Check4:
/*
        Both are SOURCE_GAMEPAD. D pad can be SOURCE_DPAD.
 */

//Check5:
/*
        this and 6 check in documentation
 */