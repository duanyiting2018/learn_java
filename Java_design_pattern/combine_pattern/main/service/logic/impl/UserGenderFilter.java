package combine_pattern.main.service.logic.impl;

import combine_pattern.main.service.logic.BaseLogic;

import java.util.Map;

public class UserGenderFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
