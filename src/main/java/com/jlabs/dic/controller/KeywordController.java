package com.jlabs.dic.controller;

import com.jlabs.dic.model.Keyword;
import com.jlabs.dic.model.Language;
import com.jlabs.dic.model.Term;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KeywordController {

    @RequestMapping(value = "/keywords", method = RequestMethod.GET)
    @ResponseBody
    public List<Keyword> list() {

        List<Keyword> keywords = new ArrayList<>();

        Keyword keyword = new Keyword("com.jlabs.model.Entity");
        Language language = new Language("Português", "pt_BR");
        language.setId(20);
        keyword.addTerm(new Term(keyword, "Entidade", language));
        keywords.add(keyword);

        keyword = new Keyword("com.jlabs.model.Entities");
        keyword.addTerm(new Term(keyword, "Entidades", language));
        keywords.add(keyword);

        keyword = new Keyword("com.jlabs.model.Model");
        keyword.addTerm(new Term(keyword, "Modelo", language));
        keywords.add(keyword);

        keyword = new Keyword("com.jlabs.model.Value");
        keyword.addTerm(new Term(keyword, "Valor", language));
        keywords.add(keyword);

        keyword = new Keyword("com.jlabs.model.Money");
        keyword.addTerm(new Term(keyword, "Dinheiro", language));
        keywords.add(keyword);

        return keywords;
    }
}
