package arrays_strings;

public class gasStation {
    public static void main(String[] args) {
        gasStation gasStation = new gasStation();
        System.out.println(gasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        System.out.println(gasStation.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
        System.out.println(gasStation.canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1}));
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current_gas = 0; int gas_total=0; int cost_total=0; int k=0; int index=0;
//        for(int i:gas){
//            gas_total+=i;
//        }
//        for(int i:cost){
//            cost_total+=i;
//        }
        for(int i=0;i<gas.length;i++){
            gas_total+=gas[i];
            cost_total+=cost[i];
        }

        if(gas_total<cost_total){
            index = -1;
        }
        else{
            for(int i=0;i<gas.length;i++){
                current_gas = current_gas+gas[i]-cost[i];
                if(current_gas <0){
                    current_gas=0;
                    k=i+1;
            }
                else{
                    index = k;
                }
        }
        }
        return index;
    }
}
