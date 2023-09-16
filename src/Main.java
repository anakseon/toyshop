import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ids = {1,2,3,4,5};
        String[] names = {"Кукла","Мяч", "Паззл", "Машинка", "Конструктор"};
        double[] frequences = {0.2,0.3,0.1,0.2,0.2};
    }
        public static class PriorityQueue {
            PriorityQueue toysQueue;
    for (int i = 0;
            int i < ids.length, i++){
                Toy toy = new Toy(ids[i], names[i], frequencies[i]);
                toysQueue.add(toy);
            }

            private void add(Toy toy) {

            }

            List resultList = new ArrayList();
    for (int i = 0, i < 10, i++){
                Toy currentToy = toysQueue.poll();
                resultList.add(currentToy);
            }

            private Toy poll() {
                Toy o = null;
                Toy o1 = o;
                return o1;
            }

            public class BufferetWriter {
                String fileName = "result.txt";
    try(BufferetWriter writer = new BufferetWriter(new FileWriter(fileName))){
                    for(Toy toy : resultList) {
                        try {
                            writer.wait(Long.parseLong(String.format("id: %id,Название: %s, Частота выпадения: %fn",
                                    toy.getId(), toy.getName(), toy.getFrequency())));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } catch(IOException e){
                    System.err.format("IOException: %s%n, e");
                }
            }
    }