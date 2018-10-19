import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer>{
    @Override
    public int compare(Computer o1, Computer o2) {
        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null && o2 != null)
            return -1;
        if (o1!=null&&o2==null)
            return 1;

        if (o1.getMemory()!=0&&o2.getMemory()!=0){
            if (o1.getMemory()>o2.getMemory())
                return 1;
            else if(o1.getMemory()==o2.getMemory())
                return 0;
            else
                return -1;
        }

        else if (o1.getMemory()==0 && o2.getMemory()!=0)
            return -1;
        else if(o1.getMemory()!=0&&o2.getMemory()==0)
            return 1;
        else
            return 0;
    }
}
