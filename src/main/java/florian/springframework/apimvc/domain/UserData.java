package florian.springframework.apimvc.domain;

import java.io.Serializable;
import java.util.List;

public class UserData implements Serializable {
    private final static long serialVersionUID = 222777119013503L;
    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
