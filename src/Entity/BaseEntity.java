package Entity;

import Utility.PersonelVeDepartmanUtility;

public class BaseEntity {

    Long id;
    Long createDate;
    Long updateDate;
    boolean isactive;

    public BaseEntity() {
        this.id = PersonelVeDepartmanUtility.idOlustur();
        this.createDate = System.currentTimeMillis();
        this.updateDate = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
}
