package Inter;

public class Arr {

/*
	Array 1: 3,6,78,89,100
	Array 2: 40,50,51,80,101

			3-40
			6 - 50
			78 - 80
			89 - 101
*/
public static void main(String[] args) {

	int arr1[]={3,6,78,89,100};
    int arr2[]={40,50,51,80,101};


    for(int i=0;i<arr1.length;i++) {

            if (arr1[i] < arr2[i]) {
                System.out.println(arr1[i] + "-" + arr2[i]);

        }
            else if (arr1[i] < arr2[i+1]) {
            System.out.println(arr1[i] + "-" + arr2[i+1]);
           

        }

    }


}

}
