package combine_pattern.main.service.engine;

import combine_pattern.main.model.aggregates.TreeRich;
import combine_pattern.main.model.vo.EngineResult;
import combine_pattern.main.model.vo.TreeNode;
import combine_pattern.main.model.vo.TreeRoot;
import combine_pattern.main.service.logic.LogicFilter;

import java.util.Map;

public abstract class EngineBase extends EngineConfig implements IEngine{
    @Override
    public abstract EngineResult process(long treeId, String userId, TreeRich treeRich,
                                         Map<String, String> decisionMatter);
    protected TreeNode engineDecisionMaker(TreeRich treeRich,Long treeId,String userId,
                                           Map<String,String> decisionMatter){
        TreeRoot treeRoot=treeRich.getTreeRoot();
        Map<Long,TreeNode> treeNodeMap=treeRich.getTreeNodeMap();
        Long rootNodeId=treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo=treeNodeMap.get(rootNodeId);
        while (treeNodeInfo.getNodeType().equals(1)){
            String ruleKey=treeNodeInfo.getRuleKey();
            LogicFilter logicFilter=logicFilterMap.get(ruleKey);
            String matterValue=
                    logicFilter.matterValue(treeId,userId,decisionMatter);
            Long nextNode=
                    logicFilter.filter(matterValue,treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo=treeNodeMap.get(nextNode);
            System.out.println("决策树引擎->userId:"+treeRoot.getTreeName()+" treeId:"+
                    userId+" treeId:"+treeId+" treeNode:"+treeNodeInfo.getTreeNodeId()+
                    " ruleKey:"+ruleKey+" matterValue:"+matterValue);
        }
        return treeNodeInfo;
    }
}
