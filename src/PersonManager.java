public class PersonManager {

    private Person[] persons = new Person[10];

    public Person[] getPersons() {
        return this.persons;
    }

    public void printPersons() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                break;
            }
            System.out.println(persons[i].toString());
        }
    }

    public void addPerson(Person person) {
        if (person == null) {
            for (int i = 0; i < persons.length; i++) {
                if (persons[i] == null) {
                    persons[i] = person;
                    break;
                }

            }
        }
    }

    public int deletePerson(String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                System.out.println("������ ������������ ��� ��� ������ ����");
                break;
            }
            if (lastName.equals(persons[i].getLastName())) {
                if (firstName.equals(persons[i].getFirstName())) {
                    index = i;
                    break;
                } else {
                    System.out.println("������ ������������ ���");
                    break;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (index == -1) {
                break;
            }
            if (i == index) {
                persons[i] = null;
                break;
            }
        }
        return index;
    }

    public void update(int index) {
        if (index == -1) {
            return;
        }
        for (int i = index; i < persons.length; i++) {
            persons[i] = persons[i + 1];
        }
    }

    public void findPerson(String firstName, String lastNme) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                System.out.println("������ ����������� ���");
                break;
            }
            if (firstName.equals(persons[i].getFirstName()) &&
                    lastNme.equals(persons[i].getLastName())) {
                int number = i + 1;
                System.out.println("������������ " + persons[i].getFirstName() + " "
                        + persons[i].getLastName() + "����������. ��� ���������� �����: " + number);
            }
        }
    }

}
