package Game;

public class BoardProperties {
    private Limit limit;
    private Visit visit;
    private End end;

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit() {
        this.visit = Visit.VISITED;
    }


}
