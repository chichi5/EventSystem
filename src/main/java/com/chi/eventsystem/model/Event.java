package com.chi.eventsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Event {
    private int eventID; // 事件 ID
    private String type; // 類型 1.火災 2.地震災損 3.工安意外 4.異常人進出 5.貨物失竊
    private String subject; // 主旨
    private String description; // 說明
    private Date eventTime; // 發生時間
}
