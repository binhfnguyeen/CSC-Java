package com.heulwen.DoiTuong.Class;

public class Word {
    private String english;
    private String vietnamese;
    private String example;

    public Word(String english, String vietnamese, String example) {
        this.english = english;
        this.vietnamese = vietnamese;
        this.example = example;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return String.format("Từ: %s - Nghĩa: %s - Ví dụ: %s%n", english, vietnamese, example);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Word word = (Word) obj;
        return english.equalsIgnoreCase(word.english);
    }

    @Override
    public int hashCode() {
        return english.toLowerCase().hashCode();
    }
}
