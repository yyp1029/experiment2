package test;

import demo01.Instance;
import demo02.MainAndOther;
import demo03.ObjectModel;
import demo04.PipeFilter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("<<<<<欢迎使用>>>>>");
            System.out.println("请选择您要进行的操作:");
            System.out.println("1.处理文件");
            System.out.println("2.查看原理");
            System.out.println("3.退出");

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    disposeFile();
                    break;
                case 2:
                    displayPrinciple();
                    break;
                case 3:
                    System.out.println("感谢使用");
                    return;
                default:
                    System.err.println("输入有误！！！");
                    break;
            }
        }

    }

    private static void displayPrinciple() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要选择的方法：");
        System.out.println("1.事件系统");
        System.out.println("2.主系统与子系统");
        System.out.println("3.面向对象");
        System.out.println("4.管道/过滤器");

        int select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("事件系统：事件系统是一种基于事件和消息传递的软件设计方法，" +
                        "它将系统中的各个部分抽象为事件和消息的发送者和接收者，通过事件和消息的传递来实现系统的协作和交互。" +
                        "事件系统的软件体系结构风格可以帮助开发人员更好地实现系统的解耦和模块化，提高系统的灵活性和可扩展性。\n");
                break;
            case 2:
                System.out.println("主程序-子程序：这种软件体系结构风格将软件系统分解为一个主程序和多个子程序，" +
                        "主程序负责协调和控制整个系统的运行，而子程序则负责执行具体的功能。" +
                        "这种结构可以帮助开发人员更好地组织和管理系统的各个部分，提高系统的可维护性和可扩展性。\n");
                break;
            case 3:
                System.out.println("面向对象：面向对象是一种基于对象和类的软件设计方法，它将系统中的各个部分抽象为对象，" +
                        "并通过类来定义对象的属性和行为。面向对象的软件体系结构风格可以帮助开发人员更好地组织和管理系统的各个部分，" +
                        "提高系统的可重用性和可扩展性。\n");
                break;
            case 4:
                System.out.println("管道-过滤器：管道-过滤器是一种基于数据流和处理管道的软件设计方法，" +
                        "它将系统中的各个部分抽象为数据流和处理管道，通过管道和过滤器的组合来实现系统的功能。" +
                        "管道-过滤器的软件体系结构风格可以帮助开发人员更好地实现系统的模块化和复用，提高系统的可维护性和可扩展性。\n");
                break;
            default:
                System.err.println("输入有误！！！");
                break;
        }
    }

    private static void disposeFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件的输出路径：");
        String input = sc.next();
        System.out.println("请输入文件的输出路径：");
        String output = sc.next();

        System.out.println("请输入您要选择的方法：");
        System.out.println("1.事件系统");
        System.out.println("2.主系统与子系统");
        System.out.println("3.面向对象");
        System.out.println("4.管道/过滤器");

        int select = sc.nextInt();

        Model model;
        switch (select) {
            case 1:
                model = new Instance(input, output);
                model.start();
                break;
            case 2:
                model = new MainAndOther(input, output);
                model.start();
                break;
            case 3:
                model = new ObjectModel(input, output);
                model.start();
                break;
            case 4:
                model = new PipeFilter(input, output);
                model.start();
                break;
            default:
                System.err.println("输入有误！！！");
                break;
        }
    }
}
