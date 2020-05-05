public class Main {

    public static void main(String[] args) {

        HashTable<String, String> hashTable = new HashTable();

        hashTable.add("keyOne", "Red");
        hashTable.add("keyTwo", "Blue");
        hashTable.add("keyThree", "White");

        hashTable.add("keyTwo", "BlueLagoon");
        hashTable.add("keyTwo", "BlueSmell");

        System.out.println(hashTable.get("keyTwo"));
        hashTable.remove("keyTwo");
        System.out.println(hashTable.get("keyTwo"));

        hashTable.add("keyTwo", "BlueLagoon");
        System.out.println(hashTable.get("keyTwo"));
    }
}

