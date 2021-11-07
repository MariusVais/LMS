package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<User> records;

	public Database(final String filename) {
        try {
            this.records = new ArrayList<User>();
            File database = new File(filename);
            Scanner scanner = new Scanner(database);
            scanner.useDelimiter(",");
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                String[] fields = record.split("\\,");
                this.records.add(new User(fields[1], fields[2], UserType.valueOf(fields[3])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.print("Exception thrown: ");
            e.printStackTrace();
        }
    }

    public boolean hasRecord(final String username) {
        for (int i = 0; i < this.records.size(); ++i) {
            if (this.records.get(i).getUsername().equals(username)) {
                return true;
            }
        }        
        return false;
    }

    public User getRecord(final String username) {
        int i;
        for (i = 0; i < this.records.size(); ++i) {
            if (this.records.get(i).getUsername().equals(username)) {
                break;
            }
        }
        return this.records.get(i);
    }

    public String getPassword(final String username) {
        return getRecord(username).getPassword();
    }

    public UserType getUserType(final String username) {
        return getRecord(username).getUserType();
    }
}
