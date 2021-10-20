package com.jlabs.dic.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Objects;

public class Term {

    private Integer id;

    @JsonBackReference
    private Keyword keyword;

    private String text;

    private Language language;

    public Term(Keyword keyword, String text, Language language) {
        this.keyword = keyword;
        this.text = text;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return Objects.equals(keyword, term.keyword) &&
                Objects.equals(language, term.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, language);
    }
}
