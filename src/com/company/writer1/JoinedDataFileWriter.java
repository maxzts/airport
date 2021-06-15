package com.company.writer1;

import com.company.entity.JoinedDataItem;
import com.company.util.JoinedDataItemUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



    public class JoinedDataFileWriter {
        private String filepath;

        public JoinedDataFileWriter(String filepath) {
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

