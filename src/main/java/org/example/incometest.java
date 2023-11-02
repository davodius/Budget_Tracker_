package org.example;

import java.io.IOException;

public class incometest {

    public static void main(String[] args) throws IOException {

        // skapa instans av IncomeStorage
        IncomeStorage incomeStorage = new IncomeStorage();
        // läser in fil det första vi gör
        incomeStorage.readFile();

        Income income = new Income("1" ,"232323", 100);
        incomeStorage.addIncome(income);
        //incomeStorage.removeIncome(income.getId());

        incomeStorage.saveFile();

        // skapa en Income med alla fält
        // har kommenterat ut nu för du får fixa till Income och Transaction
        // kolla printscreen jag skicka till dig
        //Income income = new Income();

        // när du skapat en Icome ska du testa din addIncome metod
        // du skicka in income som du skapade här
        //incomeStorage.addIncome(income);

        // till sist testar du att spara
        // kolla om du ser din income i din json fil!
    }





    {
    {



        /*
       1. Skapa Income - ok.
       2.Börja jobba i IncomeStorage, när du testar gör gärna det i en typ testklass inte i din meny - ok.
         När du säker på att det funkar då kan du börja jobba med metoderna i menyn.
       3.I IncomeStorage ska du göra följande metoder:
        readFile()
        addIncome() testa den innan du lägger in menyn
        saveFile()
        removeIncome() kolla på kod exempel i modul 7 MapExample
        updateIncome() fundera lite på hur du gör, tex hämta med nyckel sen kanske setter

        När du klar med Income gör du exakt likadant med Expense

        Sen kan du lägga ihop de med din meny

       */


        }

    }

}