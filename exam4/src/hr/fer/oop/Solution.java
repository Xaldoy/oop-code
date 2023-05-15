package hr.fer.oop;

import java.util.*;

class Solution implements StudentDatabase {
    private Map<String, Map<String, Integer>> database;

    public Solution() {
        database = new LinkedHashMap<>();
    }

    @Override
    public void addEntry(String student, String course, int score) {
        if (!database.containsKey(student)) {
            Map<String, Integer> courseMap = new HashMap<>();
            courseMap.put(course, score);
            database.put(student, courseMap);
        } else {
            Map<String, Integer> studentData = database.get(student);
            studentData.put(course, score);
        }
    }

    @Override
    public Integer getScore(String student, String course) {
        if (database.containsKey(student)) {
            Map<String, Integer> studentData = database.get(student);
            if (studentData.containsKey(course)) {
                return studentData.get(course);
            }
        }
        return null;
    }

    @Override
    public Collection<String> getInsertionOrderedStudentsByCourse(String course) {
        List<String> students = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> entry : database.entrySet()) {
            String student = entry.getKey();
            Map<String, Integer> studentData = entry.getValue();
            if (studentData.containsKey(course)) {
                students.add(student);
            }
        }
        return students;
    }
}
