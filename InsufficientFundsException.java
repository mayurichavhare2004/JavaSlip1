package slip10;


import java.io.*;

class InsufficientFundsException extends Exception
{
}


class SavingAccount
{
                int ano;
                                String name;
                float bal;
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                SavingAccount(int a,String nm,float b)
                {
                                ano=a;
                                                name=nm;
                                                bal=b;
                }

                void withdraw() throws Exception
                {
                                System.out.println("Enter amount to be withdraw ");
                                float amt=Integer.parseInt(br.readLine());
                                try
                                {
                                                if(amt>bal || bal<500 )
                                                                throw new InsufficientFundsException();
                                                else
                                                {
                                                                bal=bal-amt;
                                                                System.out.println("Withdarawl amt successfully ....");
                                                }
                                }
                                catch(InsufficientFundsException ob)
                                {
                                                System.out.println("Insufficient Balance");
                                }
                }
                void deposit() throws Exception
                {
                                System.out.println("Enter amount to be withdraw ");
                                float amt=Integer.parseInt(br.readLine());
                                bal=bal+amt;
                                System.out.println("Deposit amt successfully ....");
                }
                void viewBalance()
                {
                                System.out.println("Balance "+bal);
                }
}
