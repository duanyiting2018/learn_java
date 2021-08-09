package combine_pattern.main.service.engine.impl;

import combine_pattern.main.model.aggregates.TreeRich;
import combine_pattern.main.model.vo.EngineResult;
import combine_pattern.main.model.vo.TreeNode;
import combine_pattern.main.service.engine.EngineBase;

import java.util.Map;

public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode=engineDecisionMaker(treeRich,treeId,userId,decisionMatter);
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
