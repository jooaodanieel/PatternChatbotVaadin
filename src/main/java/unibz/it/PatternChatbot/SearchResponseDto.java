package unibz.it.PatternChatbot;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class SearchResponseDto {
    private DesignPatterns designPatterns;
    private PatternQuestion patternQuestion;
    private ArrayList<String> excludedTags;
    private String nextSearchTag;
    @JsonCreator
    public SearchResponseDto(@JsonProperty("designPatterns") DesignPatterns designPatterns, @JsonProperty("patternQuestion") PatternQuestion patternQuestion, @JsonProperty("excludedTags")  ArrayList<String> excludedTags, @JsonProperty("nextSearchTag") String nextSearchTag) {
        this.designPatterns = designPatterns;
        this.patternQuestion = patternQuestion;
        this.excludedTags = excludedTags;
        this.nextSearchTag = nextSearchTag;
    }

    public DesignPatterns getDesignPatterns() {
        return designPatterns;
    }

    public void setDesignPatterns(DesignPatterns designPatterns) {
        this.designPatterns = designPatterns;
    }

    public PatternQuestion getPatternQuestion() {
        return patternQuestion;
    }

    public void setPatternQuestion(PatternQuestion patternQuestion) {
        this.patternQuestion = patternQuestion;
    }

    public ArrayList<String> getExcludedTags() {
        return excludedTags;
    }

    public void setExcludedTags(ArrayList<String> excludedTags) {
        this.excludedTags = excludedTags;
    }

    public String getNextSearchTag() {
        return nextSearchTag;
    }

    public void setNextSearchTag(String nextSearchTag) {
        this.nextSearchTag = nextSearchTag;
    }
}
