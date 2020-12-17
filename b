                if(dayOfMonth >= mcurrentdate)
//                {
//                    mcurrentdate +=30
//                    mcurrentmonth -=1
//
//                    ageDay=mcurrentdate-dayOfMonth
                    ageDay=mcurrentdate-dayOfMonth
                }
                else{

                    ageDay=mcurrentdate-dayOfMonth
                }
                if(month>mcurrentmonth)
                {
                    mcurrentmonth +=12
                    mcurrentyear -=1
                    ageMonth=mcurrentmonth-month
                }
                else{
                    ageMonth=mcurrentdate-month
                }
