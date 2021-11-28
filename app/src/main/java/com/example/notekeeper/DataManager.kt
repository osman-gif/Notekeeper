package com.example.notekeeper

object DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses(){

        var course = CourseInfo("android_intents", "android programming with intents")
        courses[course.courseId] = course

        course = CourseInfo("android-async","android async programming and services")
        courses[course.courseId] = course

        course = CourseInfo("java-lang","java fundamentals : the java language")
        courses[course.courseId] = course
        course = CourseInfo("java-core","java fundamentals : the core platform")
        courses[course.courseId] = course
    }

    private fun initializeNotes(){
        var course = CourseInfo("android_intents","android programming with intents")
        var note = NoteInfo(course, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(course, "Delegating intents",
            "PendingIntents are powerful; they delegate much more than just a component invocation")
        notes.add(note)

        course = CourseInfo("android-async", "android async programming and services")
        note = NoteInfo(course, "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?")
        notes.add(note)
        note = NoteInfo(course, "Long running operations",
            "Foreground Services can be tied to a notification icon")
        notes.add(note)

        course = CourseInfo("java-lang", "java fundamentals : the java language")
        note = NoteInfo(course, "Parameters",
            "Leverage variable-length parameter lists")
        notes.add(note)
        note = NoteInfo(course, "Anonymous classes",
            "Anonymous classes simplify implementing one-use types")
        notes.add(note)

        course = CourseInfo("java-core", "java fundamentals : the core platform")
        note = NoteInfo(course, "Compiler options",
            "The -jar option isn't compatible with with the -cp option")
        notes.add(note)
        note = NoteInfo(course, "Serialization",
            "Remember to include SerialVersionUID to assure version compatibility")
        notes.add(note)
    }
}
