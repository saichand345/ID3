import java.util.*;
/*
 * A utility class which maps the features of an attribute to corresponding integer values.
 * '?' is mapped to '0' for every attribute.
 */
public class Mapper {
	HashMap<String,Integer> hm;
	ArrayList<HashMap> list ;
	Mapper()
	{
		 hm=new HashMap<String,Integer>();
		 list=new ArrayList<HashMap>();
		 hm.put("?",0);             //age:
		 hm.put("left",1);
		 hm.put("right",2);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);               //workclass:
		 hm.put("Private",1);
		 hm.put("Self-emp-not-inc",2);
		 hm.put("Self-emp-inc",3);
		 hm.put("Federal-gov",4);
		 hm.put("Local-gov",5);
		 hm.put("State-gov",6);
		 hm.put("Without-pay",7);
		 hm.put("Never-worked",8);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                  //fnlwgt:
		 hm.put("left",1);
		 hm.put("right",2);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                     //education:
		 hm.put("Bachelors",1);
		 hm.put("Some-college",2);
		 hm.put("11th",3);
		 hm.put("HS-grad",4);
		 hm.put("Prof-school",5);
		 hm.put("Assoc-acdm",6);
		 hm.put("Assoc-voc",7);
		 hm.put("9th",8);
		 hm.put("7th-8th",9);
		 hm.put("12th",10);
		 hm.put("Masters",11);
		 hm.put("1st-4th",12);
		 hm.put("10th",13);
		 hm.put("Doctorate",14);
		 hm.put("5th-6th",15);
		 hm.put("Preschool",16);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);               //education-num:
		 hm.put("left",1);
		 hm.put("right",2);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                   //marital-status:
		 hm.put("Married-civ-spouse",1);
		 hm.put("Divorced",2);
		 hm.put("Never-married",3);
		 hm.put("Separated",4);
		 hm.put("Widowed",5);
		 hm.put("Married-spouse-absent",6);
		 hm.put("Married-AF-spouse",7);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                       //occupation:
		 hm.put("Tech-support",1);
		 hm.put("Craft-repair",2);
		 hm.put("Other-service",3);
		 hm.put("Sales",4);
		 hm.put("Exec-managerial",5);
		 hm.put("Prof-specialty",6);
		 hm.put("Handlers-cleaners",7);
		 hm.put("Machine-op-inspct",8);
		 hm.put("Adm-clerical",9);
		 hm.put("Farming-fishing",10);
		 hm.put("Transport-moving",11);
		 hm.put("Priv-house-serv",12);
		 hm.put("Protective-serv",13);
		 hm.put("Armed-Forces",14);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                //relationship:
		 hm.put("Wife",1);
		 hm.put("Own-child",2);
		 hm.put("Husband",3);
		 hm.put("Not-in-family",4);
		 hm.put("Other-relative",5);
		 hm.put("Unmarried",6);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                          //race:
		 hm.put("White",1);
		 hm.put("Asian-Pac-Islander",2);
		 hm.put("Amer-Indian-Eskimo",3);
		 hm.put("Other",4);
		 hm.put("Black",5);
		 list.add(hm);

		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);
		 hm.put("Female",1);
		 hm.put("Male",2);
		 list.add(hm);


		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                //capital-gain:
		 hm.put("left",1);
		 hm.put("right",2);
		 list.add(hm);


		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                  //capital-loss:
		 hm.put("left",1);
		 hm.put("right",2);
		 list.add(hm);


		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                        //hours-per-week:
		 hm.put("left",1);
		 hm.put("right",2);
		 list.add(hm);


		 hm=new HashMap<String,Integer>();
		 hm.put("?",0);                           //native-country:
		 hm.put("United-States",1);
		 hm.put("Cambodia",2);
		 hm.put("England",3);
		 hm.put("Puerto-Rico",4);
		 hm.put("Canada",5);
		 hm.put("Germany",6);
		 hm.put("Outlying-US(Guam-USVI-etc)",7);
		 hm.put("India",8);
		 hm.put("Japan",9);
		 hm.put("Greece",10);
		 hm.put("South",11);
		 hm.put("China",12);
		 hm.put("Cuba",13);
		 hm.put("Iran",14);
		 hm.put("Honduras",15);
		 hm.put("Philippines",16);
		 hm.put("Italy",17);
		 hm.put("Poland",18);
		 hm.put("Jamaica",19);
		 hm.put("Vietnam",20);
		 hm.put("Mexico",21);
		 hm.put("Portugal",22);
		 hm.put("Ireland",23);
		 hm.put("France",24);
		 hm.put("Dominican-Republic",25);
		 hm.put("Laos",26);
		 hm.put("Ecuador",27);
		 hm.put("Taiwan",28);
		 hm.put("Haiti",29);
		 hm.put("Columbia",30);
		 hm.put("Hungary",31);
		 hm.put("Guatemala",32);
		 hm.put("Nicaragua",33);
		 hm.put("Scotland",34);
		 hm.put("Thailand",35);
		 hm.put("Yugoslavia",36);
		 hm.put("El-Salvador",37);
		 hm.put("Trinadad&Tobago",38);
		 hm.put("Peru",39);
		 hm.put("Hong",40);
		 hm.put("Holand-Netherlands",41);
		 list.add(hm);


	}

}



