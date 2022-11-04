public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание-1, задание - 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем! Ты достиг совершеннолетия!");
        }
        if (age < 18) {
            System.out.println("К сожалению совершеннолетие еще не достигнуто - нужно немного подождать");
        }
        System.out.println("Домашнее задание - 1, задание - 2 ");
        int age1 = 18;
        if (age1 >= 7 && age1< 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("Домашнее задание-1, задание - 3");
        int seatsOccupied = 62;
        if (seatsOccupied >= 102) {
            System.out.println("В вагоне мест нет");
        }
        if (seatsOccupied >= 60) {
            System.out.println("В вагоне есть только стоячие места");
        }
        if (seatsOccupied < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        System.out.println("Домашнее задание-2, задание - 1");
        int age2 = 27;
        if (age2 >= 18) {
            System.out.println("Поздравляем! Ты достиг совершеннолетия!");
        } else {
            System.out.println("К сожалению совершеннолетие еще не достигнуто - нужно немного подождать");
        }
        System.out.println("Домашнее задание - 2, задание - 2 ");
        int age3 = 25;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age3 >= 18 && age3 <24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("Домашнее задание-2, задание - 3");
        int seatsOccupied1 = 5;
        if (seatsOccupied1 >= 102) {
            System.out.println("В вагоне мест нет");
        } else if (seatsOccupied1 >= 60) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        System.out.println("Домашнее задание-3, задание - 1");
        int ageSearch = 28;
        if (ageSearch >= 2 && ageSearch < 7) {
            System.out.println("Если возраст человека равен " + ageSearch + ", то ему нужно ходить в детский сад");
        }else if (ageSearch >= 7 && ageSearch < 18) {
            System.out.println("Если возраст человека равен " + ageSearch + ", то ему нужно ходить в школу");
        }else if (ageSearch >= 18 && ageSearch < 24) {
            System.out.println("Если возраст человека равен " + ageSearch + ", то ему нужно ходить в университет");
        }else if (ageSearch >= 24) {
            System.out.println("Если возраст человека равен " + ageSearch + ", то ему нужно ходить на работу");
        }
        System.out.println("Домашнее задание-3, задание - 2");
        int ageChild = 12;
        if (ageChild < 5) {
            System.out.println("Кататься на аттракционе ЗАПРЕЩЕНО");
        }else if (ageChild > 5 && ageChild < 14) {
            System.out.println("Кататься на аттракционе можно только в сопровождении взрослого. Если взрослого нет, то кататься нельзя!");
        }else if (ageChild > 14 && ageChild < 18) {
            System.out.println("Можно кататься без сопровождения взрослого.");
        }
        System.out.println("Домашнее задание-3, задание - 3");
        int one = 32;
        int two = 12;
        int three = 25;
        if (one > two && one > three) {
            System.out.println("Число one большее из трех чисел и равно " + one);
        }else if (two > one && two > three) {
            System.out.println("Число two большее из трех чисел и равно " + two);
        }else if (three > one && three > two) {
            System.out.println("Число three большее из трех чисел и равно " +three);
        }



    }
}