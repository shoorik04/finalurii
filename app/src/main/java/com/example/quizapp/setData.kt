package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "რამდენი ლიდერი ჰყავდა საბჭოთა კავშირს?",

           "2",
           "9",
           "5",
           "7",
           4
       )
       var question2 = QuestionData(
           2,
           "ვისი მმართველობის პერიოდს ეწოდება უძრაობის ხანა?",

           "ბრეჟნევი",
           "ხრუშჩოვი",
           "ანდროპოვი",
           "გორბაჩოვი",
           1
       )
       var question3 = QuestionData(
           3,
           "ვის მმართველობის დროს დაიშალა საბჭოთა კავშირი?",

           "სტალინი",
           "გორბაჩოვის",
           "ჩერნენკო",
           "ბრეჟნევი",
           2
       )
       var question4 = QuestionData(
           4,
           "რა იყო სტალინის ნამდვილი გვარი?",

           "ბაგდასარიანი",
           "შარია",
           "ჯუღაშვილი",
           "აბესაძე",
           3
       )

       var question5 = QuestionData(
           5,
           "ვის დროს დაიწყო 5 სართულიანი კორპუსების მშენებლობა?",

           "ბაგდასარიანი",
           "დარბაიძე",
           "ხრუშოვი",
           "ხრუშჩოვი",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}