package com.example.dataclasshomework.dataclass

fun main() {

    val languageList = listOf(
        LanguageNew("Java"),
        LanguageNew("Kotlin")
    )

    val teacherList = listOf(
        TeacherNew("Николай", 37, 12, languageList),
        TeacherNew("Кирилл", 12, 12, languageList),
        TeacherNew("Анастасия", 7, 5, languageList),
        TeacherNew("Евгений", 2, 1, languageList)
    )

    val experiencedTeacher = getExperiencedTeacher(
        experience = 5, teacherList = teacherList
    )

    if (experiencedTeacher.isNotEmpty()) {
        println(experiencedTeacher)
    } else {
        println("Учитель с таким опытом не найден")
    }
}

private fun getExperiencedTeacher(
    experience: Int,
    teacherList: List<TeacherNew>
): List<String> {

    val filteredTeacherList = teacherList.filter {
        it.progExperience > experience
    }.map {
        it.name
    }
    return filteredTeacherList
}