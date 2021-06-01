package edu.lee;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.*;

public class ExcelDataListener extends AnalysisEventListener<ExcelData> {
    private List<ExcelData> rows = new ArrayList<>();
    private List<String> heads = new ArrayList<>();

    @Override
    public void invoke(ExcelData data, AnalysisContext context) {
        rows.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context){
        Map<Integer, String> sortedHeads = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        sortedHeads.putAll(headMap);
        heads = new ArrayList<>(sortedHeads.values());
    }

    public List<String> getHeads(){
        return heads;
    }

    public List<ExcelData> getRows(){
        return rows;
    }
}
