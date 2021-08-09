package combine_pattern.test;

import com.alibaba.fastjson.JSON;
import combine_pattern.main.model.aggregates.TreeRich;
import combine_pattern.main.model.vo.EngineResult;
import combine_pattern.main.model.vo.TreeNode;
import combine_pattern.main.model.vo.TreeNodeLink;
import combine_pattern.main.model.vo.TreeRoot;
import combine_pattern.main.service.engine.IEngine;
import combine_pattern.main.service.engine.impl.TreeEngineHandle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class combine_test {
    private TreeRich treeRich;
    @Before
    public void init(){
        TreeNode treeNode1=new TreeNode();
        treeNode1.setTreeId(10001L);
        treeNode1.setTreeNodeId(1L);
        treeNode1.setNodeType(1);
        treeNode1.setNodeValue(null);
        treeNode1.setRuleKey("userGender");
        treeNode1.setRuleDesc("用户性别[男/女]");
        TreeNodeLink treeNodeLink11=new TreeNodeLink();
        treeNodeLink11.setNodeIdFrom(1L);
        treeNodeLink11.setNodeIdTo(11L);
        treeNodeLink11.setRuleLimitType(1);
        treeNodeLink11.setRuleLimitValue("man");
        TreeNodeLink treeNodeLink12=new TreeNodeLink();
        treeNodeLink12.setNodeIdFrom(1L);
        treeNodeLink12.setNodeIdTo(12L);
        treeNodeLink12.setRuleLimitType(1);
        treeNodeLink12.setRuleLimitValue("woman");
        List<TreeNodeLink> treeNodeLinkList1=new ArrayList<>();
        treeNodeLinkList1.add(treeNodeLink11);
        treeNodeLinkList1.add(treeNodeLink12);
        treeNode1.setTreeNodeLinkList(treeNodeLinkList1);
        TreeNode treeNode11=new TreeNode();
        treeNode11.setTreeId(10001L);
        treeNode11.setNodeType(1);
        treeNode11.setRuleKey("userAge");
        treeNode11.setRuleDesc("用户年龄");
        TreeNodeLink treeNodeLink111=new TreeNodeLink();
        treeNodeLink111.setNodeIdFrom(11L);
        treeNodeLink111.setNodeIdTo(111L);
        treeNodeLink111.setRuleLimitType(3);
        treeNodeLink111.setRuleLimitValue("25");
        TreeNodeLink treeNodeLink112=new TreeNodeLink();
        treeNodeLink112.setNodeIdFrom(11L);
        treeNodeLink112.setNodeIdTo(112L);
        treeNodeLink112.setRuleLimitType(5);
        treeNodeLink112.setRuleLimitValue("25");
        List<TreeNodeLink> treeNodeLinkList11=new ArrayList<>();
        treeNodeLinkList11.add(treeNodeLink111);
        treeNodeLinkList11.add(treeNodeLink112);
        treeNode11.setTreeNodeLinkList(treeNodeLinkList11);
        TreeNode treeNode12=new TreeNode();
        treeNode12.setTreeId(100001L);
        treeNode12.setTreeNodeId(12L);
        treeNode12.setNodeType(1);
        treeNode12.setRuleKey("userAge");
        treeNode12.setRuleDesc("用户年龄");
        TreeNodeLink treeNodeLink121=new TreeNodeLink();
        treeNodeLink121.setNodeIdFrom(12L);
        treeNodeLink121.setNodeIdTo(121L);
        treeNodeLink121.setRuleLimitType(3);
        treeNodeLink121.setRuleLimitValue("25");
        TreeNodeLink treeNodeLink122=new TreeNodeLink();
        treeNodeLink122.setNodeIdFrom(11L);
        treeNodeLink122.setNodeIdTo(122L);
        treeNodeLink122.setRuleLimitType(5);
        treeNodeLink122.setRuleLimitValue("25");
        List<TreeNodeLink> treeNodeLinkList12=new ArrayList<>();
        treeNodeLinkList12.add(treeNodeLink121);
        treeNodeLinkList12.add(treeNodeLink122);
        treeNode12.setTreeNodeLinkList(treeNodeLinkList12);
        TreeNode treeNode111=new TreeNode();
        treeNode111.setTreeId(100001L);
        treeNode111.setTreeNodeId(111L);
        treeNode111.setNodeType(2);
        treeNode111.setNodeValue("果实A");
        TreeNode treeNode112=new TreeNode();
        treeNode112.setTreeId(100001L);
        treeNode112.setTreeNodeId(112L);
        treeNode112.setNodeType(2);
        treeNode112.setNodeValue("果实B");
        TreeNode treeNode121=new TreeNode();
        treeNode121.setTreeId(100001L);
        treeNode121.setTreeNodeId(121L);
        treeNode121.setNodeType(2);
        treeNode121.setNodeValue("果实C");
        TreeNode treeNode122=new TreeNode();
        treeNode122.setTreeId(100001L);
        treeNode122.setTreeNodeId(122L);
        treeNode122.setNodeType(2);
        treeNode122.setNodeValue("果实D");
        TreeRoot treeRoot=new TreeRoot();
        treeRoot.setTreeId(10001L);
        treeRoot.setTreeRootNodeId(1L);
        treeRoot.setTreeName("规则决策树");
        Map<Long,TreeNode> treeNodeMap=new HashMap<>();
        treeNodeMap.put(1L,treeNode1);
        treeNodeMap.put(11L,treeNode11);
        treeNodeMap.put(12L,treeNode12);
        treeNodeMap.put(111L,treeNode111);
        treeNodeMap.put(112L,treeNode112);
        treeNodeMap.put(121L,treeNode121);
        treeNodeMap.put(122L,treeNode122);
        treeRich=new TreeRich(treeRoot,treeNodeMap);
    }
    @Test
    public void combine_test(){
        System.out.println("决策树组合结构信息：\r\n"+ JSON.toJSONString(treeRich));
        IEngine treeEngineHandle=new TreeEngineHandle();
        Map<String,String> decisionMatter=new HashMap<>();
        decisionMatter.put("gender","man");
        decisionMatter.put("age","23");
        EngineResult result=treeEngineHandle.process(10001L,"Oli45692pNKabj21",
                treeRich,decisionMatter);
        System.out.println("测试结果："+JSON.toJSONString(result));
    }
}
