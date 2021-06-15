package com.company.writer;

import com.company.entity.JoinedDataItem;
import com.company.util.JoinedDataItemUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JoinedDataFileWriter1 {

    private String filepath;

    public JoinedDataFileWriter1(String filepath) {
        this.filepath = filepath;
    }
    public void write(List<JoinedDataItem> items) {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (JoinedDataItem item : items) {
                String str = JoinedDataItemUtil.madeString(item);
                writer.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
