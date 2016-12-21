package map.db;

import java.io.IOException;

/**
 * Created by jiang on 2016/12/19 0019.
 */
public class Pagemanager {
    MStorage storage;
    public Pagemanager(MStorage storage) {
        this.storage = storage;
    }

    /**
     * Getfreepanages int [ ].
     *
     * @param recsize the recsize记录大小
     * @return the int [ ] 从0开始的pageindex
     */
//0开始
    public int[] getfreepanages(int recsize) {
        int sum = (recsize-1) / Pagesize.page_size + 1;
        int[] ints = new int[sum];
        int index = 0;
        for (int i = 33; i < Pagesize.max_page_number; i++) {
//            if (!MStorage.bitSet.get(i + 1)) {
//                ints[index++] = i;
//                MStorage.bitSet.set(i+1,true);
//                if (index >= sum) {
//                    break;
//                }
//            }
        }
        return ints;
    }
    public static void main(String[] args) throws IOException {
        Pagemanager pagemanager = new Pagemanager(new MStorage("d", false, true, false));
        int[] getfreepanages = pagemanager.getfreepanages(4097);
        System.out.println(getfreepanages[0]);
        System.out.println(getfreepanages.length);

    }

}