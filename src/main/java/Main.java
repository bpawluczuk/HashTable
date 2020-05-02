public class Main {
    public static void main(String[] args) {
        System.out.print("Hash Table");

        HashTable<String, String> hashTable = new HashTable();

        hashTable.add("keyOne", "Red");
        hashTable.add("keyTwo", "Blue");
        hashTable.add("keyThree", "White");

        hashTable.add("keyTwo", "BlueLagoon");
    }
}

