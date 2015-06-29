package com.todos

class Task {
    String title
    String description
    Date startDate
    Date endDate
    Boolean isDone

    static constraints = {
        title()
        description maxSize: 5000
        startDate()
        endDate()
        isDone()
    }

    String toString() {
        "$title"
    }
}
