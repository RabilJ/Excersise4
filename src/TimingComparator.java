import java.util.Comparator;

public class TimingComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null && o2 != null)
            return -1;
        if (o1!=null&&o2==null)
            return 1;

        if (o1.getTiming()!=0&&o2.getTiming()!=0){
            if (o1.getTiming()>o2.getTiming())
                return 1;
            else if(o1.getTiming()==o2.getTiming())
                return 0;
            else
                return -1;
        }

        else if (o1.getTiming()==0 && o2.getTiming()!=0)
            return -1;
        else if(o1.getTiming()!=0&&o2.getTiming()==0)
        return 1;
        else
            return 0;
    }
}
