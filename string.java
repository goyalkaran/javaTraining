
public class string {
    
    public static void main(String[] args) {

        // StringBuilder sql=new StringBuilder("select * from products where price= ");
        StringBuffer sql=new StringBuffer("select * from products where price = ");
        

        System.out.println(sql.length());
        System.out.println(sql.capacity());
        sql.ensureCapacity(1000);
        // sql.append("hrrrrrrrrtnsurrrrr");

        // System.out.println(sql.length());
        // System.out.println(sql.capacity());

        // String sql="select * from products where price= ";
        long price=1;
        Runtime runtime=Runtime.getRuntime();
        long start_time=System.currentTimeMillis();
        System.out.println("initial "+ runtime.totalMemory()+" free "+runtime.freeMemory()+" used "+(runtime.totalMemory()-runtime.freeMemory()));
        for(price=1;price<10000000;price++){
            sql.append(price);
        }
        long curr_time=System.currentTimeMillis();
        System.out.println(curr_time-start_time);
        System.out.println("initial "+ runtime.totalMemory()+" free "+runtime.freeMemory()+" used "+ (runtime.totalMemory()-runtime.freeMemory()));

    }
}
