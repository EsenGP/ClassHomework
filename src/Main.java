import javax.swing.*;

public class Main {

    public static HumanParametrs esenbulat = new HumanParametrs();
    public static HumanParametrs rick = new HumanParametrs();
    public static HumanParametrs morty = new HumanParametrs();

    public static void PreCreatedHumans(){
        //Esenbulat parameters
        esenbulat.name = "Эсен";
        esenbulat.age = 16;
        esenbulat.speed = 3001;
        esenbulat.activity = "Школьник, занимается хернёй и иногда учится. Ученик IT-Куба";
        esenbulat.beauty = "Hot, Sexy, All humans on earth like his face and body with look and without";
        esenbulat.character = "Tssssssssss";
        esenbulat.strength = 99999999;

        //Rick parameters
        rick.name = "Рик";
        rick.age = 70;
        rick.speed = 109;
        rick.activity = "Уничтожение своих клонов и миров, научная деятельность. Сверхразум. Носит с собой внука Морти";
        rick.beauty = "Красивые волосы, понравился целой планете";
        rick.character = "Эгоистичный, расчётливый, любит риск";
        rick.strength = 88462;

        //Morty parameters
        morty.name = "Морти";
        morty.age = 15;
        morty.speed = 68;
        morty.activity = "Школьник, умственно отсталый. Ходит с Риком на приключения";
        morty.beauty = "Не очень привлекательный";
        morty.character = "Нытик, слаб характером, но иногда может показать силу";
        morty.strength = 53;
    }

    public static HumanParametrs user = new HumanParametrs();
    public static void NewUser(){

        user.name = JOptionPane.showInputDialog(null,"Введите своё имя");
        user.age = Integer.parseInt(JOptionPane.showInputDialog(null,"Введите свой возраст"));
        user.speed = Integer.parseInt(JOptionPane.showInputDialog(null,"Скорость по стобальной шкале"));
        user.activity = JOptionPane.showInputDialog(null,"Чем вы занимаетесь?");
        user.beauty = JOptionPane.showInputDialog(null,"Оценка вашей внешности");
        user.character = JOptionPane.showInputDialog(null,"Ваш характер");
        user.strength = Integer.parseInt(JOptionPane.showInputDialog(null,"Ваша сила по стобальной шкале"));
    }



    public static void main(String[] args){
        PreCreatedHumans();
        String answer;

        if ((JOptionPane.showConfirmDialog(null,"Хотите добавить себя?"))==0) {
            NewUser();

            answer = JOptionPane.showInputDialog(null,"Параметры какого персонажа вы хотите посмотреть?" +
                    "\n1)Эсенбулат" +
                    "\n2)Рик" +
                    "\n3)Морти" +
                    "\n4)Вы" +
                    "\nОтвет писать цифрой!");
            if (answer.equals("1")){
                answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                        "\n1)Имя" +
                        "\n2)Возраст" +
                        "\n3)Скорость" +
                        "\n4)Деятельность" +
                        "\n5)Внешность" +
                        "\n6)Характер" +
                        "\n7)Сила" +
                        "\nОтветь писать цифрой!");
                if (answer.equals("1")) JOptionPane.showMessageDialog(null,esenbulat.name);
                else if (answer.equals("2")) JOptionPane.showMessageDialog(null,esenbulat.age);
                else if (answer.equals("3")) JOptionPane.showMessageDialog(null,esenbulat.speed);
                else if (answer.equals("4")) JOptionPane.showMessageDialog(null,esenbulat.activity);
                else if (answer.equals("5")) JOptionPane.showMessageDialog(null,esenbulat.beauty);
                else if (answer.equals("6")) JOptionPane.showMessageDialog(null,esenbulat.character);
                else if (answer.equals("7")) JOptionPane.showMessageDialog(null,esenbulat.strength);
            }
            else if (answer.equals("2")) {
                answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                        "\n1)Имя" +
                        "\n2)Возраст" +
                        "\n3)Скорость" +
                        "\n4)Деятельность" +
                        "\n5)Внешность" +
                        "\n6)Характер" +
                        "\n7)Сила" +
                        "\nОтветь писать цифрой!");
                if (answer.equals("1")) JOptionPane.showMessageDialog(null,rick.name);
                else if (answer.equals("2")) JOptionPane.showMessageDialog(null,rick.age);
                else if (answer.equals("3")) JOptionPane.showMessageDialog(null,rick.speed);
                else if (answer.equals("4")) JOptionPane.showMessageDialog(null,rick.activity);
                else if (answer.equals("5")) JOptionPane.showMessageDialog(null,rick.beauty);
                else if (answer.equals("6")) JOptionPane.showMessageDialog(null,rick.character);
                else if (answer.equals("7")) JOptionPane.showMessageDialog(null,rick.strength);
            }
            else if (answer.equals("3")) {
                answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                        "\n1)Имя" +
                        "\n2)Возраст" +
                        "\n3)Скорость" +
                        "\n4)Деятельность" +
                        "\n5)Внешность" +
                        "\n6)Характер" +
                        "\n7)Сила" +
                        "\nОтветь писать цифрой!");
                if (answer.equals("1")) JOptionPane.showMessageDialog(null,morty.name);
                else if (answer.equals("2")) JOptionPane.showMessageDialog(null,morty.age);
                else if (answer.equals("3")) JOptionPane.showMessageDialog(null,morty.speed);
                else if (answer.equals("4")) JOptionPane.showMessageDialog(null,morty.activity);
                else if (answer.equals("5")) JOptionPane.showMessageDialog(null,morty.beauty);
                else if (answer.equals("6")) JOptionPane.showMessageDialog(null,morty.character);
                else if (answer.equals("7")) JOptionPane.showMessageDialog(null,morty.strength);
            }
            else if (answer.equals("4")) {
                answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                        "\n1)Имя" +
                        "\n2)Возраст" +
                        "\n3)Скорость" +
                        "\n4)Деятельность" +
                        "\n5)Внешность" +
                        "\n6)Характер" +
                        "\n7)Сила" +
                        "\nОтветь писать цифрой!");
                if (answer.equals("1")) JOptionPane.showMessageDialog(null,user.name);
                else if (answer.equals("2")) JOptionPane.showMessageDialog(null,user.age);
                else if (answer.equals("3")) JOptionPane.showMessageDialog(null,user.speed);
                else if (answer.equals("4")) JOptionPane.showMessageDialog(null,user.activity);
                else if (answer.equals("5")) JOptionPane.showMessageDialog(null,user.beauty);
                else if (answer.equals("6")) JOptionPane.showMessageDialog(null,user.character);
                else if (answer.equals("7")) JOptionPane.showMessageDialog(null,user.strength);
            }


        }
        else {
            answer = JOptionPane.showInputDialog(null,"Параметры какого персонажа вы хотите посмотреть?" +
                    "\n1)Эсенбулат" +
                    "\n2)Рик" +
                    "\n3)Морти" +
                    "\nОтвет писать цифрой!");
            if (answer.equals("1")){
                answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                        "\n1)Имя" +
                        "\n2)Возраст" +
                        "\n3)Скорость" +
                        "\n4)Деятельность" +
                        "\n5)Внешность" +
                        "\n6)Характер" +
                        "\n7)Сила" +
                        "\nОтветь писать цифрой!");
                if (answer.equals("1")) JOptionPane.showMessageDialog(null,esenbulat.name);
                else if (answer.equals("2")) JOptionPane.showMessageDialog(null,esenbulat.age);
                else if (answer.equals("3")) JOptionPane.showMessageDialog(null,esenbulat.speed);
                else if (answer.equals("4")) JOptionPane.showMessageDialog(null,esenbulat.activity);
                else if (answer.equals("5")) JOptionPane.showMessageDialog(null,esenbulat.beauty);
                else if (answer.equals("6")) JOptionPane.showMessageDialog(null,esenbulat.character);
                else if (answer.equals("7")) JOptionPane.showMessageDialog(null,esenbulat.strength);
            }
            else if (answer.equals("2")) {
                answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                        "\n1)Имя" +
                        "\n2)Возраст" +
                        "\n3)Скорость" +
                        "\n4)Деятельность" +
                        "\n5)Внешность" +
                        "\n6)Характер" +
                        "\n7)Сила" +
                        "\nОтветь писать цифрой!");
                if (answer.equals("1")) JOptionPane.showMessageDialog(null,rick.name);
                else if (answer.equals("2")) JOptionPane.showMessageDialog(null,rick.age);
                else if (answer.equals("3")) JOptionPane.showMessageDialog(null,rick.speed);
                else if (answer.equals("4")) JOptionPane.showMessageDialog(null,rick.activity);
                else if (answer.equals("5")) JOptionPane.showMessageDialog(null,rick.beauty);
                else if (answer.equals("6")) JOptionPane.showMessageDialog(null,rick.character);
                else if (answer.equals("7")) JOptionPane.showMessageDialog(null,rick.strength);
            }
            else if (answer.equals("3")) {
            answer = JOptionPane.showInputDialog(null,"Какой параметр хотите узнать?" +
                    "\n1)Имя" +
                    "\n2)Возраст" +
                    "\n3)Скорость" +
                    "\n4)Деятельность" +
                    "\n5)Внешность" +
                    "\n6)Характер" +
                    "\n7)Сила" +
                    "\nОтветь писать цифрой!");
            if (answer.equals("1")) JOptionPane.showMessageDialog(null,morty.name);
            else if (answer.equals("2")) JOptionPane.showMessageDialog(null,morty.age);
            else if (answer.equals("3")) JOptionPane.showMessageDialog(null,morty.speed);
            else if (answer.equals("4")) JOptionPane.showMessageDialog(null,morty.activity);
            else if (answer.equals("5")) JOptionPane.showMessageDialog(null,morty.beauty);
            else if (answer.equals("6")) JOptionPane.showMessageDialog(null,morty.character);
            else if (answer.equals("7")) JOptionPane.showMessageDialog(null,morty.strength);
        }
        }


    }
}
