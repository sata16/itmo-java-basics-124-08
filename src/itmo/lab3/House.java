package itmo.lab3;

import java.util.Date;

public class House {
    private Integer numberFloor;
    private int buildYear;
    private NameHouse namehouse;

    public House(){

    }

    @Override
    public String toString() {
        return "House{" +
                "numberFloor=" + numberFloor +
                ", buildYear=" + buildYear +
                ", namehouse=" + namehouse +
                '}';
    }

    //метод для установки всех значений
    public void initialize(Integer numberFloor,int buildYear,NameHouse namehouse){
        this.numberFloor = numberFloor;
        this.buildYear = buildYear;
        this.namehouse = namehouse;
    }
    //метод для вывода всех значений
    public String printHouse(){
        if(ageHouse(this.buildYear)==0){
            return "Error year";
        }
        else {

            return ("Этаж = " + this.numberFloor + "\nГод постройки = " + this.buildYear +
                    "\nНаименование = " + this.namehouse + "\nКоличество лет = " + ageHouse(this.buildYear));
        }

    }
    //метод подсчета количества лет с момента постройки
    public Integer ageHouse(int buildYear){
        if(buildYear == 0 || buildYear>= 2024){
            return 0;
        }
        else{
            int current_year = 2024;
            return current_year - buildYear;
        }

    }
}
