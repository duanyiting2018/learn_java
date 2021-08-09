package combine_pattern.main.service.engine;

import combine_pattern.main.model.aggregates.TreeRich;
import combine_pattern.main.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {
    EngineResult process(final long treeId, final String userId, TreeRich treeRich,
                         final Map<String,String> decisionMatter);
}
