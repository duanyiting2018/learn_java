package combine_pattern.main.service.logic;

import combine_pattern.main.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public abstract class BaseLogic implements LogicFilter{
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        for (TreeNodeLink nodeLine:treeNodeLineInfoList){
            if (decisionLogic(matterValue,nodeLine)){
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return null;
    }
    private boolean decisionLogic(String matterValue,TreeNodeLink nodeLink){
        switch (nodeLink.getRuleLimitType()){
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitType());
            case 2:
                return Double.parseDouble(matterValue)>Double.
                        parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue)<Double.
                        parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue)<=Double.
                        parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue)>=Double.
                        parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
