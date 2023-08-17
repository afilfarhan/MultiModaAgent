import furhatos.app.mrsmurphy.flow.main.Rvalue
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.furhat
import furhatos.gestures.*



val confusion = defineGesture("confusion") {
    frame(0.0, 0.9) {
        ARKitParams.BROW_INNER_UP to -1.5
        ARKitParams.BROW_DOWN_LEFT to 1.1
        ARKitParams.BROW_DOWN_RIGHT to 1.1
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        ARKitParams.EYE_BLINK_RIGHT to 0.2
        ARKitParams.EYE_BLINK_LEFT to 0.2
//        ARKitParams.EYE_LOOK_UP_LEFT to 0.1
//        ARKitParams.EYE_LOOK_UP_RIGHT to 0.1
//        ARKitParams.MOUTH_STRETCH_LEFT to -1.0
//        ARKitParams.MOUTH_STRETCH_RIGHT to -1.0
//        ARKitParams.MOUTH_PUCKER to 1.0
        ARKitParams.MOUTH_CLOSE to -0.2
    }
    frame(0.9, 1.7) {
        ARKitParams.BROW_INNER_UP to -0.7
        ARKitParams.BROW_DOWN_LEFT to 1.2
        ARKitParams.BROW_DOWN_RIGHT to 1.2
        ARKitParams.EYE_SQUINT_LEFT to 0.3
        ARKitParams.EYE_SQUINT_RIGHT to 0.3
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
        ARKitParams.EYE_BLINK_RIGHT to 0.1
        ARKitParams.EYE_BLINK_LEFT to 0.1
    }
    frame(1.7, 2.2) {
        ARKitParams.BROW_INNER_UP to -0.5
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
//        ARKitParams.MOUTH_STRETCH_LEFT to 0
//        ARKitParams.MOUTH_STRETCH_RIGHT to 0
//        ARKitParams.MOUTH_PUCKER to 0
        ARKitParams.MOUTH_CLOSE to 0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
        ARKitParams.EYE_BLINK_RIGHT to 0
        ARKitParams.EYE_BLINK_LEFT to 0
    }
    frame(2.2, 2.9) {
        ARKitParams.BROW_INNER_UP to -0.3
        ARKitParams.BROW_DOWN_LEFT to 0.9
        ARKitParams.BROW_DOWN_RIGHT to 0.9
        ARKitParams.EYE_SQUINT_LEFT to 0.3
        ARKitParams.EYE_SQUINT_RIGHT to 0.3
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    reset(2.9)
}

val caring = defineGesture("caring") {
    frame(0.0, 0.8) {
        BasicParams.EXPR_SAD to -1.0
        ARKitParams.BROW_OUTER_UP_LEFT to -0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to -0.5
        BasicParams.NECK_TILT to 5.0
        BasicParams.NECK_PAN to 5.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
        ARKitParams.MOUTH_SMILE_LEFT to 0.6
    }
    frame(0.8, 1.7) {
        BasicParams.EXPR_SAD to -1.0
        ARKitParams.BROW_OUTER_UP_LEFT to -0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to -0.5
        BasicParams.NECK_TILT to 5.0
        BasicParams.NECK_PAN to -5.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.7
        ARKitParams.MOUTH_SMILE_LEFT to 0.7
    }
    frame(1.7, 2.3) {
        BasicParams.EXPR_SAD to -1.0
        ARKitParams.BROW_OUTER_UP_LEFT to -0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to -0.5
        BasicParams.NECK_TILT to -5.0
        BasicParams.NECK_PAN to 5.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.9
        ARKitParams.MOUTH_SMILE_LEFT to 0.9
    }
    frame(2.3, 2.9) {
        BasicParams.EXPR_SAD to -1.0
        ARKitParams.BROW_OUTER_UP_LEFT to -0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to -0.5
        BasicParams.NECK_TILT to -5.0
        BasicParams.NECK_PAN to 0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
        ARKitParams.MOUTH_SMILE_LEFT to 0.6
    }
    reset(2.9)
}

val admiration = defineGesture("admiration") {
    frame(0.0, 0.9) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_UP_LEFT to 0.5
        ARKitParams.EYE_LOOK_UP_RIGHT to 0.5
        BasicParams.EXPR_SAD to -0.5
    }
    frame(0.9, 1.7) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_UP_LEFT to 0.5
        ARKitParams.EYE_LOOK_UP_RIGHT to 0.5
        BasicParams.EXPR_SAD to -0.3
    }
    frame(1.7, 2.5) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_UP_LEFT to 0.2
        ARKitParams.EYE_LOOK_UP_RIGHT to 0.2
        BasicParams.EXPR_SAD to -0.1
    }
    frame(2.5, 2.9) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.3
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.3
        ARKitParams.EYE_LOOK_UP_LEFT to 0.1
        ARKitParams.EYE_LOOK_UP_RIGHT to 0.1
        BasicParams.EXPR_SAD to 0.0
    }
    reset(2.9)
}


val disappointment = defineGesture("disappointment") {
    frame(0.0, 0.8) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        BasicParams.EXPR_SAD to 1
    }
    frame(0.8, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        BasicParams.EXPR_SAD to 0.7
    }
    frame(1.5, 1.9) {
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        ARKitParams.CHEEK_SQUINT_LEFT to 0.8
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.8
        BasicParams.EXPR_SAD to 0.9
    }
    frame(1.9, 2.6) {
        ARKitParams.BROW_DOWN_LEFT to 0.9
        ARKitParams.BROW_DOWN_RIGHT to 0.9
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.9
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.9
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.8
        ARKitParams.CHEEK_SQUINT_LEFT to 0.8
        BasicParams.EXPR_SAD to 1.0
    }
    reset(2.6)
}

val amusement = defineGesture("amusement") {
    frame(0.0, 0.9) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_SQUINT_LEFT to 0.3
        ARKitParams.EYE_SQUINT_RIGHT to 0.3
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
    }
    frame(0.9, 1.7) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_SQUINT_LEFT to 0.4
        ARKitParams.EYE_SQUINT_RIGHT to 0.4
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
    }
    frame(1.7, 2.5) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.9
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.9
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
        BasicParams.SMILE_CLOSED to 0.7
    }
    frame(2.5, 2.9) {
        ARKitParams.BROW_OUTER_UP_LEFT to 1.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 1.0
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
    }
    reset(2.9)
}


val thinker = defineGesture("thinker") {
    frame(0.32, 1.72) {
        ARKitParams.BROW_OUTER_UP_LEFT to 1
    }
    frame(0.2, 1.72){
        ARKitParams.EYE_LOOK_OUT_LEFT to .3
//        ARKitParams.EYE_LOOK_OUT_RIGHT to -5.0
        ARKitParams.MOUTH_UPPER_UP_LEFT
        BasicParams.NECK_TILT to -10
        BasicParams.NECK_PAN to -10

    }
    frame(0.16, 0.72){
//        ARKitParams.EYE_LOOK_OUT_LEFT to .1
        BasicParams.NECK_TILT to -.1
        ARKitParams.BROW_OUTER_UP_LEFT to .1
    }
    reset(2.0)
}
val thumbsdown = defineGesture("thumbsdown") {
    frame(0.1, 1.5) {
        BasicParams.NECK_TILT to 1
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.7
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.7
    }
    frame(0.8, 1.2) {
        BasicParams.NECK_PAN to 10
    }
    frame(1.2, 1.6) {
        BasicParams.NECK_PAN to -10
    }
    frame(1.6, 2.0) {
        BasicParams.NECK_PAN to 2
    }
    frame(2.0, 2.4) {
        BasicParams.NECK_TILT to 0
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.2
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.2

    }
    reset(2.4)
}
val thumbsup = defineGesture("thumbsup") {
    frame(0.1, 1.5) {
        BasicParams.NECK_TILT to 10
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.7
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.7
    }
    frame(1.0, 1.5) {
        BasicParams.NECK_TILT to 0
    }
    frame(1.5, 2.0) {
        BasicParams.NECK_TILT to 5
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.2
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.2

    }
    reset(2.0)
}

val annoyance = defineGesture("annoyance") {
    frame(0.0, 0.7) {
        ARKitParams.BROW_INNER_UP to 0.3
        ARKitParams.BROW_OUTER_UP_LEFT to 0.3
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.3
        BasicParams.EXPR_ANGER to 0.4
        BasicParams.EXPR_DISGUST to 0.4
        BasicParams.EXPR_SAD to 0.1
    }
    frame(0.7, 1.3) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        BasicParams.EXPR_ANGER to 0.6
        BasicParams.EXPR_DISGUST to 0.6
        BasicParams.EXPR_SAD to 0.1
    }
    frame(1.3, 2.1) {
        ARKitParams.BROW_INNER_UP to 1.0
        ARKitParams.BROW_OUTER_UP_LEFT to 1.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 1.0
        BasicParams.EXPR_ANGER to 0.8
        BasicParams.EXPR_DISGUST to 0.8
        BasicParams.EXPR_SAD to 0.1
    }
    reset(2.1)
}

val approval = defineGesture("approval") {
    frame(0.0, 0.7) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.MOUTH_SMILE_LEFT to 0.4
        ARKitParams.MOUTH_SMILE_RIGHT to 0.4
        BasicParams.NECK_TILT to 9.6
        BasicParams.NECK_PAN to 0.5
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
    }
    frame(0.7, 1.5) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.MOUTH_SMILE_LEFT to 0.6
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
        BasicParams.NECK_TILT to -7.6
        BasicParams.NECK_PAN to 0.5
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
    }
    frame(1.5, 2.4) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.2
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.8
        ARKitParams.MOUTH_SMILE_RIGHT to 0.8
        BasicParams.NECK_TILT to 7.8
        BasicParams.NECK_PAN to 0.5
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
        BasicParams.EXPR_SAD to 0.1
    }
    reset(2.4)
}

val curiosity = defineGesture("curiosity") {
    frame(0.0, 0.7) {
        ARKitParams.EYE_SQUINT_RIGHT to 0.4
        ARKitParams.EYE_SQUINT_LEFT to 0.2
        ARKitParams.MOUTH_FUNNEL to 0.4
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
    }
    frame(0.7, 1.3) {
        ARKitParams.EYE_SQUINT_RIGHT to 0.6
        ARKitParams.EYE_SQUINT_LEFT to 0.3
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
    }
    frame(1.3, 1.9) {
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
    }
    reset(1.9)
}
val desire = defineGesture("desire") {
    frame(0.0, 1.0) {
        ARKitParams.BROW_INNER_UP to 0.5
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.MOUTH_CLOSE to 0.4

    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.9
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.9
        BasicParams.EXPR_SAD to 0.1
        BasicParams.EXPR_ANGER to 0.1
        BasicParams.EXPR_DISGUST to 0.1
        BasicParams.EXPR_FEAR to 0.1
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_INNER_UP to 0.9
        ARKitParams.BROW_OUTER_UP_LEFT to 1.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 1.0
    }
    reset(1.5)
}
val disapproval = defineGesture("disapproval") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        BasicParams.EXPR_ANGER to 0.8
        BasicParams.EXPR_SAD to 0.3
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.9
        ARKitParams.BROW_DOWN_RIGHT to 0.9
        BasicParams.EXPR_ANGER to 1.0
        BasicParams.EXPR_SAD to 0.5
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 1.0
        ARKitParams.BROW_DOWN_RIGHT to 1.0
        BasicParams.EXPR_ANGER to 0.8
        BasicParams.EXPR_SAD to 0.6
    }
    reset(1.5)
}

val disgust = defineGesture("disgust") {
    frame(0.0, 0.9) {
        ARKitParams.BROW_DOWN_LEFT to 0.8
        ARKitParams.BROW_DOWN_RIGHT to 0.8
        ARKitParams.EYE_SQUINT_LEFT to 1.0
        ARKitParams.EYE_SQUINT_RIGHT to 1.0
        ARKitParams.MOUTH_PRESS_LEFT to 1.0
        ARKitParams.MOUTH_PRESS_RIGHT to 1.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.8
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.8
        BasicParams.EXPR_DISGUST to 1.0
    }
    frame(0.9, 1.7) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        ARKitParams.MOUTH_PRESS_LEFT to 0.8
        ARKitParams.MOUTH_PRESS_RIGHT to 0.8
        ARKitParams.CHEEK_SQUINT_LEFT to 0.5
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.5
        BasicParams.EXPR_DISGUST to 0.8
        BasicParams.NECK_TILT to -7.9
    }
    frame(1.7, 2.3) {
        ARKitParams.BROW_DOWN_LEFT to 0.3
        ARKitParams.BROW_DOWN_RIGHT to 0.3
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        ARKitParams.MOUTH_PRESS_LEFT to 1.0
        ARKitParams.MOUTH_PRESS_RIGHT to 1.0
        ARKitParams.MOUTH_UPPER_UP_RIGHT to 1.0
        ARKitParams.MOUTH_UPPER_UP_LEFT to 1.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.9
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.9
        BasicParams.EXPR_DISGUST to 0.5
    }
    reset(2.3)
}

val embarrassment = defineGesture("embarrassment") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        BasicParams.NECK_TILT to 3.0
        BasicParams.EXPR_SAD to 0.5
        BasicParams.EXPR_ANGER to 0.2
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        BasicParams.NECK_TILT to 6.0
        BasicParams.EXPR_SAD to 0.3
        BasicParams.EXPR_ANGER to 0.1
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        BasicParams.NECK_TILT to 6.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.8
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.8
        BasicParams.EXPR_SAD to 0.5
        BasicParams.EXPR_ANGER to 0.1
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.9
        ARKitParams.BROW_DOWN_RIGHT to 0.9
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.5
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.5
        ARKitParams.CHEEK_SQUINT_RIGHT to 2.0
        BasicParams.NECK_TILT to 8.0
        ARKitParams.CHEEK_SQUINT_LEFT to 2.0
        BasicParams.EXPR_SAD to 0.3
        BasicParams.EXPR_ANGER to 0.1
    }
    reset(2.0)
}

val excitement = defineGesture("excitement") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.4
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.4
        ARKitParams.EYE_WIDE_LEFT to 0.6
        ARKitParams.EYE_WIDE_RIGHT to 0.6
        ARKitParams.MOUTH_STRETCH_LEFT to 0.6
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.6
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_WIDE_LEFT to 0.6
        ARKitParams.EYE_WIDE_RIGHT to 0.6
        ARKitParams.MOUTH_STRETCH_LEFT to 0.4
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.4
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.6
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.6
        ARKitParams.EYE_WIDE_LEFT to 0.6
        ARKitParams.EYE_WIDE_RIGHT to 0.6
        ARKitParams.MOUTH_STRETCH_LEFT to 0.3
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.3
        ARKitParams.MOUTH_CLOSE to -0.5
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_OUTER_UP_LEFT to 0.3
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.3
        ARKitParams.EYE_WIDE_LEFT to 0.5
        ARKitParams.EYE_WIDE_RIGHT to 0.5
        ARKitParams.MOUTH_STRETCH_LEFT to 0.4
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.4
        ARKitParams.MOUTH_CLOSE to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    reset(2.0)
}

val pride = defineGesture("pride") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.6
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.6
        ARKitParams.EYE_BLINK_LEFT to 0.2
        ARKitParams.EYE_BLINK_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.7
        ARKitParams.MOUTH_SMILE_RIGHT to 0.7
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_INNER_UP to 0.6
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_BLINK_LEFT to 0.2
        ARKitParams.EYE_BLINK_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.6
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
        BasicParams.NECK_TILT to -5.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_INNER_UP to 0.5
        ARKitParams.BROW_OUTER_UP_LEFT to 0.4
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.4
        ARKitParams.EYE_BLINK_LEFT to 0.2
        ARKitParams.EYE_BLINK_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.5
        ARKitParams.MOUTH_SMILE_RIGHT to 0.5
        BasicParams.NECK_TILT to -6.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_INNER_UP to 0.4
        ARKitParams.BROW_OUTER_UP_LEFT to 0.3
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.3
        ARKitParams.EYE_BLINK_LEFT to 0.2
        ARKitParams.EYE_BLINK_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.4
        ARKitParams.MOUTH_SMILE_RIGHT to 0.4
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    reset(2.0)
}

val gratitude = defineGesture("gratitude") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.3
        ARKitParams.BROW_DOWN_RIGHT to 0.3
        ARKitParams.MOUTH_SMILE_LEFT to 0.5
        ARKitParams.MOUTH_SMILE_RIGHT to 0.5
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.2
        ARKitParams.BROW_DOWN_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.8
        ARKitParams.MOUTH_SMILE_RIGHT to 0.8
        BasicParams.NECK_TILT to 4.0
        ARKitParams.MOUTH_CLOSE to -0.2
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.1
        ARKitParams.BROW_DOWN_RIGHT to 0.1
        ARKitParams.MOUTH_SMILE_LEFT to 0.9
        ARKitParams.MOUTH_SMILE_RIGHT to 0.9
        BasicParams.NECK_TILT to 5.0
        ARKitParams.MOUTH_CLOSE to -0.1
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.0
        ARKitParams.BROW_DOWN_RIGHT to 0.0
        ARKitParams.MOUTH_SMILE_LEFT to 0.4
        ARKitParams.MOUTH_SMILE_RIGHT to 0.4
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0
    }
    reset(2.0)
}


val grief = defineGesture("grief") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_INNER_UP to 0.2
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        ARKitParams.MOUTH_FROWN_LEFT to 0.7
        ARKitParams.MOUTH_FROWN_RIGHT to 0.7
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.6
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.6
        ARKitParams.CHEEK_SQUINT_RIGHT to -0.6
        ARKitParams.CHEEK_SQUINT_LEFT to -0.6
        BasicParams.EXPR_SAD to 0.8
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(0.5, 1.5) {
        ARKitParams.BROW_INNER_UP to 0.3
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_SQUINT_LEFT to 0.7
        ARKitParams.EYE_SQUINT_RIGHT to 0.7
        ARKitParams.MOUTH_FROWN_LEFT to 0.9
        ARKitParams.MOUTH_FROWN_RIGHT to 0.9
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.8
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.8
        ARKitParams.CHEEK_SQUINT_RIGHT to -1.0
        ARKitParams.CHEEK_SQUINT_LEFT to -1.0
        BasicParams.EXPR_SAD to 0.9
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(1.5, 2.5) {
        ARKitParams.BROW_INNER_UP to 0.4
        ARKitParams.BROW_OUTER_UP_LEFT to 0.8
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.8
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        ARKitParams.MOUTH_FROWN_LEFT to 1.0
        ARKitParams.MOUTH_FROWN_RIGHT to 1.0
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 1.0
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 1.0
        ARKitParams.CHEEK_SQUINT_RIGHT to -0.8
        ARKitParams.CHEEK_SQUINT_LEFT to -0.8
        BasicParams.EXPR_SAD to 1.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    reset(2.5)
}

val joy = defineGesture("joy") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_INNER_UP to 0.5
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_SQUINT_LEFT to 0.1
        ARKitParams.EYE_SQUINT_RIGHT to 0.1
        ARKitParams.MOUTH_SMILE_LEFT to 1.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(0.5, 1.5) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.9
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.9
        ARKitParams.EYE_SQUINT_LEFT to 0.1
        ARKitParams.EYE_SQUINT_RIGHT to 0.1
        ARKitParams.MOUTH_SMILE_LEFT to 1.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(1.5, 2.5) {
        ARKitParams.BROW_INNER_UP to 0.9
        ARKitParams.BROW_OUTER_UP_LEFT to 1.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 1.0
        ARKitParams.EYE_SQUINT_LEFT to 0.0
        ARKitParams.EYE_SQUINT_RIGHT to 0.0
        ARKitParams.MOUTH_SMILE_LEFT to 1.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    reset(2.5)
}

val love = defineGesture("love") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.2
        ARKitParams.BROW_DOWN_RIGHT to 0.2
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        ARKitParams.MOUTH_SMILE_LEFT to 0.8
        ARKitParams.MOUTH_SMILE_RIGHT to 0.8
        ARKitParams.MOUTH_PUCKER to 0.8
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.2
        ARKitParams.BROW_DOWN_RIGHT to 0.2
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        ARKitParams.MOUTH_SMILE_LEFT to 0.9
        ARKitParams.MOUTH_SMILE_RIGHT to 0.9
        ARKitParams.MOUTH_PUCKER to 0.9
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.1
        ARKitParams.BROW_DOWN_RIGHT to 0.1
        ARKitParams.EYE_SQUINT_LEFT to 0.3
        ARKitParams.EYE_SQUINT_RIGHT to 0.3
        ARKitParams.MOUTH_SMILE_LEFT to 1.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
        ARKitParams.MOUTH_PUCKER to 1.0
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.1
        ARKitParams.BROW_DOWN_RIGHT to 0.1
        ARKitParams.EYE_SQUINT_LEFT to 0.2
        ARKitParams.EYE_SQUINT_RIGHT to 0.2
        ARKitParams.MOUTH_SMILE_LEFT to 1.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
        ARKitParams.MOUTH_STRETCH_LEFT to 0.3
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.3
        ARKitParams.MOUTH_PUCKER to 1.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.6
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.6
        BasicParams.EXPR_SAD to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
    }
    reset(2.0)
}

val nervousness = defineGesture("nervousness") {
    frame(0.0, 0.6) {
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        ARKitParams.EYE_WIDE_LEFT to 0.3
        ARKitParams.EYE_WIDE_RIGHT to 0.3
        ARKitParams.MOUTH_STRETCH_LEFT to 0.3
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.3
        ARKitParams.JAW_FORWARD to 0.3
        BasicParams.EXPR_FEAR to 0.7
    }
    frame(0.6, 1.2) {
        ARKitParams.BROW_DOWN_LEFT to 0.8
        ARKitParams.BROW_DOWN_RIGHT to 0.8
        ARKitParams.EYE_WIDE_LEFT to 0.5
        ARKitParams.EYE_WIDE_RIGHT to 0.5
        ARKitParams.MOUTH_STRETCH_LEFT to 0.4
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.4
        ARKitParams.JAW_FORWARD to 0.4
        BasicParams.EXPR_FEAR to 0.8
    }
    frame(1.2, 1.8) {
        ARKitParams.BROW_DOWN_LEFT to 0.9
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_WIDE_LEFT to 0.6
        ARKitParams.EYE_WIDE_RIGHT to 0.6
        ARKitParams.MOUTH_STRETCH_LEFT to 0.5
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.5
        ARKitParams.JAW_FORWARD to 0.5
        BasicParams.EXPR_FEAR to 0.9
    }
    frame(1.8, 2.4) {
        ARKitParams.BROW_DOWN_LEFT to 0.6
        ARKitParams.BROW_DOWN_RIGHT to 0.6
        ARKitParams.EYE_WIDE_LEFT to 0.4
        ARKitParams.EYE_WIDE_RIGHT to 0.4
        ARKitParams.MOUTH_STRETCH_LEFT to 0.6
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.6
        ARKitParams.JAW_FORWARD to 0.6
        BasicParams.EXPR_FEAR to 1.0
    }
    reset(2.4)
}

val optimism = defineGesture("optimism") {
    frame(0.0, 0.6) {
        ARKitParams.BROW_INNER_UP to 0.6
        ARKitParams.BROW_OUTER_UP_LEFT to 0.6
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.6
        ARKitParams.EYE_WIDE_LEFT to 0.7
        ARKitParams.EYE_WIDE_RIGHT to 0.7
        ARKitParams.MOUTH_SMILE_LEFT to 0.6
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
    }
    frame(0.6, 1.2) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_WIDE_LEFT to 0.8
        ARKitParams.EYE_WIDE_RIGHT to 0.8
        ARKitParams.EYE_BLINK_RIGHT to 1.2
        ARKitParams.EYE_BLINK_LEFT to  1.2
        ARKitParams.MOUTH_SMILE_LEFT to 0.6
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
    }
    frame(1.2, 1.8) {
        ARKitParams.BROW_INNER_UP to 0.8
        ARKitParams.BROW_OUTER_UP_LEFT to 0.8
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.8
        ARKitParams.EYE_WIDE_LEFT to 0.9
        ARKitParams.EYE_WIDE_RIGHT to 0.9
        ARKitParams.MOUTH_SMILE_LEFT to 0.7
        ARKitParams.MOUTH_SMILE_RIGHT to 0.7
    }
    frame(1.8, 2.4) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_BLINK_RIGHT to 0
        ARKitParams.EYE_BLINK_LEFT to  0
        ARKitParams.EYE_WIDE_LEFT to 0.7
        ARKitParams.EYE_WIDE_RIGHT to 0.7
        ARKitParams.MOUTH_SMILE_LEFT to 0.7
        ARKitParams.MOUTH_SMILE_RIGHT to 0.7
    }
    reset(2.4)
}


val realization = defineGesture("realization") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_INNER_UP to 0.4
        ARKitParams.BROW_OUTER_UP_LEFT to 0.3
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.3
        ARKitParams.EYE_WIDE_LEFT to 0.5
        ARKitParams.EYE_WIDE_RIGHT to 0.5
        ARKitParams.MOUTH_CLOSE to -0.8
        ARKitParams.CHEEK_SQUINT_LEFT to 0.3
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.3
    }
    frame(0.5, 1.4) {
        ARKitParams.BROW_INNER_UP to 0.6
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_WIDE_LEFT to 0.6
        ARKitParams.EYE_WIDE_RIGHT to 0.6
        ARKitParams.MOUTH_CLOSE to -0.5
        ARKitParams.CHEEK_SQUINT_LEFT to 0.4
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.4
    }
    frame(1.4, 2.1) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.6
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.6
        ARKitParams.EYE_WIDE_LEFT to 0.7
        ARKitParams.EYE_WIDE_RIGHT to 0.7
        ARKitParams.MOUTH_CLOSE to -0.4
        ARKitParams.CHEEK_SQUINT_LEFT to 0.5
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.5
    }
    frame(2.1, 2.9) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_WIDE_LEFT to 0.7
        ARKitParams.EYE_WIDE_RIGHT to 0.7
        ARKitParams.MOUTH_CLOSE to 0.0
        ARKitParams.CHEEK_SQUINT_LEFT to 3.0
        ARKitParams.CHEEK_SQUINT_RIGHT to 3.0
    }
    reset(2.9)
}

val relief = defineGesture("relief") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_BLINK_LEFT to 0.2
        ARKitParams.EYE_BLINK_RIGHT to 0.2
        ARKitParams.MOUTH_CLOSE to -0.7
        ARKitParams.MOUTH_PUCKER to 4.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.2
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.2
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.3
        ARKitParams.BROW_DOWN_RIGHT to 0.3
        ARKitParams.EYE_BLINK_LEFT to 1.0
        ARKitParams.EYE_BLINK_RIGHT to 1.0
        ARKitParams.MOUTH_PUCKER to 4.8
        ARKitParams.MOUTH_CLOSE to -0.5
        ARKitParams.CHEEK_SQUINT_LEFT to 0.3
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.3
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.2
        ARKitParams.BROW_DOWN_RIGHT to 0.2
        ARKitParams.EYE_BLINK_LEFT to 1.0
        ARKitParams.EYE_BLINK_RIGHT to 1.0
        ARKitParams.MOUTH_CLOSE to -0.3
        ARKitParams.MOUTH_PUCKER to 4.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.5
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.5
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.1
        ARKitParams.BROW_DOWN_RIGHT to 0.1
        ARKitParams.EYE_BLINK_LEFT to 0.8
        ARKitParams.EYE_BLINK_RIGHT to 0.8
        ARKitParams.MOUTH_CLOSE to -0.1
        ARKitParams.MOUTH_PUCKER to 3.0
        ARKitParams.CHEEK_SQUINT_LEFT to 0.7
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.7
    }
    reset(2.0)
}

val remorse = defineGesture("remorse") {
    frame(0.0, 0.7) {
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        ARKitParams.MOUTH_FUNNEL to 0.5
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.7
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.7
        ARKitParams.MOUTH_SMILE_LEFT to -1.0
        ARKitParams.MOUTH_SMILE_RIGHT to -1.0
    }
    frame(0.7, 1.4) {
        ARKitParams.BROW_OUTER_UP_LEFT to -1.0
        ARKitParams.BROW_OUTER_UP_RIGHT to -1.0
        ARKitParams.BROW_DOWN_LEFT to 0.6
        ARKitParams.BROW_DOWN_RIGHT to 0.6
        ARKitParams.EYE_SQUINT_LEFT to 0.7
        ARKitParams.EYE_SQUINT_RIGHT to 0.7
        ARKitParams.MOUTH_FUNNEL to 0.7
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.6
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.6
    }
    frame(1.4, 2.1) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_SQUINT_LEFT to 0.6
        ARKitParams.EYE_SQUINT_RIGHT to 0.6
        ARKitParams.MOUTH_FUNNEL to 0.8
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.5
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.5
    }
    frame(2.1, 2.8) {
        ARKitParams.BROW_DOWN_LEFT to 0.4
        ARKitParams.BROW_DOWN_RIGHT to 0.4
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        ARKitParams.MOUTH_FUNNEL to 0.9
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.4
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.4
    }
    reset(2.8)
}

val sadness = defineGesture("sadness") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.7
        ARKitParams.BROW_DOWN_RIGHT to 0.7
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 1.9
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 1.9
        BasicParams.EXPR_SAD to 1.0
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.6
        ARKitParams.BROW_DOWN_RIGHT to 0.6
        ARKitParams.EYE_SQUINT_LEFT to 0.7
        ARKitParams.EYE_SQUINT_RIGHT to 0.7
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 1.5
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 1.5
        BasicParams.EXPR_SAD to 0.8
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_DOWN_LEFT to 0.5
        ARKitParams.BROW_DOWN_RIGHT to 0.5
        ARKitParams.EYE_SQUINT_LEFT to 0.6
        ARKitParams.EYE_SQUINT_RIGHT to 0.6
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 1.2
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 1.2
        BasicParams.EXPR_SAD to 1.5
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_DOWN_LEFT to 0.4
        ARKitParams.BROW_DOWN_RIGHT to 0.4
        ARKitParams.EYE_SQUINT_LEFT to 0.5
        ARKitParams.EYE_SQUINT_RIGHT to 0.5
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 1.0
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 1.0
        BasicParams.EXPR_SAD to 2.0
    }
    reset(2.0)
}

val surprise = defineGesture("surprise") {
    frame(0.0, 0.5) {
        ARKitParams.BROW_INNER_UP to 0.8
        ARKitParams.BROW_OUTER_UP_LEFT to 0.8
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.8
        ARKitParams.EYE_WIDE_LEFT to 1.2
        ARKitParams.EYE_WIDE_RIGHT to 1.2
        ARKitParams.MOUTH_CLOSE to -4.0
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.8
        ARKitParams.MOUTH_STRETCH_LEFT to 0.8
        ARKitParams.MOUTH_PUCKER to 2.0
    }
    frame(0.5, 1.0) {
        ARKitParams.BROW_INNER_UP to 0.7
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_WIDE_LEFT to 1.1
        ARKitParams.EYE_WIDE_RIGHT to 1.1
        ARKitParams.MOUTH_CLOSE to -3.5
    }
    frame(1.0, 1.5) {
        ARKitParams.BROW_INNER_UP to 0.6
        ARKitParams.BROW_OUTER_UP_LEFT to 0.6
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.6
        ARKitParams.EYE_WIDE_LEFT to 1.0
        ARKitParams.EYE_WIDE_RIGHT to 1.0
        ARKitParams.MOUTH_CLOSE to -3.0
    }
    frame(1.5, 2.0) {
        ARKitParams.BROW_INNER_UP to 0.5
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_WIDE_LEFT to 0.9
        ARKitParams.EYE_WIDE_RIGHT to 0.9
        ARKitParams.MOUTH_CLOSE to -1.0
    }
    reset(2.0)
}

val neutral = defineGesture("neutral") {
    frame(0.0, 2.5) {
        ARKitParams.BROW_INNER_UP to 0.0
        ARKitParams.BROW_OUTER_UP_LEFT to 0.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.0
        ARKitParams.EYE_WIDE_LEFT to 0.0
        ARKitParams.EYE_WIDE_RIGHT to 0.0
        ARKitParams.MOUTH_CLOSE to 0.0
        BasicParams.EXPR_ANGER to 0.0
        BasicParams.EXPR_DISGUST to 0.0
        BasicParams.EXPR_FEAR to 0.0
        BasicParams.EXPR_SAD to 0.0

    }
    reset(2.5)
}


fun gesturecall(code: String): State = state {


        print("gesture is called")

}


fun theparser(response: Rvalue): State = state {
    onEntry {
        // println("inupe value to the funtion:"+response)
//        val rmv = Regex("Murphy:|Gesture:")
//        val regex = Regex(":\\w+:")
        var speechres=response.stringValue
//        val emojis = regex.findAll(response).map { it.value }.toList()
        // println("full list of emojis found"+emojis)
//        val response2=  response.replace(regex, "   ^")
        var cu="confusion"
        val gestureMap = mapOf(
            "admiration" to admiration,
            "amusement" to amusement,
            "anger" to Gestures.ExpressAnger,
            "annoyance" to annoyance,
            "approval" to approval,
            "caring" to caring,
            "confusion" to confusion,
            "curiosity" to curiosity,
            "desire" to desire,
            "disappointment" to disappointment,
            "disapproval" to disapproval,
            "disgust" to disgust,
            "embarrassment" to embarrassment,
            "excitement" to excitement,
            "fear" to Gestures.ExpressFear,
            "gratitude" to gratitude,
            "grief" to grief,
            "joy" to joy,
            "love" to love,
            "nervousness" to nervousness,
            "optimism" to optimism,
            "pride" to pride,
            "realization" to realization,
            "relief" to relief,
            "remorse" to remorse,
            "sadness" to sadness,
            "surprise" to surprise,
            "neutral" to neutral
        )
        var su = response.stringArray[0].trim()

        val defaultGesture: Gesture = caring
        val gesture: Gesture = gestureMap[su] ?: defaultGesture
        furhat.gesture(gesture, async = true)

//        val splitResponse = response2.split("^")
        var res = 0
        for(item in response.stringArray){
            println(item)
        }
        furhat.say(speechres)
        if(response.stringArray.size>1){
            var su =response.stringArray[1].trim()
            println("SEcond emoji: "+su)
            val defaultGesture: Gesture = caring
            val gesture: Gesture = gestureMap[su] ?: defaultGesture
            furhat.gesture(gesture, async = true)
        }
//        if (splitResponse[res].trim().isNotEmpty()) {
//            furhat.say(splitResponse[res].trim())
//        }
//        for (emo in emojis) {
//            if(emo.isNotEmpty()){
//                val code = emo
////                call(textgesture(code))
//            }
            res+=1
////            if (splitResponse[res].trim().isNotEmpty()) {
////                furhat.say(splitResponse[res].trim())
////            }

        terminate()
    }

}