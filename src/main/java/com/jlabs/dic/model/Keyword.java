package com.jlabs.dic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Keyword {

    private Integer id;

    private String keyword;

    private List<Term> terms;

    public Keyword(String keyword) {
        this.keyword = keyword;
        this.terms = new ArrayList<Term>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
        return Objects.equals(keyword, keyword1.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword);
    }
}
