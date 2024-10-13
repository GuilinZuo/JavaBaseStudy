package com.ethan.test01;


/**
 * 模拟实现基于文本界面的《家庭记账软件》。
 * 该软件能够记录家庭的收入、支出，并能够打印收支明细表。
 *  项目采用分级菜单方式。主菜单如下：
 *  1 收支明细
 *  2 登记收入
 *  3 登记支出
 *  4 退 出
 *  请选择(1-4)：
 *
 *  需求说明
 *  假设家庭起始的生活基本金为10000元。
 *  每次登记收入（菜单2）后，收入的金额应累加到基本金上，并记
 *  录本次收入明细，以便后续的查询。
 *  每次登记支出（菜单3）后，支出的金额应从基本金中扣除，并记
 *  录本次支出明细，以便后续的查询。
 *  查询收支明细（ 菜单1）时，将显示所有的收入、支出名细列表
 *
 */



public class FamilyAccount {

    public static void main(String[] args){
        String details = "收支\t账户金额\t收支金额\t说 明\n";
        int moneyTotal=10000;
        while(true){
            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退   出\n");
            System.out.println("                 请选择（1-4）：");

            // 获取用户的选择：1-4
            char selection = Utility.readMenuSelection();
            if(selection == '1'){
                System.out.println("-----------------当前收支明细记录-----------------");
                System.out.println(details);
                System.out.println("-----------------------------------------------\n\n");
            }else if(selection =='2'){
                System.out.println("请输入收入金额：");
                int money = Utility.readNumber();
                System.out.println("请输入收入描述：");
                String info = Utility.readString();
                moneyTotal += money;
                details += "收入\t"+moneyTotal+"\t"+money+"\t"+info+"\n";

                System.out.println("--------------------登记完成--------------------\n");
            }else if(selection=='3'){
                System.out.println("请输入支出金额：");
                int money = Utility.readNumber();
                System.out.println("请输入支出描述：");
                String info = Utility.readString();
                moneyTotal -= money;
                details += "支出\t"+moneyTotal+"\t"+money+"\t"+info+"\n";

                System.out.println("--------------------登记完成--------------------\n");
            }else if(selection=='4'){
                System.out.println("确认是否退出y/n：");
                char isExit = Utility.readConfirmSelection();
                if(isExit=='Y'||isExit=='y'){
                    break;
                }

            }

        }
    }
}
