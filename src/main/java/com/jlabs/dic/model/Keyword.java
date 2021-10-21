package com.jlabs.dic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Keyword {

    private Integer id;

    private String key;

    private List<Term> terms;

    public Keyword(String keyword) {
        this.key = keyword;
        this.terms = new ArrayList<Term>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Term> getTerms() {
        return terms;
    }

    public void addTerm(Term term) {
        this.getTerms().add(term);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyword keyword1 = (Keyword) o;
        return Objects.equals(key, keyword1.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
