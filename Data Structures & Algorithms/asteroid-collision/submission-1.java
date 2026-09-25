class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> data = new Stack<>();

        for(int a : asteroids){
            if(data.isEmpty() && a != 0){
                data.push(a);
            } else{
                if(a < 0){
                    while(!data.isEmpty() && a < 0 && data.peek() > 0){
                        int diff = a + data.peek();
                        if(diff < 0){
                            data.pop();
                        } else if(diff > 0){
                            a = 0;
                        } else{
                            a = 0;
                            data.pop();
                        }
                    }
                    if(a!=0){
                        data.push(a);
                    }
                } else if(a > 0){
                    while(!data.isEmpty() && a > 0 && data.peek() < 0){
                        int diff = a + data.peek();
                        if(diff < 0){
                            data.pop();
                        } else if(diff > 0){
                            a = 0;
                        } else{
                            a = 0;
                            data.pop();
                        }
                    }
                    if(a != 0){
                        data.push(a);
                    }
                }
            }
        }

        int[] result = new int[data.size()];
        int i = 0;
        for(int d : data){
            result[i] = d;
            i++;
        }

        return result;
    }
}