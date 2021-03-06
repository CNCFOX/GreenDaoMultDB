package com.cfox.greendaomultdb.db.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

@Entity(nameInDb = "TABLE_B_B")
public class TableBb {

    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "NAME")
    private String name;
    @Generated(hash = 1632943770)
    public TableBb(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 1155458459)
    public TableBb() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
